
package finalproject.controller;

import finalproject.model.Book;
import finalproject.model.Review;
import finalproject.model.User;
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
    
    public Review findReview(Book book, User user) {
        try {
            Review review = (Review) session
                    .createQuery("from Review r where r.book=:book and r.user=:user")
                    .setParameter("book", book)
                    .setParameter("user", user)
                    .getSingleResult();
            return review;
        } catch (Exception e) {
            return null;
        }
    }
        
}

   
    



