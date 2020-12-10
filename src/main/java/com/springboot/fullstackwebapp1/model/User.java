package com.springboot.fullstackwebapp1.model;

import javax.persistence.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "WEBAPP_USERS")
public class User {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FIRST_NAME", nullable = true, length = 255)
    private String first_name;

    @Column(name = "LAST_NAME", nullable = true, length = 255)
    private String last_name;

    @Column(name = "EMAIL", nullable = true, length = 255)
    private String email;

    @Column(name = "CONTACT", nullable = true, length = 10)
    private Integer phone;

    @Column(name = "PASSWORD", nullable = true, length = 255)
    private String password;



}