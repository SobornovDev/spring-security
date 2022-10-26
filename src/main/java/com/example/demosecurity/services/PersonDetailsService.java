package com.example.demosecurity.services;

import com.example.demosecurity.models.Person;
import com.example.demosecurity.repositories.PeopleRepository;
import com.example.demosecurity.security.PersonDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author : Sobornov Vladimir
 * @since : 26.10.2022
 **/

@Service
@RequiredArgsConstructor
public class PersonDetailsService implements UserDetailsService {

    private final PeopleRepository peopleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = peopleRepository.findByUsername(username);

        if (!person.isPresent()) {
            throw new UsernameNotFoundException("User " + username + " not found");
        } else {
            return new PersonDetails(person.get());
        }
    }
}
