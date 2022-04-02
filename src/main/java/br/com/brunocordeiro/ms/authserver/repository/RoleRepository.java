package br.com.brunocordeiro.ms.authserver.repository;

import br.com.brunocordeiro.ms.authserver.entity.Role;
import br.com.brunocordeiro.ms.authserver.entity.RoleEnum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(RoleEnum name);
}
