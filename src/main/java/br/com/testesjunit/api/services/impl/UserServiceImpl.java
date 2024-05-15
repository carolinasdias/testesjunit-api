package br.com.testesjunit.api.services.impl;

import br.com.testesjunit.api.domain.User;
import br.com.testesjunit.api.domain.dto.UserDto;
import br.com.testesjunit.api.repositories.UserRepository;
import br.com.testesjunit.api.services.UserService;
import br.com.testesjunit.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDto obj) {
        return repository.save(mapper.map(obj, User.class));
    }
}
