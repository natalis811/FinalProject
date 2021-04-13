
package finalproject.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import finalproject.controller.BookController;
import finalproject.controller.ReviewController;
import finalproject.controller.UserController;
import finalproject.model.Book;
import finalproject.model.Review;
import finalproject.model.User;
import finalproject.util.BookException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author natalis
 */
public class ReviewForm extends javax.swing.JFrame {

    private ReviewController controllerReview;
    private BookController controllerBook;
    private UserController controllerUser;
    
    public ReviewForm() {
        initComponents();
        controllerReview = new ReviewController();
        setTitle(Application.TITLE_APP + "Review");
        loadReviewEntities();
        loadBook();
        loadUser();                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBook = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReview = new javax.swing.JTextArea();
        jsRating = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dpDate = new com.github.lgooddatepicker.components.DatePicker();
        lblRating = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstReview = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtReview.setColumns(20);
        txtReview.setRows(5);
        jScrollPane1.setViewportView(txtReview);

        jsRating.setMaximum(5);
        jsRating.setMinimum(1);
        jsRating.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsRatingStateChanged(evt);
            }
        });

        jLabel1.setText("Book");

        jLabel2.setText("Date");

        jLabel3.setText("Review list:");

        lblRating.setText("Rating");

        jLabel5.setText("User");

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jLabel6.setText("Review");

        lstReview.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstReviewValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstReview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jsRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAdd))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRating)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jsRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAdd)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstReviewValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstReviewValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstReview.getSelectedValue() == null) {
            return;
        }
           
        controllerReview.setEntity(lstReview.getSelectedValue());        
         
        var r = controllerReview.getEntity();
        txtReview.setText(r.getText());
        cmbBook.setSelectedItem(controllerBook.getEntity().getTitle());
        txtUser.setText(r.getText());
        if(r.getDate()!=null){
            dpDate.setDate(r.getDate().toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate());
       }else{
           dpDate.setDate(null);
           
        if(r.getRating()!=null){
            jsRating.setValue(r.getRating());
       }else{
           jsRating.setValue(0);
       }
       }
        
    }//GEN-LAST:event_lstReviewValueChanged

    private void jsRatingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsRatingStateChanged
        lblRating.setText(String.valueOf(jsRating.getValue()));
    }//GEN-LAST:event_jsRatingStateChanged

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        controllerReview.setEntity(new Review());
        setEntityAtributes();

        try {
            controllerReview.create();
            clear();
            loadReviewEntities();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbAddActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Book> cmbBook;
    private com.github.lgooddatepicker.components.DatePicker dpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JSlider jsRating;
    private javax.swing.JLabel lblRating;
    private javax.swing.JList<Review> lstReview;
    private javax.swing.JTextArea txtReview;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void hrDate() {
        
        DatePickerSettings dps= new DatePickerSettings(
                new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        dpDate.setSettings(dps);
                           
    }
    
    private void setEntityAtributes(){
        var r = controllerReview.getEntity();
        r.setBook((Book) cmbBook.getSelectedItem());
        r.setUser(Application.user);
        r.setText(txtReview.getText());
        r.setRating(jsRating.getValue());
        if(dpDate.getDate()!=null){
           r.setDate(Date.from(dpDate.getDate().atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant()));
       }
    }
  
    private void loadReviewEntities() {
        DefaultListModel<Review> m = new DefaultListModel<>();
        m.addAll (controllerReview.getData());
        lstReview.setModel(m);
        
    }

    private void loadBook() {
        DefaultComboBoxModel<Book> m = new DefaultComboBoxModel<>();
        Book b = new Book();
        b.setId(-1L);
        b.setTitle("Choose title");
        m.addElement(b);
        new BookController().getData().forEach(bm->{
            m.addElement(bm);
        });
        cmbBook.setModel(m);
        cmbBook.setSelectedIndex(0);   
    }

    private void loadUser() {
        txtUser.setText(Application.user.getFirstNameLastName());
    }

    private void clear() {
        txtReview.setText(" ");
        cmbBook.setSelectedIndex(0);
        jsRating.setValue(1);
        dpDate.setDate(null);
        
        
    }
    
}
