package com.example.EmailActivation.controller;


import com.example.EmailActivation.model.Applicant;
import com.example.EmailActivation.model.Form;
import com.example.EmailActivation.model.User;
import com.example.EmailActivation.repository.applicantRepository;
import com.example.EmailActivation.repository.formRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forms")
public class formController {

    @Autowired
    private formRepository formRepository;

    @GetMapping("/all")
    public List<Form> getForms() {
        return formRepository.getAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    public void updateForm(@PathVariable int id,@RequestBody Form form){
        Form update = formRepository.getOne(id);
        update.setId(form.getId());
        update.setApplicantId(form.getApplicantId());
        update.setIsApproved(form.getIsApproved());
        update.setApprovedBy(form.getApprovedBy());
        update.setComments(form.getComments());
        update.setMessage(form.getMessage());
        formRepository.save(update);
    }

    @PostMapping()
    public Form addForm(@RequestBody Form form){
        Form save = formRepository.save(form);
        System.out.println("applicant created");
        return formRepository.getOne(save.getId());
    }
}
