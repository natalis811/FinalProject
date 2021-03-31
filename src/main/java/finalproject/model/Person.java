/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class Person extends AbstractEntity {
    
    @NotEmpty(message = "First name cannot be empty")
    @NotNull(message = "First name cannot be NULL")
    private String firstName;
    
    @NotEmpty(message = "Last name cannot be empty")
    @NotNull(message = "Last name cannot be NULL")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }        
    
}

