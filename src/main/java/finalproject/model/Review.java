
package finalproject.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="review")
public class Review extends Main {
    
    private String text;
    private Integer rating;
    private Date date;
    @ManyToOne
    private Book book; //vise osvrta za 1 knjigu
    @ManyToOne
    private User user; //vise osvrta od 1 korisnika?

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
