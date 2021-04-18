
package finalproject.controller;

import finalproject.model.Book;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author natalis
 */
public class BookController extends AbstractController<Book> {
    
    public BookController (){
        super();
    }
    public BookController (Book b){
        super(b);
    }

    @Override
    public List<Book> getData() {
        List<Book> list =session.createQuery("from Book").list();
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
