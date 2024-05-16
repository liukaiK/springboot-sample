package com.springboot.sample.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_sys_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint unsigned not null")
    protected Long id;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
