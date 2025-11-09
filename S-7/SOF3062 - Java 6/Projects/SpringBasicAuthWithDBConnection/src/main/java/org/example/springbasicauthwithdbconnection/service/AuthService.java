package org.example.springbasicauthwithdbconnection.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service("auth")
public class AuthService {
    public Authentication getAuth() {
        return SecurityContextHolder.getContext().getAuthentication();
    }git
    public String getUsername() {
        return this.getAuth().getName();
    }
    public List<String> getRoles() {
        return this.getAuth().getAuthorities().stream().map(auth -> auth.getAuthority().substring(5)).toList();
    }
    public boolean isAuthenticated() {
        String username = this.getUsername();
        return (username != null && !username.equals("anonymousUser"));
    }
    public boolean hasAnyRole(String... roles) {
        var grantedRoles = this.getRoles();
        return Stream.of(roles).anyMatch(grantedRoles::contains);
    }
}
