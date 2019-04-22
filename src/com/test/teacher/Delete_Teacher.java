/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.teacher;

import com.dao.DBManager;
import com.models.TeacherModel;
import com.test.Home;
import com.test.Teacher_Management;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mutaher Affan
 */
public class Delete_Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Teacher
     */
    public Delete_Teacher() {
        initComponents();
        showTeachers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        exit_Label1 = new javax.swing.JLabel();
        minimize_Label1 = new javax.swing.JLabel();
        Back_label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teacher_id_input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_Teacher_Table = new javax.swing.JTable();
        Delete_Label = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(130, 150));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(45, 118, 232));
        jPanel4.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Delete Teacher");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_delete_user_male_filled_50px.png"))); // NOI18N

        exit_Label1.setForeground(new java.awt.Color(255, 255, 255));
        exit_Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_multiply_filled_25px.png"))); // NOI18N
        exit_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit_Label1MousePressed(evt);
            }
        });

        minimize_Label1.setForeground(new java.awt.Color(255, 255, 255));
        minimize_Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"))); // NOI18N
        minimize_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimize_Label1MousePressed(evt);
            }
        });

        Back_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_left_2_filled_50px.png"))); // NOI18N
        Back_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_label1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Back_label1)
                .addGap(249, 249, 249)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(0, 356, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_Label1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit_Label1)
                            .addComponent(minimize_Label1))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16))
                    .addComponent(Back_label1))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 230));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("ENTER TEACHER ID :-");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        teacher_id_input.setBorder(null);
        jPanel3.add(teacher_id_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 180, -1));

        show_Teacher_Table = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex , int colIndex)
            {
                return false;
            }
        };
        show_Teacher_Table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        show_Teacher_Table.setForeground(new java.awt.Color(51, 51, 51));
        show_Teacher_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEACHER ID", "NAME", "ADDRESS", "CONTACT NO", "EMAIL"
            }
        ));
        show_Teacher_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_Teacher_Table.setGridColor(new java.awt.Color(255, 255, 255));
        show_Teacher_Table.setRowHeight(20);
        jScrollPane1.setViewportView(show_Teacher_Table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 230, 990, 250));

        Delete_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_right_2_filled_40px.png"))); // NOI18N
        Delete_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_LabelMouseClicked(evt);
            }
        });
        jPanel3.add(Delete_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_Label1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_Label1MousePressed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_exit_Label1MousePressed

    private void minimize_Label1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_Label1MousePressed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_Label1MousePressed

    private void Back_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_label1MouseClicked
        // TODO add your handling code here:
        Teacher_Management teacher_Management = new Teacher_Management();
        teacher_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Back_label1MouseClicked

    private void Delete_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_LabelMouseClicked
        // TODO add your handling code here:
        deleteTeacher();
    }//GEN-LAST:event_Delete_LabelMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Delete_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Teacher().setVisible(true);
            }
        });
    }
    
     private void deleteTeacher(){
        TeacherModel teacherModel = new TeacherModel();
        int teacher_id = parseInt(teacher_id_input.getText());
        teacherModel.setTeacher_id(teacher_id);
        int row = DBManager.deleteTeacher(teacherModel);
        if (row > 0){
                JOptionPane.showMessageDialog(null, "RECORD DELETED SUCCESSFULLY");
            }
            else{
                JOptionPane.showMessageDialog(null, "RECORD NOT DELETED");
            }
    }
     
     private void showTeachers() {
        List<TeacherModel> teacherModels = DBManager.getAllTeachers();
        DefaultTableModel model = (DefaultTableModel)show_Teacher_Table.getModel();
        show_Teacher_Table.setRowHeight(30);
        Object[] row = new Object[5];
        for(int i = 0;i<teacherModels.size();i++) {
            
            row[0] = teacherModels.get(i).getTeacher_id();
            row[1] = teacherModels.get(i).getName();
            row[2] = teacherModels.get(i).getAddress();
            row[3] = teacherModels.get(i).getContact_no();
            row[4] = teacherModels.get(i).getEmail();
            model.addRow(row);
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_label1;
    private javax.swing.JLabel Delete_Label;
    private javax.swing.JLabel exit_Label1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel minimize_Label1;
    private javax.swing.JTable show_Teacher_Table;
    private javax.swing.JTextField teacher_id_input;
    // End of variables declaration//GEN-END:variables
}
