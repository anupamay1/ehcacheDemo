package com.example.cache.springehcacheexample.loader;

import com.example.cache.springehcacheexample.model.Users;
import com.example.cache.springehcacheexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {
    @Autowired
    private UsersRepository usersRepository;
    @PostConstruct
    public void  load(){
        List<Users>  users = new ArrayList<>();
        users.add(new Users("Ajay","Tech",123L));
        System.out.println("uuuuuuuuuuuuuu");
        usersRepository.saveAll(users);
    }
}
