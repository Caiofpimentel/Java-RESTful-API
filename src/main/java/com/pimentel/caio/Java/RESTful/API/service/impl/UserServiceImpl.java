package com.pimentel.caio.Java.RESTful.API.service.impl;

import com.pimentel.caio.Java.RESTful.API.domian.model.User;
import com.pimentel.caio.Java.RESTful.API.domian.repository.UserRepository;
import com.pimentel.caio.Java.RESTful.API.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists!");
        }
        return userRepository.save(userToCreate);
    }
}
