package com.restapp.restapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.restapp.restapp.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
