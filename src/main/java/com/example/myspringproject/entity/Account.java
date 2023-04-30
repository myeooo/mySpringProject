package com.example.myspringproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

@Entity
@Getter
@Setter
@ToString
@Table (name = "account")
public class Account extends AbstractEntity {
    public static Set<Long> personNumberMap = new HashSet<>();
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
    private Timestamp phoneNumber;
    @ManyToMany
    @JoinTable(
            name = "account_role",
            joinColumns = @JoinColumn(name = "account_id") ,
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
}