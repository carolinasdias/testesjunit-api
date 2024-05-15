package br.com.testesjunit.api.services;

import br.com.testesjunit.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();

}
