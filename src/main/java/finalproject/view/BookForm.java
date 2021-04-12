
package finalproject.view;

import finalproject.controller.BookController;
import finalproject.controller.CategoryController;
import finalproject.controller.PublisherController;
import finalproject.model.Book;
import finalproject.model.Category;
import finalproject.model.Publisher;
import finalproject.util.BookException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.validation.groups.Default;

/**
 *
 * @author natalis
 */
public class BookForm extends javax.swing.JFrame {
    
    private BookController controllerBook;
    private CategoryController controllerCategory;
    private PublisherController controllerPublisher;

    
    public BookForm() {
        initComponents();
        controllerBook = new BookController (new Book());
        controllerCategory = new CategoryController (new Category());
        controllerPublisher = new PublisherController (new Publisher());
        setTitle(Application.TITLE_APP + "Book");
        loadBookEntities();
        loadCategory();
        loadPublisher();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstBook = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPublisher = new javax.swing.JComboBox<>();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        txtPublished = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstBook.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBookValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBook);

        jLabel1.setText("Title");

        jLabel2.setText("Published");

        jLabel3.setText("ISBN");

        jLabel4.setText("Category");

        jLabel5.setText("Publisher");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPublished, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDelete)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPublished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd)
                    .addComponent(jbEdit)
                    .addComponent(jbDelete))
                .addGap(95, 186, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstBookValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBookValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstBook.getSelectedValue() == null) {
            return;
        }
           
        controllerBook.setEntity(lstBook.getSelectedValue());        
         
         txtTitle.setText(controllerBook.getEntity().getTitle());
        if (controllerBook.getEntity().getTitle()!= null) {
           txtTitle.setText(controllerBook.getEntity().getTitle().toString());
        } else {
            txtTitle.setText("");
          }
        
        if (controllerBook.getEntity().getPublished() != null){
            txtPublished.setText(controllerBook.getEntity().getPublished());
        } else {
            txtPublished.setText("");
        }
        
        if (controllerBook.getEntity().getIsbn() != null) {
            txtIsbn.setText(controllerBook.getEntity().getIsbn());
        } else {
            txtIsbn.setText("");
        }
        cmbCategory.setSelectedItem(controllerBook.getEntity().getCategory());
        cmbPublisher.setSelectedItem(controllerBook.getEntity().getPublisher());
            
        
        
    }//GEN-LAST:event_lstBookValueChanged

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        controllerBook.setEntity(new Book());
        setEntityAtributes();

        try {
            controllerBook.create();
            clear();
            loadBookEntities();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        if (controllerBook.getEntity()==null || 
                controllerBook.getEntity().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose item first");
            return;
        }
        setEntityAtributes();

        try {
            controllerBook.update();
            clear();
            loadBookEntities();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Category> cmbCategory;
    private javax.swing.JComboBox<Publisher> cmbPublisher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JList<Book> lstBook;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPublished;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void setEntityAtributes() {
        var b=controllerBook.getEntity();
        
        b.setTitle(txtTitle.getText());
        b.setCategory((Category) cmbCategory.getSelectedItem());
        b.setPublisher((Publisher) cmbPublisher.getSelectedItem());
        b.setIsbn (txtIsbn.getText());
        b.setPublished(txtPublished.getText());
    }
    
    private void loadBookEntities() {
        
        DefaultListModel<Book> b = new DefaultListModel<>();
        b.addAll(controllerBook.getData());
        lstBook.setModel(b);   
    }

    private void loadCategory() {
        
        DefaultComboBoxModel<Category> m = new DefaultComboBoxModel<>();
        Category c = new Category();
        c.setId(-1L);
        c.setName("Choose category");
        m.addElement(c);
        new CategoryController().getData().forEach(cm->{
            m.addElement(cm);
        });
        cmbCategory.setModel(m); 
        cmbCategory.setSelectedIndex(0);        
        
    }

    private void loadPublisher() {
        DefaultComboBoxModel<Publisher> m = new DefaultComboBoxModel<>(); 
         Publisher p = new Publisher ();
        p.setId(-1L);
        p.setName("Choose publisher");
        m.addElement(p);
        new PublisherController().getData().forEach(pm->{m.addElement(pm);});
        cmbPublisher.setModel(m);
        cmbPublisher.setSelectedIndex(0);
    }

    private void clear() {
        txtTitle.setText("");
        txtPublished.setText("");
        txtIsbn.setText("");
        cmbCategory.setSelectedIndex(0);
        cmbPublisher.setSelectedIndex(0);
        
    }

    
        
    }

