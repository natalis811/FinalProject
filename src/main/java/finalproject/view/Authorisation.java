/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.view;

import finalproject.controller.UserController;
import finalproject.model.User;
import java.awt.event.KeyEvent;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author natalis
 */
public class Authorisation extends javax.swing.JFrame {

    public Authorisation() {
        initComponents();
        setTitle(Application.TITLE_APP);
        
        txtEmail.setText ("natalis811@gmail.com");
        pswPassword.setText("edunova");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        jbLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbRegistration = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel2.setText("Password");

        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswPasswordKeyReleased(evt);
            }
        });

        jbLogin.setText("LOGIN");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookpic.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jbRegistration.setText("REGISTRATION");
        jbRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbLogin)
                .addGap(37, 37, 37)
                .addComponent(jbRegistration)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLogin)
                    .addComponent(jbRegistration))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
              logIn();
    }//GEN-LAST:event_jbLoginActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER
                && !txtEmail.getText().isEmpty()){
            pswPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void pswPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER
                && pswPassword.getPassword().length>0){
                logIn();
            
        }
    }//GEN-LAST:event_pswPasswordKeyReleased

    private void jbRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrationActionPerformed
        new UserForm().setVisible(true);
    }//GEN-LAST:event_jbRegistrationActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbRegistration;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void logIn() {
        
    if(txtEmail.getText().isEmpty()){
            errorControl(txtEmail, "Email is mandatory!");
            txtEmail.requestFocus();
            return;
        }
        
        try {
            InternetAddress email=new InternetAddress(txtEmail.getText());
            email.validate();
        } catch (AddressException e) {
            errorControl(txtEmail, "Email is not correct!");
            return;
        }
        
      
        if(pswPassword.getPassword().length==0){
            errorControl (pswPassword, "Need password");
            return;
        }
       UserController uc = new UserController ();
       User u = uc.authorisation(txtEmail.getText(), pswPassword.getPassword());
       
       if(u==null){
           errorControl(pswPassword,"Email and password are not correct!");
           return;
       }
        //u.setPassword(null);
        Application.user=u;
        new Menu(u).setVisible(true);
        dispose();
    
        
    }

    private void  errorControl(JComponent component, String message) {
        component.requestFocus();
        JOptionPane.showMessageDialog(rootPane, message);
         
    }
}
