package common.plugin.authority.config;

import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

public class MybatisPlusPaginationConfig {
	/**
	 *分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLimit(100);
        return paginationInterceptor;
    }
}
