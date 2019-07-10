package com.arwestdeveloper.swaggeruiap.repository;

import com.arwestdeveloper.swaggeruiap.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person>findByFirstName(String firstName);

}
