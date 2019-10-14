package pe.jaav.sistemas.JASpringAdminBoot;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableAdminServer
@Configuration
@SpringBootApplication
public class JaSpringAdminBootApplication {

	private final String adminContextPath;

	public static void main(String[] args) {
		SpringApplication.run(JaSpringAdminBootApplication.class, args);
	}

	public JaSpringAdminBootApplication(AdminServerProperties adminServerProperties) {
		this.adminContextPath = adminServerProperties.getContextPath();
	}


		/*
	@Bean
	public SecurityWebFilterChain securityWebFilterChainSecure(ServerHttpSecurity http) {

		return http.authorizeExchange()
				.pathMatchers(adminContextPath + "/assets/**").permitAll()
				.pathMatchers(adminContextPath + "/login").permitAll()
				.anyExchange().authenticated()
				.and().formLogin().loginPage(adminContextPath + "/login")
				.and().logout().logoutUrl(adminContextPath + "/logout")
				.and().httpBasic()
				.and().csrf().disable().build();

	}*/


}
