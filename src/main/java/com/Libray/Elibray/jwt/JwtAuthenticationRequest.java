package com.Libray.Elibray.jwt;

import lombok.Data;

@Data
public class JwtAuthenticationRequest {
    
    private String userName;
    private  String password;
}
