/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        
        
        UserController uc = new UserController();
        uc.setEntitet(u);
        
        try {
            uc.create();
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
