package com.hottur.repository;

import com.hottur.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> getUserById(Long Id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(User createUser);
}
