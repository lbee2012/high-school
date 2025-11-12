package org.example.springcustomauthwithdb.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service("auth")
public class AuthService {
    //get riel
    public Authentication getAuth() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
    //username
    public String getUsername() {
        return this.getAuth().getName();
    }
    //any roles
    public List<String> getRoles() {
        return this.getAuth().getAuthorities().stream()
                .map(auth -> auth.getAuthority().substring(5)).toList();
    }
    //login?
    public boolean isAuthenticated() {
        String username = this.getUsername();
        return (username != null && !username.equals("anonymousUser"));
    }
    //which roles
    public boolean hasAnyRole(String... roles) {
        var grantedRoles = this.getRoles();
        return Stream.of(roles).anyMatch(grantedRoles::contains);
    }
}
