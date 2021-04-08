
package finalproject.model;

import javax.persistence.Entity;
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
