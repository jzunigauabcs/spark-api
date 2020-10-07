package com.routes;

import com.google.gson.Gson;
import com.controllers.PersonController;
import com.models.Person;
import static spark.Spark.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jzuniga
 */
public class PersonRoute {

    public PersonRoute() {
        Gson gson = new Gson();
        
        PersonController personController = new PersonController();
        get("/person", (req, res) -> {
            res.type("application/json");
            if(req.queryParams().size() > 0)
                return personController.showByEmail(req, res);
            else
                return personController.index(req, res);
        },gson::toJson);
        get("/person/:id", "application/json",(req, res)-> {
            res.type("application/json");
            return personController.show(req, res);
        }, gson::toJson);
        post("/person", (req, res)-> {
            return personController.store(req, res);                    
        });
    }
    
}
