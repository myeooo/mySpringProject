package com.example.myspringproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id ;
    private String name;
    private String email;
    private String dob;
    private String phoneNumber;

}
