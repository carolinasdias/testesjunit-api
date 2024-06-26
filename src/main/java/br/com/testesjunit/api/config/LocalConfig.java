package br.com.testesjunit.api.config;

import br.com.testesjunit.api.domain.User;
import br.com.testesjunit.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;


    public void startDB() {
        User u1 = new User(null, "Joao", "joao@mail.com", "123");
        User u2 = new User(null, "Maria", "maria@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
