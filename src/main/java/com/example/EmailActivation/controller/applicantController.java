package com.example.EmailActivation.controller;

import com.example.EmailActivation.model.Applicant;
import com.example.EmailActivation.model.User;
import com.example.EmailActivation.repository.applicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicants")
public class applicantController {

    @Autowired
    private applicantRepository applicantRepository;

    @GetMapping("/all")
    public List<Applicant> getStudent() {
        return applicantRepository.getAll();
    }

    @PostMapping()
    public Applicant addApplicant(@RequestBody Applicant applicant){
        Applicant save = applicantRepository.save(applicant);
        return applicantRepository.getOne(save.getId());
    }

}
