package com.example.springdemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAndSet() {
        User user = User.builder().name("Sachin").email("st@gmail.com").build();
        assertEquals("Sachin", user.getName());
        assertEquals("st@gmail.com", user.getEmail());
        System.out.println(user);
    }

    @Test
    void testingPhoneAndUserameAndWebsite() {
        User user1 = User.builder().username("schn").phone("641819").website("www.schn.com").build();
        assertEquals("schn", user1.getUsername());
        assertEquals("641819", user1.getPhone());
        assertEquals("www.schn.com",user1.getWebsite());
    }
}