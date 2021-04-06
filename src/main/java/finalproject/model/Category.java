/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    @NotNull (message="Category Name is obligatory(category is null)")
    @NotEmpty (message="Category Name can not be empty")
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
