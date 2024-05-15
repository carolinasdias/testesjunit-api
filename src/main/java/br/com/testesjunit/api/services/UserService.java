package br.com.testesjunit.api.services;

import br.com.testesjunit.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
