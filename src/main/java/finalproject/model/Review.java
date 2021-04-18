
package finalproject.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="review")
public class Review extends AbstractEntity {
    
    @NotNull (message= " Review text can not be null")
    @NotEmpty (message= "Review text can not be empty")
    private String text;
    
    private Integer rating;
    
    @NotNull (message= " Review date can not be null")
    private Date date;
    
    @ManyToOne
    private Book book; //vise recenzija za 1 knjigu
    @ManyToOne
    private User user; //vise recenzija od 1 korisnika?
    
    
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
    
    public String toString (){
        return getText();
    }
    
}
