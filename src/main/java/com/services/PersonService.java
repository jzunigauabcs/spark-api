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
    
    private static ArrayList<Person> persons = new ArrayList<Person>();

    public PersonService() {
        for (int i = 0; i < arrayPersons.length; i++) {
            Person person = new Person();
            person.setId(Integer.parseInt(arrayPersons[i][0]));
            person.setName(arrayPersons[i][1]);
            person.setEmail(arrayPersons[i][2]);
            persons.add(person);
        }
    }
    
    public ArrayList<Person> getAll() {
        return persons;
    }
    
    public Person get(int id) {
        Person person = null;
        for (Person p : persons) {
            if(id == p.getId()) {
                person = p;
                break;
            }
        }
        return person;
    }
    
    public Person getByEmail(String email) {
       Person person = null;
        for (Person p : persons) {
            if(email.equals(p.getEmail())) {
                person = p;
                break;
            }
        }
        return person;
    }
    
    public void save(Person person) {
        persons.add(person);
    }
}
