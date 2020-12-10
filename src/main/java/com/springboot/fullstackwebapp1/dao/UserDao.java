package com.springboot.fullstackwebapp1.dao;

import com.springboot.fullstackwebapp1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
