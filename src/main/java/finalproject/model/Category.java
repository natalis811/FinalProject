/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="category")
public class Category extends AbstractEntity {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
