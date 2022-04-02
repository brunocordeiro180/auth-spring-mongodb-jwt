package br.com.brunocordeiro.ms.authserver.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document("users")
@Data
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String username;
    private String password;

    @DBRef
    private Set<Role> roles = new HashSet<>();

    public User(String name, String username, String email, String password){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
