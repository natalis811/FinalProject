package finalproject.controller;

import finalproject.model.Book;
import finalproject.model.Category;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

public class CategoryController extends AbstractController<Category> {
    
    public CategoryController() {
        super();
    }
    
    public CategoryController(Category c) {
        super(c);
    }

    @Override
    public List<Category> getData() {
        List<Category> list = session.createQuery("from Category").list();
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
        if(!entity.getBook().isEmpty()){
           StringBuilder sb = new StringBuilder();
           sb.append("Category can not be deleted because is used in Book : ");
           for(Book b : entity.getBook()){
               sb.append(b.getCategory());
               sb.append(", ");
           }
           throw new BookException( sb.toString());
       }
        
    }    
        
}
    

