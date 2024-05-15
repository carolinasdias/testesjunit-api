package br.com.testesjunit.api.services;

import br.com.testesjunit.api.domain.User;
import br.com.testesjunit.api.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDto obj);

}
