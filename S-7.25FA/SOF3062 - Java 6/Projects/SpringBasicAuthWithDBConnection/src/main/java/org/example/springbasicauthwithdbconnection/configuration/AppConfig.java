package org.example.springbasicauthwithdbconnection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class AppConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(DataSource ds, PasswordEncoder pe) {
        return new JdbcUserDetailsManager(ds);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);
        http.cors(AbstractHttpConfigurer::disable);
        http.authorizeHttpRequests(ar -> {
            ar.requestMatchers("/poly/url1").authenticated();
            ar.requestMatchers("/poly/url2").hasAnyRole("USER");
            ar.requestMatchers("/poly/url3").hasAnyRole("ADMIN");
            ar.requestMatchers("/poly/url4").hasAnyRole("BOTH");
            ar.anyRequest().permitAll();
        });
        http.formLogin(AbstractAuthenticationFilterConfigurer::permitAll);
        http.rememberMe(config -> {
            config.tokenValiditySeconds(3*24*60*60);
        });

        return http.build();
    }
}
