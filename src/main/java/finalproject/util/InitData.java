
package finalproject.util;

import com.github.javafaker.Faker;
import finalproject.model.Author;
import finalproject.model.Book;
import finalproject.model.Category;
import finalproject.model.Publisher;
import finalproject.model.Review;
import finalproject.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;

/**
 *
 * @author natalis
 */
public class InitData {

    private static Date date;

    
    public static void start (){
        
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        //unosenje podataka pomocu faker-a
        Faker faker = new Faker();
       
       
        for (int i=0; i<10; i++) {
            User u = new User ();
            u.setFirstName(faker.name().firstName());
            u.setLastName(faker.name().lastName());        
            s.save(u);        
        }
        
        List <Author> authors = new ArrayList<>();
        for (int i=0; i<10; i++) {            
            Author a = new Author();
            a.setFirstName(faker.name().firstName());
            a.setLastName (faker.name().lastName());
            s.save(a);
            authors.add(a);
        }
        
        //unosenje podataka pomocu faker-a za book
        //faker.book().author();
        //faker.book().publisher();
        //faker.book().title();
        
        for (int i=0; i<10;i++){
          Book book3 = new Book();
          book3.setTitle(faker.book().title());
          s.save(book3);      
        } 
        
        
        for (int i=0; i<10; i++){
            Author author1 = new Author();
            author1.setFirstName(faker.book().author());
            author1.setLastName(faker.book().author());
            s.save(author1);
        }
            
        
        
        for (int i=0; i<10; i++){
            Publisher publisher3 = new Publisher();
            publisher3.setName(faker.book().publisher());
            publisher3.setAddress(faker.book().publisher());
            publisher3.setCity(faker.book().publisher());
            publisher3.setCountry(faker.book().publisher());
            s.save(publisher3);
        }
        
        //rucno unosenje podataka
         
        User user1 = new User ();
        user1.setFirstName("Natalija");
        user1.setLastName("Santek");
        s.save(user1);
         
        Publisher publisher1 = new Publisher (); 
        publisher1.setName("Školska knjiga");
        publisher1.setAddress("Zagrebačka 24");
        publisher1.setCity("Zagreb");
        publisher1.setCountry("Hrvatska");
        s.save(publisher1);

        Publisher publisher2 = new Publisher(); 
        publisher2.setName("Znanje");
        publisher2.setAddress("Osječka 34");
        publisher2.setCity("Osijek");
        publisher2.setCountry("Hrvatska");
        s.save(publisher2);
        
        Category category1 = new Category ();
        category1.setName("Dječja knjiga");
        s.save(category1);
        
        Category category2 = new Category ();
        category2.setName("Znanstvena i stručna literatura");
        s.save(category2);
                
        Book book1 = new Book();
        book1.setTitle("Dolazi nam proljeće");
        book1.setPublished("2021");
        book1.setIsbn("978-953-500-234-6");
        book1.setCategory(category1);        
        book1.setAuthors(Arrays.asList(authors.get(new Random().nextInt(authors.size()))));
        book1.setPublisher(publisher1);
        s.save(book1);
        
        Book book2 = new Book();
        book2.setTitle("Godišnja doba");
        book2.setPublished("2018");
        book2.setIsbn("978-953-500-237-3");
        book2.setCategory(category2);     
        book2.setAuthors(Arrays.asList(
                authors.get(new Random().nextInt(authors.size())), 
                authors.get(new Random().nextInt(authors.size()))
        ));
        book2.setPublisher(publisher2);
        s.save(book2);
        
        Review review1 = new Review();
        review1.setText("Ovo je proba");
        review1.setRating(1);
        review1.setDate(date = new Date());
        review1.setBook(book2);
        review1.setUser(user1);
        s.save(review1);
                             
        s.getTransaction().commit();
    }
    
}
