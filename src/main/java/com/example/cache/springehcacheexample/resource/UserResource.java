package com.example.cache.springehcacheexample.resource;

import com.example.cache.springehcacheexample.cache.UserCache;
import com.example.cache.springehcacheexample.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/search")
public class UserResource {

    @Autowired
    private UserCache userCache;
    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name){
        return userCache.getUser(name);
    }
}
