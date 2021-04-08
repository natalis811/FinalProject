
package finalproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="author")
public class Author extends Person {
    
    @Override
    public String toString() {
        
       return  getFirstName() + " "+ getLastName();
    }
    
    
    
}
    
    
    

