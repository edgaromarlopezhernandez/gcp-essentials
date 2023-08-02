package com.demo.gcp.practice.utils;

import com.demo.gcp.practice.model.Person;
import com.demo.gcp.practice.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class CLRTest implements CommandLineRunner {
    @Autowired
    private PersonRepository repository;
    @Value("${gcp.secret-manager.test-secret-prop}")
    private String testProp;

    @Override
    public void run(String... args) throws Exception {
        Person newPerson = Person.builder()
                .name("Edgar")
                .age(31)
                .build();

        Optional<Person> personOptional = Optional.of(repository.save(newPerson));
        if(personOptional.isPresent()) {
            log.info("DB was initialized with 1 person!");
        } else {
            log.error("DB is empty!");
        }
        log.info("Test prop: " + testProp);
    }
}
