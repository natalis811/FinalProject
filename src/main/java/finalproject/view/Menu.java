/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.view;

import finalproject.model.User;

/**
 *
 * @author natalis
 */
public class Menu extends javax.swing.JFrame {

    private User u;
    
    public Menu(User u) {
        
        this.u = u;
        initComponents();    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmBookReview = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmBookReview.setText("Book Review");
        jmBookReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBookReviewActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Category");
        jmBookReview.add(jMenuItem1);

        jMenuItem2.setText("Book");
        jmBookReview.add(jMenuItem2);

        jMenuItem3.setText("Author");
        jmBookReview.add(jMenuItem3);

        jMenuItem4.setText("Publisher");
        jmBookReview.add(jMenuItem4);

        jMenuItem5.setText("Review");
        jmBookReview.add(jMenuItem5);

        jMenuItem6.setText("User");
        jmBookReview.add(jMenuItem6);

        jMenuBar1.add(jmBookReview);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmBookReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBookReviewActionPerformed
                 
    }//GEN-LAST:event_jmBookReviewActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jmBookReview;
    // End of variables declaration//GEN-END:variables
}
