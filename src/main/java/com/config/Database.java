/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

/**
 *
 * @author jzuniga
 */
public class Database {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String DB_NAME = "spark_person";
    public static final String DB_USER = "spark";
    public static final String PASSWORD = "t00r";
    public static final String QUERY_PARAMS = "?serverTimezone=UTC";
    
    public static final String T_PERSON = "person";
    public static final String T_PERSON_ID = "id";
    public static final String T_PERSON_NOMBRE = "nombre";
    public static final String T_PERSON_EMAIL = "email";
}
