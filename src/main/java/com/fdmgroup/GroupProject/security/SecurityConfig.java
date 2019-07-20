package com.fdmgroup.GroupProject.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



	@Override
	protected void configure(HttpSecurity http) throws Exception { // unterschied zwischen roles und granted authority

		http.authorizeRequests().antMatchers("/h2/**").permitAll().antMatchers("/css/**", "/js/**","/img/**", "/register").permitAll()
				.antMatchers("/admin/**").hasRole("admin")
				.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout()
				.permitAll().and();
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}

	@Bean
	DaoAuthenticationProvider authenticationProvider(MyUserDetailsService service) {

		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(service);
		authProvider.setPasswordEncoder(encoder());

		return authProvider;

	}

	@Bean
	public PasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}

}
