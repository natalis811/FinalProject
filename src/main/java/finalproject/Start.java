
package finalproject;

import finalproject.util.HibernateUtil;
import finalproject.util.InitData;
import finalproject.view.IntroScreen;
import org.hibernate.Session;

/**
 *
 * @author natalis
 */
public class Start {
    
    public static void main(String[] args) {
        
        //Session s = HibernateUtil.getSession();
        
        //System.out.println(s.getMetamodel().getEntities().size());
        //InitData.start(); 
        
        new IntroScreen().setVisible(true);
        
    }
    
}
