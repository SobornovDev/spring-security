package com.example.demosecurity.services;

import com.example.demosecurity.models.Person;
import com.example.demosecurity.repositories.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final PeopleRepository peopleRepository;

    public void save(Person person) {
        peopleRepository.save(person);
    }

}
