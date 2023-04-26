package com.example.myspringproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Account extends AbstractEntity {

    @NonNull
    @Column(unique = true)
    private String userName;
    @NonNull
    @Column(unique = true)
    private String email;
    private String name;
    private String password;
    private Long personNumber;
    private Boolean isActive;
    private String securityNumber;
    @ManyToMany(mappedBy = "accountList")
    Set<Role> roles;
}