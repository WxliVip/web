package wxli.vip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import wxli.vip.interceptor.PermissionInterceptor;

@SpringBootApplication
@MapperScan("wxli.vip.dao")
@Configuration
public class WebApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	public PermissionInterceptor permissionInterceptor() {
		return new PermissionInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(permissionInterceptor())
				.excludePathPatterns("/static/*")
				.excludePathPatterns("/error")
				.addPathPatterns("/**");
	}
}
