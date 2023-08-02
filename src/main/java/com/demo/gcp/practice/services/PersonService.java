package com.demo.gcp.practice.services;

import com.demo.gcp.practice.model.Person;
import com.demo.gcp.practice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> getAllPersons() {
        return repository.findAll();
    }
}
