package common.plugin.authority.config;


import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import common.plugin.authority.config.support.UserTokenEnhancer;
import common.plugin.authority.utils.KeyStoreUtils;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private TokenStore jwtTokenStore;
	@Autowired
	private UserDetailsService jdbcUserDetail;
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.jdbc(dataSource);
    }
    
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    	TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(tokenEnhancer(), jwtAccessTokenConverter()));
        endpoints.authenticationManager(authenticationManager)
                 .tokenEnhancer(tokenEnhancerChain);
        endpoints.tokenStore(jwtTokenStore);
        endpoints.userDetailsService(jdbcUserDetail);
    }


    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients();
    }
    @Bean
    JwtAccessTokenConverter jwtAccessTokenConverter() {
    	JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey(KeyStoreUtils.getPrivateKey());
        converter.setVerifierKey(KeyStoreUtils.getPublicKey());
		return converter;
    }
     
    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
    
    @Bean
    public TokenEnhancer tokenEnhancer() {
    	 return new UserTokenEnhancer();
    }
}
