/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.batch;

import com.dao.DBManager;
import com.models.BatchModel;
import com.test.Batch_Management;
import com.test.Home;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mutaher Affan
 */
public class Show_Batch extends javax.swing.JFrame {

    /**
     * Creates new form Show_Batch
     */
    public Show_Batch() {
        initComponents();
        showBatches();
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
        Back_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_Batch_Table = new javax.swing.JTable();

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
        jLabel16.setText("Batch's Record");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_batch_assign_filled_50px_1.png"))); // NOI18N

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

        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_circled_left_2_filled_50px.png"))); // NOI18N
        Back_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Back_label)
                .addGap(270, 270, 270)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(0, 343, Short.MAX_VALUE))
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
                    .addComponent(Back_label))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 230));

        show_Batch_Table = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex , int colIndex)
            {
                return false;
            }
        };
        show_Batch_Table.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        show_Batch_Table.setForeground(new java.awt.Color(51, 51, 51));
        show_Batch_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BATCH ID", "YEAR", "SHIFT", "GROUP", "DEPARTMENT ID"
            }
        ));
        show_Batch_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_Batch_Table.setGridColor(new java.awt.Color(255, 255, 255));
        show_Batch_Table.setRowHeight(20);
        jScrollPane1.setViewportView(show_Batch_Table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1000, 500));

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

    private void Back_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_labelMouseClicked
        // TODO add your handling code here:
        Batch_Management batch_Management = new Batch_Management();
        batch_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Back_labelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //Change UI Look of Table.
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
            java.util.logging.Logger.getLogger(Show_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Batch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Batch().setVisible(true);
            }
        });
    }
    
      public void showBatches(){
        
        List<BatchModel> batchModels = DBManager.getAllBatches();
        DefaultTableModel model = (DefaultTableModel)show_Batch_Table.getModel();
        show_Batch_Table.setRowHeight(30);
        Object[] row = new Object[5];
        for(int i = 0;i<batchModels.size();i++) {
          
            row[0] = batchModels.get(i).getBatch_id();
            row[1] = batchModels.get(i).getYear();
            row[2] = batchModels.get(i).getShift();
            row[3] = batchModels.get(i).getGroup();
            row[4] = batchModels.get(i).getDepartment_id();
            model.addRow(row);
            
           
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_label;
    private javax.swing.JLabel exit_Label1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize_Label1;
    private javax.swing.JTable show_Batch_Table;
    // End of variables declaration//GEN-END:variables
}
