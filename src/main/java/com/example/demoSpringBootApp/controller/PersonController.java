package com.example.demoSpringBootApp.controller;

import com.example.demoSpringBootApp.entity.Person;
import com.example.demoSpringBootApp.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public void createNewPerson(@RequestBody Person person) {
        personRepository.save(person);
    }
}
