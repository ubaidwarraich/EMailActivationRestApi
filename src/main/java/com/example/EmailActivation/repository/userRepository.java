package com.example.EmailActivation.repository;

import com.example.EmailActivation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface userRepository extends JpaRepository<User,Integer> {
    @Query(value="select *from User",nativeQuery=true)
    List<User> getAll();

    User getUserByUsername(String username);
    @Query(value="Select *from User order by ID desc limit 1",nativeQuery=true)
    User getLast();
}
