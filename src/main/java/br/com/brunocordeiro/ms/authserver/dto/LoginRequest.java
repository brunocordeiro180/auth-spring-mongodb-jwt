package br.com.brunocordeiro.ms.authserver.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
