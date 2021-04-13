
package finalproject.controller;


import finalproject.model.Book;
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
        if(!entity.getBook().isEmpty()){
           StringBuilder sb = new StringBuilder();
           sb.append("Publisher can not be deleted because is used by Book : ");
           for(Book b : entity.getBook()){
               sb.append(b.getPublisher());
               sb.append(", ");
           }
           throw new BookException( sb.toString());
       }
        
        
    }

    
        
    }


