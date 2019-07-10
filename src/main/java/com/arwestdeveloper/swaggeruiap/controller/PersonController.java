package com.arwestdeveloper.swaggeruiap.controller;


import com.arwestdeveloper.swaggeruiap.models.Person;
import com.arwestdeveloper.swaggeruiap.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @GetMapping("person")
    public List<Person>findAll(){
        return personService.findAll();

    }

    @PostMapping("person")
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }

    @GetMapping("/{personId}")
    public Person findOne(@PathVariable("personId") Long personId){
        return personService.findOne(personId);

    }
    @GetMapping("/find/{firstName}")
    public List<Person>findByFirstName(@PathVariable("firstName") String firstName){
        return personService.findByFirstName(firstName);
    }
    @DeleteMapping("/{personId}")
    public void delete(@PathVariable("personId") Long personId){
        personService.delete(personId);
    }


}
