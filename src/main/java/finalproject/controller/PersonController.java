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