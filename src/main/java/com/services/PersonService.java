/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;
import com.models.Person;
import java.util.ArrayList;
/**
 *
 * @author jzuniga
 */
public class PersonService {
    private String[][] arrayPersons = {
        {"1", "Norma", "norma@mail.com"}, 
        {"2", "Elías", "elias@mail.com"}, 
        {"3", "Casandra", "casandra@mail.com"}, 
        {"4", "Juan", "juan@mail.com"}};

    
    public ArrayList<Person> getAll() {
        ArrayList <Person> persons = new ArrayList<>();
        for (String[] arrayPerson : arrayPersons) {
            Person person = new Person();
            person.setId(Integer.parseInt(arrayPerson[0]));
            person.setName(arrayPerson[1]);
            person.setEmail(arrayPerson[2]);
            persons.add(person);
        }
        return persons;
    }
    
    public Person get(int id) {
        Person person = null;
        for (String[] arrayPerson : arrayPersons) {
            if(id == Integer.parseInt(arrayPerson[0])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setName(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        return person;
    }
    
    public Person getByEmail(String email) {
        Person person = null;
        for (String[] arrayPerson : arrayPersons) {
            if(email.equals(arrayPerson[2])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setName(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        return person;
    }
}
