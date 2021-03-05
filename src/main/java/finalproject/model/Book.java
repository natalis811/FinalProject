
package finalproject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="book")
public class Book extends Main {
    
    private String title;
    private Integer published;
    private String isbn;
    private String category;
    @OneToMany
    List <Author> author = new ArrayList<>(); //1 knjiga vise autora
    @ManyToOne
    private Publisher publisher; //1 knjiga 1 izdavac

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = (List<Author>) author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
    
    
    
    
}
