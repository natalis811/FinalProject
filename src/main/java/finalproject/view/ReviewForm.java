package finalproject.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import finalproject.controller.BookController;
import finalproject.controller.ReviewController;
import finalproject.controller.UserController;
import finalproject.model.Book;
import finalproject.model.Review;
import finalproject.util.BookException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ReviewForm extends javax.swing.JFrame {

    private ReviewController controllerReview;
    private BookController controllerBook;
    private UserController controllerUser;
    
    private ReviewsForm reviewsForm;
    
    public ReviewForm(ReviewsForm reviewsForm) {
        this.reviewsForm = reviewsForm;
        initComponents();
        controllerReview = new ReviewController();
        setTitle(Application.TITLE_APP + "Review");
        loadBook();
        loadUser();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbBook = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dpDate = new com.github.lgooddatepicker.components.DatePicker();
        lblRating = new javax.swing.JLabel();
        jsRating = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReview = new javax.swing.JTextArea();
        jbAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Book");

        jLabel5.setText("User");

        txtUser.setEditable(false);

        jLabel2.setText("Date");

        lblRating.setText("Rating");

        jsRating.setMaximum(5);
        jsRating.setMinimum(1);
        jsRating.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsRatingStateChanged(evt);
            }
        });

        jLabel6.setText("Review");

        txtReview.setColumns(20);
        txtReview.setRows(5);
        jScrollPane1.setViewportView(txtReview);

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jsRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAdd))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblRating)
                        .addGap(18, 18, 18)
                        .addComponent(jsRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jbAdd)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jsRatingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsRatingStateChanged
        lblRating.setText(String.valueOf(jsRating.getValue()));
    }//GEN-LAST:event_jsRatingStateChanged

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        
        // ask setEntityAtributes is there' a review for user and book
        Review review = controllerReview.findReview((Book) cmbBook.getSelectedItem(), Application.user);
        if (review != null) {
            // stop
            return;
        }
        
        controllerReview.setEntity(new Review());
        setEntityAtributes();

        try {
            controllerReview.create();
            clear();
            this.reviewsForm.loadReviewEntities();
            this.dispose();
        } catch (BookException b) {
            JOptionPane.showMessageDialog(rootPane, b.getMessage());
        }
    }//GEN-LAST:event_jbAddActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Book> cmbBook;
    private com.github.lgooddatepicker.components.DatePicker dpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JSlider jsRating;
    private javax.swing.JLabel lblRating;
    private javax.swing.JTextArea txtReview;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    
    private void hrDate() {        
        DatePickerSettings dps= new DatePickerSettings(new Locale("hr","HR"));
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