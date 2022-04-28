package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface RoleService {

    void saveRole(Role role);


    Set<Role> findAllRole();


    void deleteById(long id);


    Role findById(long id);


    void updateRole(Role role);

    Set<Role> getRoles(String[] roles);
}
