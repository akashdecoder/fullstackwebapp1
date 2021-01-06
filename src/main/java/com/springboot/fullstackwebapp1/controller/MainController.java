package com.springboot.fullstackwebapp1.controller;

import com.springboot.fullstackwebapp1.model.User;
import com.springboot.fullstackwebapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/user")
//public class MainController {
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public User addNewUser(@RequestBody User user) {
//        return this.userService.addUser(user);
//    }
//
//    @RequestMapping(value = "/updateuser", method = RequestMethod.PUT,
//            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public User updateUser(@RequestBody User user) {
//        return this.userService.updateUser(user);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Optional<User> getUser(@PathVariable Long id) {
//        return this.userService.getUserById(id);
//    }
//
//    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
//    public void deleteAllUsers() {
//        this.userService.deleteAllUsers();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteUser(@PathVariable Long id) {
//        this.userService.deleteUserById(id);
//    }
//
//}
