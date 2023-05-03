package com.example.crud.controller;

import com.example.crud.dto.PersonDTO;
import com.example.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/v1")
public class PeronController {
    @Autowired
    private PersonService personService;
    @GetMapping("/{email}")
    public PersonDTO getPersonDetails(@PathParam("email") String email){
        return null;
    }

    @PostMapping()
    public PersonDTO savePersonDetails(@RequestBody PersonDTO personDTO){
        return personService.savePerson(personDTO);
    }

    @GetMapping("/ping")
    public String getPersonDetails(){
        return "Service is on";
    }
}
