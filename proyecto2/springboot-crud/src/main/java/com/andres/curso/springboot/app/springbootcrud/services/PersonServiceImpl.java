package com.andres.curso.springboot.app.springbootcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andres.curso.springboot.app.springbootcrud.entities.Person;
import com.andres.curso.springboot.app.springbootcrud.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Person findById(Long id) {
        Optional<Person> personOptional = repository.findById(id);
        return personOptional.orElse(null);
    }

    @Override
    @Transactional
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}