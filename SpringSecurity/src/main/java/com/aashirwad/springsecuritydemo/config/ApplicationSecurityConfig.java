package com.aashirwad.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//Using the below annotation we dedicate a class to make rules and changes in regards
// to the security of our application
@EnableWebSecurity
// https://www.baeldung.com/spring-boot-security-autoconfiguration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Here I want to authorize any request using the basic authentication
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
        // With basic authentication we do not have a default route for logout
        // if we try to hit that url it doesn't land us to proper place until we have created it.
        // in the basic authentication for every request the username and password are sent
    }
}
