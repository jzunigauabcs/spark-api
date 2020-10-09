/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;
import com.models.Person;
import java.util.ArrayList;
import static com.db.ConnectionFactory.getConnection;
import static com.config.Database.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jzuniga
 */
public class PersonService {

    public PersonService() {
    }
    
    public ArrayList<Person> getAll() {
        ArrayList<Person> persons = new ArrayList<Person>();
        String  query = "SELECT * FROM " + T_PERSON;
        Connection conn = getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("nombre"));
                p.setEmail(rs.getString("email"));
                persons.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return persons;
    }
    
    public Person get(int id) {
        Person person = null;
       String query = "SELECT * FROM " + T_PERSON + " WHERE " + T_PERSON_ID + " = ?";
       Connection conn = getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()) {
                person = new Person();
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("nombre"));
                person.setEmail(rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }
    
    public Person getByEmail(String email) {
       Person person = null;
        
        return person;
    }
    
    public void save(Person person) {
        //persons.add(person);
    }
}
