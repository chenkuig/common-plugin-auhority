package common.plugin.authority.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login");
        registry.addViewController("auth").setViewName("auth");
    }
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/webjars/**") .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
