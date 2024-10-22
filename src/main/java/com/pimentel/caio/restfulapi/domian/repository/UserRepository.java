package com.pimentel.caio.restfulapi.domian.repository;

import com.pimentel.caio.restfulapi.domian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);


}
