/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.view;

;
import finalproject.controller.PublisherController;
import finalproject.model.Publisher;
import finalproject.util.BookException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import finalproject.controller.PublisherController;

/**
 *
 * @author natalis
 */
public class PublisherForm extends javax.swing.JFrame {
    
    private PublisherController controller;
    
    public PublisherForm() {
        initComponents();
        controller = new PublisherController (new Publisher());
        setTitle(Application.TITLE_APP + "Publisher");
        load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstPublisher = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtPublisherName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPublisherAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPublisherCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPublisherCountry = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPublisher.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPublisherValueChanged(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("City");

        jLabel4.setText("Country");

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
                .addComponent(lstPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDelete)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPublisherCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtPublisherCity, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPublisherAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lstPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPublisherAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublisherCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublisherCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd)
                    .addComponent(jbEdit)
                    .addComponent(jbDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPublisherValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPublisherValueChanged
        if (evt.getValueIsAdjusting() || lstPublisher.getSelectedValue() == null) {
            return;
        }

        controller.setEntity(lstPublisher.getSelectedValue());

        if (controller.getEntity().getName() != null) {
            txtPublisherName.setText(controller.getEntity().getName());
        } else {
            txtPublisherName.setText("");
        }
        
        if (controller.getEntity().getAddress() != null) {
            txtPublisherAddress.setText(controller.getEntity().getAddress());
        } else {
            txtPublisherAddress.setText("");
        }
        
        if (controller.getEntity().getCity() != null) {
            txtPublisherCity.setText(controller.getEntity().getCity());
        } else {
            txtPublisherCity.setText("");                               
        }
        
        if (controller.getEntity().getCountry() != null) {
            txtPublisherCountry.setText(controller.getEntity().getCountry());
        } else {
            txtPublisherCountry.setText("");
        }
    }//GEN-LAST:event_lstPublisherValueChanged

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        controller.setEntity(new Publisher ());
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JList<Publisher> lstPublisher;
    private javax.swing.JTextField txtPublisherAddress;
    private javax.swing.JTextField txtPublisherCity;
    private javax.swing.JTextField txtPublisherCountry;
    private javax.swing.JTextField txtPublisherName;
    // End of variables declaration//GEN-END:variables

    private void load() {
        DefaultListModel<Publisher> m = new DefaultListModel<>();

        m.addAll(controller.getData());

        lstPublisher.setModel(m);
    }

    private void setEntityAtributes() {
        
        var entity=controller.getEntity();    
        entity.setName(txtPublisherName.getText());
        entity.setAddress(txtPublisherAddress.getText());
        entity.setCity(txtPublisherCity.getText());
        entity.setCountry(txtPublisherCountry.getText());
    }

    private void clear() {
        txtPublisherName.setText(" ");
        txtPublisherAddress.setText(" ");
        txtPublisherCity.setText(" ");
        txtPublisherCountry.setText(" ");
    }
}
