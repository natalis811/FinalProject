/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.view;

import finalproject.controller.AuthorController;
import finalproject.model.Author;
import finalproject.util.BookException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author natalis
 */
public class AuthorForm extends javax.swing.JFrame {
    
    private AuthorController controller;
    
    public AuthorForm() {
        initComponents();
        controller = new AuthorController (new Author());
        setTitle(Application.TITLE_APP + "Author");
        load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstAuthor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstAuthor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAuthorValueChanged(evt);
            }
        });

        jLabel1.setText("First name:");

        jLabel2.setText("Last name:");

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lstAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lstAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd)
                    .addComponent(jbEdit)
                    .addComponent(jbDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstAuthorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAuthorValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstAuthor.getSelectedValue() == null) {
            return;
        }

        controller.setEntity(lstAuthor.getSelectedValue());

        txtFirstName.setText(controller.getEntity().getFirstName());
        if (controller.getEntity().getFirstName()!= null) {
            txtFirstName.setText(controller.getEntity().getFirstName().toString());
        } else {
            txtFirstName.setText("");
        }
        txtLastName.setText(controller.getEntity().getLastName());
        if (controller.getEntity().getLastName()!= null) {
            txtLastName.setText(controller.getEntity().getLastName().toString());
        } else {
            txtLastName.setText("");
        }
    }//GEN-LAST:event_lstAuthorValueChanged

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        controller.setEntity(new Author ());
        setEntityAtributes();

        try {
            controller.create();
            clear();
            load();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        if (controller.getEntity()==null ||
            controller.getEntity().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose item first");
            return;
        }
        setEntityAtributes();

        try {
            controller.update();
            clear();
            load();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        if (controller.getEntity()==null || controller.getEntity().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose item first");
            return;
        }

        try {
            controller.delete();
            clear();
            load();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JList<Author> lstAuthor;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables

    private void load() {
        DefaultListModel<Author> m = new DefaultListModel<>();

        m.addAll(controller.getData());

        lstAuthor.setModel(m);
        
    }

    private void setEntityAtributes() {
        var entity=controller.getEntity();
        
        entity.setFirstName(txtFirstName.getText());
        entity.setLastName(txtFirstName.getText());
    }

    private void clear() {
        txtFirstName.setText(" ");
        txtLastName.setText(" ");
        
    }
}
