
package finalproject.controller;

import finalproject.model.User;
import finalproject.util.BookException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author natalis
 */
public class UserController extends PersonController <User> {
    
    public User authorisation (String email, char[] password){
       
        User user = (User)session
                .createQuery("from User u where u.email=:email")
                .setParameter("email", email)
                .getSingleResult();
        if(user==null){
            return null;
        }
        return BCrypt.checkpw(new String(password),user.getPassword()) ? user : null;
    }
    

    @Override
    public List<User> getData() {
        return session.createQuery("from User").list();
    }
    @Override
    protected void controlDelete() throws BookException{
        
    }
    
}
