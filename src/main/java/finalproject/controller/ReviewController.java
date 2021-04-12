
package finalproject.controller;

import finalproject.model.Review;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author natalis
 */
public class ReviewController extends AbstractController<Review> {
    
    public ReviewController (){
        super();
    }
    public ReviewController (Review r){
        super(r);
    }

    @Override
    public List<Review> getData() {
        List<Review> list =session.createQuery("from Review").list();
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
