package com.Security.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;

public class AppConfig {

	@Bean
	public SecurityFilterChain springSecurityConfiguration(HttpSecurity http)throws Exception{
		
		CsrfTokenRequestAttributeHandler requestHandler = new CsrfTokenRequestAttributeHandler();
		
		http.sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		http.cors(cors -> {
			cors.configurationSource(new CorsConfigurationSource() {
				
				@Override
				public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
					CorsConfiguration cfg = new CorsConfiguration();
					cfg.setAllowedOriginPatterns(Collections.singletonList("*"));
					cfg.setAllowedMethods(Collections.singletonList("*"));
					cfg.setAllowCredentials(true);
					cfg.setAllowedHeaders(Collections.singletonList("*"));
					cfg.setExposedHeaders(Arrays.asList("Authorization"));
					return cfg;
				}
			});
		}).authorizeHttpRequests(auth ->{
			auth
			.requestMatchers(HttpMethod.POST,"/customers").permitAll()
			.requestMatchers(HttpMethod.GET, "/customers","/hello").hasRole("ADMIN")
			.requestMatchers(HttpMethod.GET, "/customers/**").hasAnyRole("ADMIN","USER")
			.requestMatchers(HttpMethod.GET, "/hello").permitAll()
			.anyRequest().authenticated();
			})
		   .csrf(csrf -> csrf.csrfTokenRequestHandler(requestHandler).ignoringRequestMatchers("/notice","/contact","/customers")
				   .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
		   .addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class)
		   .addFilterAfter(new JwtTokenGeneratorFilter(), BasicAuthenticationFilter.class)
		   .addFilterBefore(new JwtTokenValidatorFilter(),BasicAuthenticationFilter.class)
		   .formLogin(Customizer.withDefaults())
		   .httpBasic(Customizer.withDefaults());
		
		
		return http.build();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
	}

	
}