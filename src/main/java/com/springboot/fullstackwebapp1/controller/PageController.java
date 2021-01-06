package com.springboot.fullstackwebapp1.controller;


import com.springboot.fullstackwebapp1.model.User;
import com.springboot.fullstackwebapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
@RequestMapping("/webapp1/")
public class PageController {

    @Autowired
    UserService userService;

    @GetMapping("registration")
    public String registrationPage() {
        return "index.html";
    }

    @PostMapping("adduser")
    public String addUser(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
        if(result.hasErrors()) {
            System.out.println("Error! Check the code please");
            return "index.html";
        }
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String password = request.getParameter("password");
        String conf_password = request.getParameter("confirmpassword");

        if(!conf_password.equals(password)) {
            System.out.println("Password Mismatch");
            return "index.html";
        }
        user.setFirst_name(first_name);
        user.setLast_name(last_name);
        user.setEmail(email);
        user.setPhone(Long.parseLong(contact));
        user.setPassword(password);
        userService.addUser(user);
        return "redirect:registration";
    }
}
