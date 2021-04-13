
package finalproject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="publisher")
public class Publisher extends AbstractEntity {
    
    @NotNull (message="Publisher name is obligatory(category is null)")
    @NotEmpty (message="Publisher name can not be empty") 
    private String name;
    
    @NotNull (message="Publisher address is obligatory(category is null)")
    @NotEmpty (message="Publisher address can not be empty") 
    private String address;
    
    @NotNull (message="Publisher city is obligatory(category is null)")
    @NotEmpty (message="Publisher city can not be empty") 
    private String city;
    
    @NotNull (message="Publisher country is obligatory(category is null)")
    @NotEmpty (message="Publisher country can not be empty") 
    private String country;
    
    @OneToMany(mappedBy = "publisher")
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

@Override
    public String toString() {
        
       return  getName();
    }
    
    
    
    
}
