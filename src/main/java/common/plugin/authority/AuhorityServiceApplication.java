package common.plugin.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("common.plugin.authority.mapper")
@EnableRedisHttpSession
@Configuration 
public class AuhorityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuhorityServiceApplication.class, args);
	}

}
