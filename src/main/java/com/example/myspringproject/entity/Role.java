package com.example.myspringproject.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "role")
public class Role extends AbstractEntity implements GrantedAuthority {
    private String role;
    @ManyToMany(mappedBy = "roles")

    private Set<Account> accountList = new HashSet<>();

    @Override
    public String getAuthority() {
        return role;
    }
}
