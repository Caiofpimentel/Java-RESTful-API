package com.pimentel.caio.restfulapi.service;

import com.pimentel.caio.restfulapi.domian.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
