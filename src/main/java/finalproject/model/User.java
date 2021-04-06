
package finalproject.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author natalis
 */
@Entity
@Table (name="user")
public class User extends Person {
    
    @NotNull(message = "Email cannot be NULL")
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    
    @NotNull(message = "Password cannot be NULL")
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    
    private boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstNameLastName(){
        return getFirstName()+ " " + getLastName();
    }
    
    
    
}   