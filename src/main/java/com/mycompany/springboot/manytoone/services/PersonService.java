/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springboot.manytoone.services;

import com.mycompany.springboot.manytoone.models.Person;
import com.mycompany.springboot.manytoone.repositories.PersonRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public ArrayList<Person> getAllPersons() {
        return (ArrayList<Person>) personRepository.findAll();
    }

    public Person savePerson(Person persona) {
        return personRepository.save(persona);
    }

    public Person getPersonByID(Long id) {
        return personRepository.findById(id).get();
    }

    public ArrayList<Person> getPersonByApellido(String apellido) {
        return personRepository.findByApellido(apellido);
    }

    public boolean removePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Person findById(Long personId) {
        return personRepository.findById(personId).get();
    }

}
