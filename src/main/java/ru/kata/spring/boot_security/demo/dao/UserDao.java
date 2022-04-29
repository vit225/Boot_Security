package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);


    List<User> findAll();


    void deleteById(long id);


    User findById(long id);


    void updateUser(User user);

    User findByUsername(String username);
}
