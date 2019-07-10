package com.arwestdeveloper.swaggeruiap.service;


import com.arwestdeveloper.swaggeruiap.models.Person;
import com.arwestdeveloper.swaggeruiap.repository.HobbyRepository;
import com.arwestdeveloper.swaggeruiap.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl {

    @Autowired
    private PersonRepository personRepository;


    @Autowired
    private HobbyRepository hobbyRepository;


    public Person create(Person person) {
        Person savedPerson = personRepository.save(person);
        if (!CollectionUtils.isEmpty(person.getHobbies())) {
            person.getHobbies().forEach(hobby -> {
                hobby.setPerson(savedPerson);
                hobbyRepository.save(hobby);
            });
        }
        return savedPerson;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findOne(Long idPerson) {
        return personRepository.findById(idPerson).orElse(null);
    }

    public List<Person> findByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    public void delete(Long idPerson) {
        personRepository.deleteById(idPerson);
    }
}

