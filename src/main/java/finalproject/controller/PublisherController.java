/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.controller;


import finalproject.model.Publisher;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author natalis
 */
public class PublisherController extends AbstractController<Publisher> {
    
    public PublisherController(){
        super();
    }
    public PublisherController(Publisher p){
        super(p);
    }

    @Override
    public List<Publisher> getData() {
        List<Publisher> list =session.createQuery("from Publisher").list();
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


