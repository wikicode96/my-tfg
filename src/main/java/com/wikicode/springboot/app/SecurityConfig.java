package com.wikicode.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() throws Exception {
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(
				User.withUsername("admin")
					.password(passwordEncoder().encode("admin"))
					.roles("ADMIN")
					.build());
		return manager;
	}
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
       http.httpBasic().and().authorizeHttpRequests()
        	.requestMatchers("/", "/menus", "/seleccionar-menu", "/peticion-aceptada", "/static/**", "/error/**").permitAll()
			.requestMatchers("/admin/**").hasRole("ADMIN")
			/*.anyRequest().authenticated()*/
            .and()
            .formLogin().loginPage("/login").permitAll()
            .and()
            .logout().permitAll();

        return http.build();
    }
}