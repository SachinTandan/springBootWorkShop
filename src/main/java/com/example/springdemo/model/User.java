package com.example.springdemo.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private  int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

}
