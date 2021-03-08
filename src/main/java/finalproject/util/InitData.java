
package finalproject.util;

import com.github.javafaker.Faker;
import finalproject.model.Author;
import finalproject.model.Publisher;
import finalproject.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author natalis
 */
public class InitData {

    
    public static void start (){
        
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        Faker faker = new Faker ();
        
        for (int i=0; i<10; i++){
            User u = new User ();
            u.setFirst_name(faker.name().firstName());
            u.setLast_name(faker.name().lastName());        
            s.save(u);        
        }
        for (int i=0; i<10; i++){
            List <Author> author = new ArrayList<>();
            Author a = new Author();
            a.setFirst_name(faker.name().firstName());
            a.setLast_name (faker.name().lastName());
            s.save(a);
        }
            Publisher p = new Publisher (); 
            p.setName("Skolska knjiga");
            p.setAddress("Zagrebacka 24");
            p.setCity("Zagreb");
            p.setCountry("Hrvatska");
            s.save(p);
            
            Publisher r = new Publisher (); 
            r.setName("Znanje");
            r.setAddress("Osjecka 34");
            r.setCity("Osijek");
            r.setCountry("Hrvatska");
            s.save(r);
            
                    
        
        s.getTransaction().commit();
    }
    
}
