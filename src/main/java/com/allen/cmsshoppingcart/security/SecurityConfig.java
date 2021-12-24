package com.allen.cmsshoppingcart.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

@Service
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/**").hasAnyRole("USER");

        // http
        // .authorizeRequests()
        // .antMatchers("/category/**").access("hasRole('ROLE_USER')")
        // .antMatchers("/").access("permitAll");
    }
}
