/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import javax.swing.JOptionPane;

/**
 *
 * @author Mutaher Affan
 */
public class BatchTeacherManagement extends javax.swing.JFrame {

    /**
     * Creates new form Batch_Teacher_Management
     */
    public BatchTeacherManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        batch_teacher_management_button_group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        show_batch_teacher_radio = new javax.swing.JRadioButton();
        add_batch_teacher_radio = new javax.swing.JRadioButton();
        delete_batch_teacher_radio = new javax.swing.JRadioButton();
        update_batch_teacher_radio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("  BATCH TEACHER MANAGEMENT");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255), 5));

        batch_teacher_management_button_group.add(show_batch_teacher_radio);
        show_batch_teacher_radio.setText("SHOW BATCH TEACHERS");

        batch_teacher_management_button_group.add(add_batch_teacher_radio);
        add_batch_teacher_radio.setText("ADD BATCH TEACHER");
        add_batch_teacher_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_batch_teacher_radioActionPerformed(evt);
            }
        });

        batch_teacher_management_button_group.add(delete_batch_teacher_radio);
        delete_batch_teacher_radio.setText("DELETE BATCH TEACHER");
        delete_batch_teacher_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_batch_teacher_radioActionPerformed(evt);
            }
        });

        batch_teacher_management_button_group.add(update_batch_teacher_radio);
        update_batch_teacher_radio.setText("UPDATE BATCH TEACHER");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("SELECT ANY ONE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_batch_teacher_radio)
                    .addComponent(show_batch_teacher_radio)
                    .addComponent(jLabel2)
                    .addComponent(add_batch_teacher_radio)
                    .addComponent(delete_batch_teacher_radio))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(show_batch_teacher_radio)
                .addGap(26, 26, 26)
                .addComponent(add_batch_teacher_radio)
                .addGap(31, 31, 31)
                .addComponent(delete_batch_teacher_radio)
                .addGap(32, 32, 32)
                .addComponent(update_batch_teacher_radio)
                .addGap(91, 91, 91))
        );

        next_button.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
        next_button.setText("NEXT");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        back_button.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
        back_button.setText("BACK");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(next_button)
                .addGap(132, 132, 132)
                .addComponent(back_button)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next_button)
                    .addComponent(back_button))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_batch_teacher_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_batch_teacher_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_batch_teacher_radioActionPerformed

    private void delete_batch_teacher_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_batch_teacher_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_batch_teacher_radioActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        int choice = 0;
        if (show_batch_teacher_radio.isSelected())
        {
            choice = 1;
        }
        else if (add_batch_teacher_radio.isSelected())
        {
            choice = 2;
        }
        else if (delete_batch_teacher_radio.isSelected())
        {
            choice = 3;
        }
        else if (update_batch_teacher_radio.isSelected())
        {
            choice = 4;
        }

        switch(choice) {
            case 1: JOptionPane.showMessageDialog(null, "You Selected 1");
                    ShowBatchTeacher show_Batch_Teacher = new ShowBatchTeacher();
                    show_Batch_Teacher.setVisible(true);
                    setVisible(false);
                    break;
            case 2: JOptionPane.showMessageDialog(null, "You Selected 2");
                    AddBatchTeacher add_Batch_Teacher = new AddBatchTeacher();
                    add_Batch_Teacher.setVisible(true);
                    setVisible(false);
                    break;
            case 3: JOptionPane.showMessageDialog(null, "You Selected 3");
                    DeleteBatchTeacher delete_Batch_Teacher = new DeleteBatchTeacher();
                    delete_Batch_Teacher.setVisible(true);
                    setVisible(false);
                    break;
            case 4: JOptionPane.showMessageDialog(null, "You Selected 4");
                    UpdateBatchTeacher update_Batch_Teacher = new UpdateBatchTeacher();
                    update_Batch_Teacher.setVisible(true);
                    setVisible(false);
                    break;
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BatchTeacherManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatchTeacherManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatchTeacherManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatchTeacherManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchTeacherManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add_batch_teacher_radio;
    private javax.swing.JButton back_button;
    private javax.swing.ButtonGroup batch_teacher_management_button_group;
    private javax.swing.JRadioButton delete_batch_teacher_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton next_button;
    private javax.swing.JRadioButton show_batch_teacher_radio;
    private javax.swing.JRadioButton update_batch_teacher_radio;
    // End of variables declaration//GEN-END:variables
}
