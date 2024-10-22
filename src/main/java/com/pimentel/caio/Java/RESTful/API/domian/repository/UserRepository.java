package com.pimentel.caio.Java.RESTful.API.domian.repository;

import com.pimentel.caio.Java.RESTful.API.domian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
