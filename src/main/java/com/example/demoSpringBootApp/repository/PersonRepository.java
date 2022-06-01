package com.example.demoSpringBootApp.repository;

import com.example.demoSpringBootApp.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
