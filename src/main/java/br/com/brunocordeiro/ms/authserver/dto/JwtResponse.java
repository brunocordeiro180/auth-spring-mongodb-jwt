package br.com.brunocordeiro.ms.authserver.dto;

import br.com.brunocordeiro.ms.authserver.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String id;
    private String username;
    private String name;
    private String email;
    private List<String> roles;
}
