 package common.plugin.authority.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.cors.CorsUtils;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{
    @Autowired
    private TokenStore jwtTokenStore;
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
		  .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
		  .and()
		  .authorizeRequests() 
		  .anyRequest().authenticated() 
		  .and() 
		  .csrf().disable();
    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    	super.configure(resources);
        resources.tokenStore(jwtTokenStore);
    }
    
    @Bean
    public DefaultTokenServices tokenServices(TokenStore jwtTokenStore) {
        DefaultTokenServices services = new DefaultTokenServices();
        services.setTokenStore(jwtTokenStore);
        return services;
    }
}
