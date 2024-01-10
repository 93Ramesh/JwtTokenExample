package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Ramesh","Bhoyar@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ganesh","shinde@gmail.com"));

    }

    public List<User> getUsers(){
        return this.store;

    }
}
