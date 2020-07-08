package io.dumerz.blogger.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public String getUsername() {
        return username;
    }

}