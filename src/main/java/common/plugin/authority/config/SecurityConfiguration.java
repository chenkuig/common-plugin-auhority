package common.plugin.authority.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsUtils;

import common.plugin.authority.config.support.JdbcUserDetail;
import common.plugin.authority.config.support.NoEncryptPasswordEncoder;


@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
    private JdbcUserDetail jdbcUserDetail;
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/webjars/**","/resources/**");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	 http
         .authorizeRequests()
         .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
         .antMatchers("/forget-password","/change-password","/change-password-successfully", "/login","/logout")
         .permitAll()
         .and()
         .formLogin()
         .usernameParameter("username")
         .passwordParameter("password")
         .loginPage("/login")
         .permitAll()
         .and()
         .authorizeRequests()
         .anyRequest().authenticated()
         .and()
         .csrf().disable();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      //替换成自己验证规则
      auth.userDetailsService(jdbcUserDetail).passwordEncoder(passwordEncoder());;
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Bean
    public static NoEncryptPasswordEncoder passwordEncoder() {
        return new NoEncryptPasswordEncoder();
    }
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(jdbcUserDetail);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
}
