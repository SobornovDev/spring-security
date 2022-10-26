package com.example.demosecurity.repositories;

import com.example.demosecurity.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : Sobornov Vladimir
 * @since : 26.10.2022
 **/
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByUsername(String username);
}
