package com.example.myspringproject.dto;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class UserInfoDto {
    private Long id;
    private String email;
    private String name;
    private Long personNumber;
    private Long phoneNumber;
}
