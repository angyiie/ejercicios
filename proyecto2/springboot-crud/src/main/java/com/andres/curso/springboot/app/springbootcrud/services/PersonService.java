package com.andres.curso.springboot.app.springbootcrud.services;

import java.util.List;

import com.andres.curso.springboot.app.springbootcrud.entities.Person;

public interface PersonService {

    List<Person> findAll();

    Person findById(Long id);

    Person save(Person person);

    void delete(Long id);
}