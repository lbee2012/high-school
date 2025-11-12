package org.example.springcustomauthwithdb.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springcustomauthwithdb.entity.User;
import org.example.springcustomauthwithdb.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DaoUserDetailsManager implements UserDetailsService {
    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDAO userDAO = this.userDAO;
        User user = userDAO.findById(username).orElse(null);
        if (user != null) {
            String password = user.getPassword();
            String [] roles = user.getUserRole().stream()
                    .map(ur -> ur.getRole().getId().substring(5))
                    .toList().toArray(new String[0]);
            return org.springframework.security.core.userdetails.User
                    .withUsername(username)
                    .password(password)
                    .roles(roles)
                    .build();
        }
        throw new UsernameNotFoundException(username);
    }
}
