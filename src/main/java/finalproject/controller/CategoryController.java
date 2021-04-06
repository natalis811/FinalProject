/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.controller;

import finalproject.model.Category;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author natalis
 */
public class CategoryController extends AbstractController<Category> {
    
    public CategoryController(){
        super();
    }
    public CategoryController(Category c){
        super(c);
    }

    @Override
    public List<Category> getData() {
        List<Category> list =session.createQuery("from Category").list();
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
    

