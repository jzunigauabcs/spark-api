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
    
    public ArrayList<Person> index() {
        PersonService personService = new PersonService();
        return personService.getAll();
    }
    
    public Person show(int id) {
        PersonService personService = new PersonService();
        return personService.get(id);
    }
    
    public Person showByEmail(String email) {
        PersonService personService = new PersonService();
        return personService.getByEmail(email);
    }
}
