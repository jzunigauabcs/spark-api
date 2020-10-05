/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.models.Person;
import java.util.ArrayList;
import com.services.PersonService;
/**
 *
 * @author jzuniga
 */
public class PersonController {
    
    PersonService personService;
    public PersonController() {
        this.personService = new PersonService();
    }
    
    
    
    public ArrayList<Person> index() {
        return this.personService.getAll();
    }
    
    public Person show(int id) {
        return this.personService.get(id);
    }
    
    public Person showByEmail(String email) {
        return this.personService.getByEmail(email);
    }
    
    public void store(Person person) {
        this.personService.save(person);
    }
}
