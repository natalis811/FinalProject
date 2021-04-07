
package finalproject.view;

import finalproject.controller.CategoryController;
import finalproject.model.Category;
import finalproject.util.BookException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author natalis
 */
public class CategoryForm extends javax.swing.JFrame {

    private CategoryController controller;
    
    public CategoryForm() {
        initComponents();
        controller = new CategoryController (new Category());
        setTitle(Application.TITLE_APP + "Category");
        load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategory = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstCategory.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCategoryValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCategory);

        jLabel1.setText("Category name:");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jbDelete))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd)
                    .addComponent(jbEdit)
                    .addComponent(jbDelete))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        controller.setEntity(new Category ());
        setEntityAtributes();

        try {
            controller.create();
            clear();
            load();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }

    }//GEN-LAST:event_jbAddActionPerformed

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

    private void lstCategoryValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoryValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstCategory.getSelectedValue() == null) {
            return;
        }
        
         controller.setEntity(lstCategory.getSelectedValue());
        
        txtCategoryName.setText(controller.getEntity().getName());
        if (controller.getEntity().getName()!= null) {
            txtCategoryName.setText(controller.getEntity().getName().toString());
        } else {
            txtCategoryName.setText("");
        }
    }//GEN-LAST:event_lstCategoryValueChanged

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JList<Category> lstCategory;
    private javax.swing.JTextField txtCategoryName;
    // End of variables declaration//GEN-END:variables

    private void load() {
        DefaultListModel<Category> m = new DefaultListModel<>();

        m.addAll(controller.getData());

        lstCategory.setModel(m);
        
    }

    private void setEntityAtributes() {
        var entity=controller.getEntity();
        
        entity.setName(txtCategoryName.getText());
    }

    private void clear() {
        txtCategoryName.setText(" ");
    }
}
