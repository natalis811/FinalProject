
package finalproject.util;

import finalproject.controller.UserController;
import finalproject.model.User;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author natalis
 */
public class CreateUser {
    
    public static void main(String[] args) {
        User u = new User();
        u.setFirstName("Natalija");
        u.setLastName("Santek");
        u.setEmail("natalis811@gmail.com");
        u.setPassword(BCrypt.hashpw("edunova", BCrypt.gensalt()));
        u.setAdmin(true);
        
        
        
        UserController uc = new UserController();
        uc.setEntity(u);
        
        try {
            uc.create();
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
