package org.example.springbasicauthentication.configuration;

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
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder pe) {
        //Stub data
        String password = pe.encode("123");
        UserDetails user1 = User.withUsername("user").password(password).roles("USER").build();
        UserDetails user2 = User.withUsername("admin").password(password).roles("ADMIN").build();
        UserDetails user3 = User.withUsername("both").password(password).roles("BOTH").build();
        return new InMemoryUserDetailsManager(user1, user2, user3);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //reject cau hinh CSRF va CORS;
        http.csrf(AbstractHttpConfigurer::disable);
        http.cors(AbstractHttpConfigurer::disable);
        http.authorizeHttpRequests(ar -> {
            ar.requestMatchers("/poly/**").authenticated();
            ar.anyRequest().permitAll();
        });
        //thiet lap default form login;
        http.formLogin(AbstractAuthenticationFilterConfigurer::permitAll);
        http.rememberMe(config -> {
            config.tokenValiditySeconds(3*24*60*60);
        });
        return http.build();
    }
}
