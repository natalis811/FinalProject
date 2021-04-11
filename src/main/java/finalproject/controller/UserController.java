package finalproject.controller;

import finalproject.model.User;
import finalproject.util.BookException;
import java.util.List;
import org.hibernate.CacheMode;
import org.mindrot.jbcrypt.BCrypt;

public class UserController extends PersonController <User> {    

    public User authorisation (String email, char[] password){       
        User user = (User) session
                .createQuery("from User u where u.email=:email")
                .setParameter("email", email)
                .getSingleResult();
        if (user==null) {
            return null;
        }
        return BCrypt.checkpw(new String(password), user.getPassword()) ? user : null;
    }
    
    public User createUser (User u) {        
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        return u;        
    }    

    @Override
    public List<User> getData() {
        List<User> list = session.createQuery("from User").list();
        session.setCacheMode(CacheMode.IGNORE);
        return list; 
    }
    @Override
    protected void controlDelete() throws BookException{
        
    }
    
}