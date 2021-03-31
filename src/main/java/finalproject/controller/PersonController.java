/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.controller;

import finalproject.model.Person;
import finalproject.util.BookException;

public abstract class PersonController<T extends Person> extends AbstractController<T> {

    @Override
    protected void controlCreate() throws BookException {
       
    }

    @Override
    protected void controlUpdate() throws BookException {
       
    }
    
    @Override
    protected void controlDelete() throws BookException {
        
    }    
    
}
