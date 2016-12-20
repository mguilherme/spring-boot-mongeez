package com.example.service;

import com.example.domain.Role;
import com.example.domain.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by mguilherme on 19-12-2016.
 */
//@Service
public class DataLoader {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public DataLoader(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void init() {
        userRepository.save(new User("Peter", 34));
        userRepository.save(new User("Kate", 30));
        userRepository.save(new User("Paul", 28));

        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("USER"));
    }

}
