package com.demo.gcp.practice.controllers;

import com.demo.gcp.practice.model.Person;
import com.demo.gcp.practice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }
}
