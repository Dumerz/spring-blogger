package io.dumerz.blogger.service;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.dumerz.blogger.dto.LoginRequest;
import io.dumerz.blogger.dto.RegisterRequest;
import io.dumerz.blogger.model.UserAccount;
import io.dumerz.blogger.repository.UserAccountRepository;
import io.dumerz.blogger.security.JwtProvider;

@Service
public class AuthService {
    @Autowired
    private UserAccountRepository userAccountRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtProvider jwtProvider;

    public void signup(RegisterRequest registerRequest) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(registerRequest.getUsername());
        userAccount.setEmail(registerRequest.getEmail());
        userAccount.setPassword(encodePassword(registerRequest.getPassword()));
        userAccount.setCreatedOn(Instant.now());
        userAccount.setUpdateOn(Instant.now());
        userAccountRepository.save(userAccount);
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    public String login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        return jwtProvider.generateToken(authenticate);
    }

    public Optional<User> getCurrentUser() {
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(principal);
    }
}