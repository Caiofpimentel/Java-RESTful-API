package com.pimentel.caio.Java.RESTful.API.service;

import com.pimentel.caio.Java.RESTful.API.domian.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
