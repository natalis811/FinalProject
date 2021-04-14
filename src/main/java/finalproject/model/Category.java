
package finalproject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="category")
public class Category extends AbstractEntity {
    
    @NotNull (message="Category name is obligatory(category is null)")
    @NotEmpty (message="Category name can not be empty")
    private String name;
    
    @OneToMany(mappedBy = "category")
    private List<Book> book = new ArrayList<>();

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        if(getName()==null || getName().trim().isEmpty()){
            return "[Category Name is not defined.]";
        }
        return getName();
    }
}
