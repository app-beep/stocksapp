package com.track.stocksapp;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    public SecurityConfig() {
    }

    public void configure(final HttpSecurity httpSecurity) throws Exception {
     httpSecurity.antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
        /**
         httpSecurity
                .authorizeRequests()
                .antMatchers("/")
                .permitAll();
    */

    }
}