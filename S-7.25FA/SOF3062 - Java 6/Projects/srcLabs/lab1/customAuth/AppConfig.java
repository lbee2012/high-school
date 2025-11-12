package org.example.springcustomauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
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
        String password = pe.encode("123");
        UserDetails user1 = User.withUsername("user").password(password).roles("USER").build();
        UserDetails user2 = User.withUsername("admin").password(password).roles("ADMIN").build();
        UserDetails user3 = User.withUsername("both").password(password).roles("BOTH").build();
        return new InMemoryUserDetailsManager(user1, user2, user3);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);
        http.cors(AbstractHttpConfigurer::disable);
        http.authorizeHttpRequests(ar -> {
            ar.anyRequest().permitAll();
        });
        http.formLogin(config -> {
            config.loginPage("/auth/login");
            config.loginProcessingUrl("/auth/check");
            config.defaultSuccessUrl("/auth/success");
            config.failureUrl("/auth/failure");
            config.usernameParameter("username");
            config.passwordParameter("password");
        });
        http.rememberMe(config -> {
            config.tokenValiditySeconds(3*24*60*60);
            config.rememberMeCookieName("remember-me");
            config.rememberMeParameter("remember-me");
        });
        http.logout(config -> {
            config.logoutUrl("/auth/logout");
            config.logoutSuccessUrl("/auth/login");
            config.clearAuthentication(true);
            config.deleteCookies("remember-me");
            config.invalidateHttpSession(true);
        });
        return http.build();
    }
}
