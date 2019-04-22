/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mutaher Affan
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exit_Label = new javax.swing.JLabel();
        search_text_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        search_label = new javax.swing.JLabel();
        minimize_Label = new javax.swing.JLabel();
        Department_Management_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Student_Management_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Batch_Teacher_Management_Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        About_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Batch_Management_Panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Teacher_Management_Panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(130, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 118, 232), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Academy Management System");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_mortarboard_filled_50px.png"))); // NOI18N

        exit_Label.setForeground(new java.awt.Color(255, 255, 255));
        exit_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_multiply_filled_25px.png"))); // NOI18N
        exit_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit_LabelMousePressed(evt);
            }
        });

        search_text_field.setBackground(new java.awt.Color(45, 118, 232));
        search_text_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_text_field.setForeground(new java.awt.Color(255, 255, 255));
        search_text_field.setBorder(null);
        search_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_text_fieldActionPerformed(evt);
            }
        });
        search_text_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_text_fieldKeyPressed(evt);
            }
        });

        search_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_search_filled_25px.png"))); // NOI18N
        search_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_labelMouseClicked(evt);
            }
        });

        minimize_Label.setForeground(new java.awt.Color(255, 255, 255));
        minimize_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_minus_math_filled_25px.png"))); // NOI18N
        minimize_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimize_LabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimize_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(exit_Label))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(search_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(minimize_Label)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14))
                    .addComponent(exit_Label)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_label)
                    .addComponent(search_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 230));

        Department_Management_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Department_Management_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Department_Management_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Department_Management_PanelMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_department_filled_50px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Department Management");

        javax.swing.GroupLayout Department_Management_PanelLayout = new javax.swing.GroupLayout(Department_Management_Panel);
        Department_Management_Panel.setLayout(Department_Management_PanelLayout);
        Department_Management_PanelLayout.setHorizontalGroup(
            Department_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Department_Management_PanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(Department_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Department_Management_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Department_Management_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21))))
        );
        Department_Management_PanelLayout.setVerticalGroup(
            Department_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Department_Management_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Department_Management_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 200, 140));

        Student_Management_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Student_Management_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Student_Management_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Student_Management_PanelMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_students_filled_50px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 118, 232));
        jLabel4.setText("Student Management");

        javax.swing.GroupLayout Student_Management_PanelLayout = new javax.swing.GroupLayout(Student_Management_Panel);
        Student_Management_Panel.setLayout(Student_Management_PanelLayout);
        Student_Management_PanelLayout.setHorizontalGroup(
            Student_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_Management_PanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Student_Management_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(71, 71, 71))
        );
        Student_Management_PanelLayout.setVerticalGroup(
            Student_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_Management_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Student_Management_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 140));

        Batch_Teacher_Management_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Batch_Teacher_Management_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Batch_Teacher_Management_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Batch_Teacher_Management_PanelMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_classroom_filled_50px_1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 118, 232));
        jLabel6.setText("Batch Teacher Management");

        javax.swing.GroupLayout Batch_Teacher_Management_PanelLayout = new javax.swing.GroupLayout(Batch_Teacher_Management_Panel);
        Batch_Teacher_Management_Panel.setLayout(Batch_Teacher_Management_PanelLayout);
        Batch_Teacher_Management_PanelLayout.setHorizontalGroup(
            Batch_Teacher_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Batch_Teacher_Management_PanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(75, 75, 75))
            .addGroup(Batch_Teacher_Management_PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Batch_Teacher_Management_PanelLayout.setVerticalGroup(
            Batch_Teacher_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Batch_Teacher_Management_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Batch_Teacher_Management_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 200, 140));

        About_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                About_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                About_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                About_panelMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_about_50px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 118, 232));
        jLabel8.setText("About");

        javax.swing.GroupLayout About_panelLayout = new javax.swing.GroupLayout(About_panel);
        About_panel.setLayout(About_panelLayout);
        About_panelLayout.setHorizontalGroup(
            About_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, About_panelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(About_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(75, 75, 75))
        );
        About_panelLayout.setVerticalGroup(
            About_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(About_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(About_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 200, 140));

        Batch_Management_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Batch_Management_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Batch_Management_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Batch_Management_PanelMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_batch_assign_filled_50px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(45, 118, 232));
        jLabel10.setText("Batch Management");

        javax.swing.GroupLayout Batch_Management_PanelLayout = new javax.swing.GroupLayout(Batch_Management_Panel);
        Batch_Management_Panel.setLayout(Batch_Management_PanelLayout);
        Batch_Management_PanelLayout.setHorizontalGroup(
            Batch_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Batch_Management_PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Batch_Management_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(75, 75, 75))
        );
        Batch_Management_PanelLayout.setVerticalGroup(
            Batch_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Batch_Management_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Batch_Management_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 200, 140));

        Teacher_Management_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teacher_Management_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Teacher_Management_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Teacher_Management_PanelMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8_teacher_hirring_50px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 118, 232));
        jLabel12.setText("Teacher Management");

        javax.swing.GroupLayout Teacher_Management_PanelLayout = new javax.swing.GroupLayout(Teacher_Management_Panel);
        Teacher_Management_Panel.setLayout(Teacher_Management_PanelLayout);
        Teacher_Management_PanelLayout.setHorizontalGroup(
            Teacher_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Teacher_Management_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Teacher_Management_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(75, 75, 75))
        );
        Teacher_Management_PanelLayout.setVerticalGroup(
            Teacher_Management_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Teacher_Management_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Teacher_Management_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 200, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_LabelMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_LabelMousePressed

    private void search_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_text_fieldActionPerformed

    private void Student_Management_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_Management_PanelMouseEntered
        // TODO add your handling code here:
        setColor(Student_Management_Panel);
    }//GEN-LAST:event_Student_Management_PanelMouseEntered

    private void Student_Management_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_Management_PanelMouseExited
        // TODO add your handling code here:
        resetColor(Student_Management_Panel);
    }//GEN-LAST:event_Student_Management_PanelMouseExited

    private void Teacher_Management_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teacher_Management_PanelMouseEntered
        // TODO add your handling code here:
        setColor(Teacher_Management_Panel);
    }//GEN-LAST:event_Teacher_Management_PanelMouseEntered

    private void Teacher_Management_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teacher_Management_PanelMouseExited
        // TODO add your handling code here:
        resetColor(Teacher_Management_Panel);
    }//GEN-LAST:event_Teacher_Management_PanelMouseExited

    private void Department_Management_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Department_Management_PanelMouseEntered
        // TODO add your handling code here:
        setColor(Department_Management_Panel);
    }//GEN-LAST:event_Department_Management_PanelMouseEntered

    private void Department_Management_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Department_Management_PanelMouseExited
        // TODO add your handling code here:
        resetColor(Department_Management_Panel);
    }//GEN-LAST:event_Department_Management_PanelMouseExited

    private void Batch_Management_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Management_PanelMouseEntered
        // TODO add your handling code here:
        setColor(Batch_Management_Panel);
    }//GEN-LAST:event_Batch_Management_PanelMouseEntered

    private void Batch_Management_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Management_PanelMouseExited
        // TODO add your handling code here:
        resetColor(Batch_Management_Panel);
    }//GEN-LAST:event_Batch_Management_PanelMouseExited

    private void Batch_Teacher_Management_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Teacher_Management_PanelMouseEntered
        // TODO add your handling code here:
        setColor(Batch_Teacher_Management_Panel);
    }//GEN-LAST:event_Batch_Teacher_Management_PanelMouseEntered

    private void Batch_Teacher_Management_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Teacher_Management_PanelMouseExited
        // TODO add your handling code here:
        resetColor(Batch_Teacher_Management_Panel);
    }//GEN-LAST:event_Batch_Teacher_Management_PanelMouseExited

    private void About_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_panelMouseEntered
        // TODO add your handling code here:
        setColor(About_panel);
    }//GEN-LAST:event_About_panelMouseEntered

    private void About_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_panelMouseExited
        // TODO add your handling code here:
        resetColor(About_panel);
    }//GEN-LAST:event_About_panelMouseExited

    private void Student_Management_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Student_Management_PanelMouseClicked
        // TODO add your handling code here:
        Student_Management student_Management = new Student_Management();
        student_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Student_Management_PanelMouseClicked

    private void Teacher_Management_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teacher_Management_PanelMouseClicked
        // TODO add your handling code here:
        Teacher_Management teacher_Management = new Teacher_Management();
        teacher_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Teacher_Management_PanelMouseClicked

    private void Department_Management_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Department_Management_PanelMouseClicked
        // TODO add your handling code here:
        Department_Management department_Management = new Department_Management();
        department_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Department_Management_PanelMouseClicked

    private void Batch_Management_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Management_PanelMouseClicked
        // TODO add your handling code here:
        Batch_Management batch_Management = new Batch_Management();
        batch_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Batch_Management_PanelMouseClicked

    private void Batch_Teacher_Management_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Batch_Teacher_Management_PanelMouseClicked
        // TODO add your handling code here:
        Batch_Teacher_Management batch_Teacher_Management = new Batch_Teacher_Management();
        batch_Teacher_Management.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Batch_Teacher_Management_PanelMouseClicked

    private void minimize_LabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_LabelMousePressed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);   
    }//GEN-LAST:event_minimize_LabelMousePressed

    private void search_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_labelMouseClicked
        // TODO add your handling code here:
        String input = search_text_field.getText();
        if (input.equalsIgnoreCase("Student") || input.equalsIgnoreCase("Student Management"))
        {
            Student_Management student_Management = new Student_Management();
            student_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Department") || input.equalsIgnoreCase("Department Management"))
        {
            Department_Management department_Management = new Department_Management();
            department_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Teacher") || input.equalsIgnoreCase("Teacher Management"))
        {
            Teacher_Management teacher_Management = new Teacher_Management();
            teacher_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Batch") || input.equalsIgnoreCase("Batch Management"))
        {
            Batch_Management batch_Management = new Batch_Management();
            batch_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Batch Teacher") || input.equalsIgnoreCase("Batch Teacher Management"))
        {
            Batch_Teacher_Management batch_Teacher_Management = new Batch_Teacher_Management();
            batch_Teacher_Management.setVisible(true);
            setVisible(false);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Invalid Search");
        }
    }//GEN-LAST:event_search_labelMouseClicked

    private void search_text_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_text_fieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {    
        String input = search_text_field.getText();
        
        if (input.equalsIgnoreCase("Student") || input.equalsIgnoreCase("Student Management"))
        {
            Student_Management student_Management = new Student_Management();
            student_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Department") || input.equalsIgnoreCase("Department Management"))
        {
            Department_Management department_Management = new Department_Management();
            department_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Teacher") || input.equalsIgnoreCase("Teacher Management"))
        {
            Teacher_Management teacher_Management = new Teacher_Management();
            teacher_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Batch") || input.equalsIgnoreCase("Batch Management"))
        {
            Batch_Management batch_Management = new Batch_Management();
            batch_Management.setVisible(true);
            setVisible(false);
        }
        
        else if (input.equalsIgnoreCase("Batch Teacher") || input.equalsIgnoreCase("Batch Teacher Management"))
        {
            Batch_Teacher_Management batch_Teacher_Management = new Batch_Teacher_Management();
            batch_Teacher_Management.setVisible(true);
            setVisible(false);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Invalid Search");
        }
            
        }
    }//GEN-LAST:event_search_text_fieldKeyPressed

    private void About_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_About_panelMouseClicked
        // TODO add your handling code here:
        About about = new About();
        about.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_About_panelMouseClicked
   
    public void setColor(JPanel panel) 
    {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }
    
    public void resetColor(JPanel panel) 
    {
        panel.setBackground(new java.awt.Color(240,240,240));
    }
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About_panel;
    private javax.swing.JPanel Batch_Management_Panel;
    private javax.swing.JPanel Batch_Teacher_Management_Panel;
    private javax.swing.JPanel Department_Management_Panel;
    private javax.swing.JPanel Student_Management_Panel;
    private javax.swing.JPanel Teacher_Management_Panel;
    private javax.swing.JLabel exit_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel minimize_Label;
    private javax.swing.JLabel search_label;
    private javax.swing.JTextField search_text_field;
    // End of variables declaration//GEN-END:variables
}
