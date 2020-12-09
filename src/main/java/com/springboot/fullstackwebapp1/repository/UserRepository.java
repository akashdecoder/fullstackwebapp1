package com.springboot.fullstackwebapp1.repository;

import com.springboot.fullstackwebapp1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByFirst_name(String name);
}
