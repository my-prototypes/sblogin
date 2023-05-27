package br.es.ufpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.core.annotation.Order;


@Order(1)
@SpringBootApplication
@EntityScan("br.es.ufpi.entity")
@EnableWebSecurity
public class MyimagesApplication extends WebSecurityConfigurerAdapter{

	public static void main(String[] args) {
		System.out.println("Aplicação Web de Teste.");
		SpringApplication.run(MyimagesApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/login").permitAll() // Permite acesso à página de login
				.antMatchers("/dashboard").authenticated() // Requer autenticação para acessar a página de dashboard
				.and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/dashboard")
				.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login");
	}

}
