package com.challengescrd.challenge.controller;

import com.challengescrd.challenge.register.registerData;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serial;
import java.io.Serializable;

@RestController
@RequestMapping("users")
public class UserController {
    @PostMapping
    public void register(@RequestBody registerData data) {
        System.out.println(data);
    }
}
