package com.example.EmailActivation.repository;

import com.example.EmailActivation.model.Applicant;
import com.example.EmailActivation.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface formRepository extends JpaRepository<Form,Integer> {
    @Query(value="select *from Form",nativeQuery=true)
    List<Form> getAll();
}
