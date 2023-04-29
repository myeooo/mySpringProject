package com.example.myspringproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table (name = "account")
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
    @ManyToMany
    @JoinTable(
            name = "account_role",
            joinColumns = @JoinColumn(name = "account_id") ,
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
}