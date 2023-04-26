package com.example.myspringproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Set;
@Entity
@Getter
@Setter
@ToString
public class Role extends AbstractEntity{
    private String role;
    @ManyToMany
    @JoinTable(
            name = "account_role",
            joinColumns = @JoinColumn(name = "account_id") ,
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    Set<Account> accountList;
}
