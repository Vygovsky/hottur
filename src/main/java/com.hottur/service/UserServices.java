package com.hottur.service;

import com.hottur.entity.CreateUserForm;
import com.hottur.entity.User;

import java.util.Collection;
import java.util.Optional;

public interface UserServices {

    Optional<User> getUserById(Long Id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User createUser(User user);

}
