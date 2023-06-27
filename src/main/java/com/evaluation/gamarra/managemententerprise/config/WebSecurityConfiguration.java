package com.evaluation.gamarra.managemententerprise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfiguration {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests()
        .antMatchers(HttpMethod.POST,"/enterprise").permitAll()
        .antMatchers(HttpMethod.GET,"/enterprise").permitAll()
        .anyRequest().authenticated();

    return http.build();
  }
}
