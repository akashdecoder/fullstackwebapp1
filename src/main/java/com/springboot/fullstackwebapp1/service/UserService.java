package com.springboot.fullstackwebapp1.service;

import com.springboot.fullstackwebapp1.dao.UserDao;
import com.springboot.fullstackwebapp1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    public User addUser(User user) {
        return this.userDao.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return this.userDao.findById(id);
    }

    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    public void deleteUserById(Long id) {
        this.userDao.deleteById(id);
    }

    public void deleteAllUsers() {
        this.userDao.deleteAll();
    }
}
