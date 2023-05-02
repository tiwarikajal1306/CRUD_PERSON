package com.example.crud.service;

import com.example.crud.dto.PersonDTO;
import com.example.crud.model.Person;
import com.example.crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private CrudRepository crudRepository;

    public PersonDTO getPersonDetails(String email){

        return null;
        

    }
    
    public PersonDTO savePerson(PersonDTO personDTO){
        Person person = new Person();
        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        Person saved = crudRepository.save(person);
        System.out.println(saved);
        return personDTO;
    }

}
