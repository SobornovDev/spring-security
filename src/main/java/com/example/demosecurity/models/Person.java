package com.example.demosecurity.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author : Sobornov Vladimir
 * @since : 26.10.2022
 **/

@Entity
@Table(name = "person")
@Getter
@Setter
@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty(message = "Username shouldn't be empty")
    @Size(min = 2, max = 100, message = "Username should be between 2 to 100 chars")
    @Column(name = "username")
    private String username;

    @Min(value = 1900, message = "Year of birth shouldn't be below 1900")
    @Column(name = "year_of_birth")
    private int year_of_birth;

    @Column(name = "password")
    private String password;

    public Person(String username, int year_of_birth, String password) {
        this.username = username;
        this.year_of_birth = year_of_birth;
        this.password = password;
    }

    public Person() {

    }
}
