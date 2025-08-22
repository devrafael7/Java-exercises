package com.ex7.project7.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() // libera H2
                .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf.disable()) // necessário para H2
            .headers(headers -> headers.frameOptions().disable()); // H2 usa frame

        return http.build();
    }
}

