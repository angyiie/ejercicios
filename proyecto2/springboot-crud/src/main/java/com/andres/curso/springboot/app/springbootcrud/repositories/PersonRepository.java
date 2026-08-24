package com.andres.curso.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.andres.curso.springboot.app.springbootcrud.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}