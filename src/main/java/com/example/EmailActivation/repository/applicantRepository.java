package com.example.EmailActivation.repository;

import com.example.EmailActivation.model.Applicant;
import com.example.EmailActivation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface applicantRepository extends JpaRepository<Applicant, Integer> {
    @Query(value="select *from Applicant",nativeQuery=true)
    List<Applicant> getAll();
}
