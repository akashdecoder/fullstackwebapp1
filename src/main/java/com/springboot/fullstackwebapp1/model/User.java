package com.springboot.fullstackwebapp1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = false)
    private long id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private Date date_of_birth;

    @Column
    private String emai;

    @Column
    private String password;

    public User() {
    }

    public User(long id, String first_name, String last_name, Date date_of_birth, String emai, String password) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.emai = emai;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
