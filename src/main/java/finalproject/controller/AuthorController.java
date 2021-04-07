/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.controller;

import finalproject.model.Author;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author natalis
 */
    
 public class AuthorController extends AbstractController<Author> {
    
    public AuthorController(){
        super();
    }
    public AuthorController(Author a){
        super(a);
    }

    @Override
    public List<Author> getData() {
        List<Author> list =session.createQuery("from Author").list();
        session.setCacheMode(CacheMode.IGNORE);
        return list;
       
    }

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

