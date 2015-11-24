//package com.nexient.nbcu.orbit.config;
//
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
///**
// * Created by kraichura on 11/16/2015.
// */
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/orbit/order/**").authenticated()
//                .antMatchers(HttpMethod.PUT, "/orbit/order/**").authenticated()
//                .antMatchers(HttpMethod.DELETE, "/orbit/order/**").authenticated()
//                .antMatchers(HttpMethod.POST, "/orbit/deal/**").authenticated()
//                .antMatchers(HttpMethod.PUT, "/orbit/deal/**").authenticated()
//                .antMatchers(HttpMethod.DELETE, "/orbit/deal/**").authenticated()
//                .anyRequest().permitAll()
//                .and()
//                .httpBasic().and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//}
