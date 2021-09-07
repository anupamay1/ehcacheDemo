package com.example.cache.springehcacheexample.repository;

import com.example.cache.springehcacheexample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    Users findByName(String name);
}
