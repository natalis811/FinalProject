
package finalproject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author natalis
 */
@MappedSuperclass
public abstract class Main {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long id;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
