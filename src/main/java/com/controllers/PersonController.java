/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.google.gson.Gson;
import com.models.Person;
import java.util.ArrayList;
import com.services.PersonService;
import spark.Request;
import spark.Response;
/**
 *
 * @author jzuniga
 */
public class PersonController {
    
    PersonService personService;
    public PersonController() {
        this.personService = new PersonService();
    }
    
    public ArrayList<Person> index(Request req, Response res) {
        return this.personService.getAll();
    }
    
    public Person showByEmail(Request req, Response res) {
        if(req.queryParams("email") != null) {   
            String email = req.queryParams("email");
            return this.personService.getByEmail(email);
        } else
            return null;
    }
    
    public Person show(Request req, Response res) {
         int id = Integer.parseInt(req.params(":id"));
        return this.personService.get(id);
    }
    
    public String store(Request req, Response res) {
         try {
            Person person = new Gson().fromJson(req.body(), Person.class);
            this.personService.save(person);
            return "Success";
        } catch(Exception e) {
            return e.getMessage();
        }
    }
}
