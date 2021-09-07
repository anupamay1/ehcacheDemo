package com.example.cache.springehcacheexample.cache;

import com.example.cache.springehcacheexample.model.Users;
import com.example.cache.springehcacheexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class UserCache implements Serializable {

    @Autowired
    private UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {
        System.out.println("retrieving data from Database for name:" + name);
        return usersRepository.findByName(name);
    }
}
