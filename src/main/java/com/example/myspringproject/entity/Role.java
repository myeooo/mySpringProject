package com.example.myspringproject.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
@Entity
@Getter
@Setter
@ToString
@Table(name = "role")
public class Role extends AbstractEntity{
    private String role;
    @ManyToMany(mappedBy = "roles")

    private Set<Account> accountList = new HashSet<>();
}
