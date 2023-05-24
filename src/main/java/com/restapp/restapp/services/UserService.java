package com.restapp.restapp.services;

import java.util.List;
import java.util.Optional;

import com.restapp.restapp.entity.User;

public interface UserService {

    // lista de usuarios
    List<User> findAll();

    // buscar usuario por id
    Optional<User> findById(Long id);

    // guardar usuario
    User save(User user);

    // eliminar usuario
    void deleteById(Long id);
}
