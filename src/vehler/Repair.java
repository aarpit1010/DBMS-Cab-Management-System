/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehler;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author user
 */
public class Repair extends javax.swing.JFrame {

    /**
     * Creates new form AdminSettings
     */
    private String username,type;
    private int carid;
    public Repair()
    {
        
    }
    public Repair(int carid,String username, String type) {
        initComponents();
        this.username=username;
        this.carid =carid;
        this.type=type;
        
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
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        checkRidesButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        currentRideButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        settingsButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        submitButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        repair = new javax.swing.JTextArea();
        repairButton1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(25, 25, 112));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vehler");

        checkRidesButton.setBackground(new java.awt.Color(25, 25, 112));
        checkRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseExited(evt);
            }
        });
        checkRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Check Rides");
        checkRidesButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton.setBackground(new java.awt.Color(25, 25, 112));
        removeVehicleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseExited(evt);
            }
        });
        removeVehicleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton5.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseExited(evt);
            }
        });
        addVehicleButton5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton.add(addVehicleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        currentRideButton.setBackground(new java.awt.Color(25, 25, 112));
        currentRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseExited(evt);
            }
        });
        currentRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Current Ride");
        currentRideButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        settingsButton.setBackground(new java.awt.Color(25, 25, 112));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Settings");
        settingsButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        settingsButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton.setBackground(new java.awt.Color(25, 25, 112));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Log Out");
        logOutButton.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("   X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 11, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 11, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Repair Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 20));

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Enter details here:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 226, 130, 30));

        submitButton.setBackground(new java.awt.Color(255, 255, 255));
        submitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButtonMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Submit");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout submitButtonLayout = new javax.swing.GroupLayout(submitButton);
        submitButton.setLayout(submitButtonLayout);
        submitButtonLayout.setHorizontalGroup(
            submitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitButtonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        submitButtonLayout.setVerticalGroup(
            submitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        repair.setColumns(20);
        repair.setRows(5);
        jScrollPane1.setViewportView(repair);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 450, 140));

        repairButton1.setBackground(new java.awt.Color(25, 25, 112));
        repairButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repairButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repairButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repairButton1MouseExited(evt);
            }
        });
        repairButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Repair Request");
        repairButton1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        repairButton1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(297, 297, 297)
                                        .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(currentRideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(repairButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(checkRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(currentRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repairButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1446, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseClicked
//         TODO add your handling code here:
                DriverRide driverride=new DriverRide(username,type,carid);
                this.setVisible(false);
                driverride.setVisible(true);
    }//GEN-LAST:event_checkRidesButtonMouseClicked

    private void checkRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseEntered
        // TODO add your handling code here:
        checkRidesButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_checkRidesButtonMouseEntered

    private void checkRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseExited
        // TODO add your handling code here:
        checkRidesButton.setBackground(new Color(25,25,112));
    }//GEN-LAST:event_checkRidesButtonMouseExited

    private void addVehicleButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseEntered

    private void addVehicleButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseExited

    private void removeVehicleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseEntered
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_removeVehicleButtonMouseEntered

    private void removeVehicleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseExited
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(25,25,112));
    }//GEN-LAST:event_removeVehicleButtonMouseExited

    private void currentRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseClicked
        // TODO add your handling code here:
        CurrentRide cr= new CurrentRide(username,type,carid);
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_currentRideButtonMouseClicked

    private void currentRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseEntered
        // TODO add your handling code here:
        currentRideButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_currentRideButtonMouseEntered

    private void currentRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseExited
        // TODO add your handling code here:
        currentRideButton.setBackground(new Color(25,25,112));
    }//GEN-LAST:event_currentRideButtonMouseExited

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // TODO add your handling code here:
        Repair ds=new Repair(carid,username,type);
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        // TODO add your handling code here:
        settingsButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // TODO add your handling code here:
        settingsButton.setBackground(new Color(25,25,112));
    }//GEN-LAST:event_settingsButtonMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(25,25,112));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        setState(AddVehicle.ICONIFIED);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat(""
                        + "yyyy-MM-dd::HH:mm:ss");

String repairHistory_datetime = dateFormat.format(new Date());
      String s=repair.getText();
      System.out.println(s);
      DbConnection conn = new DbConnection();
        int flag;
        try{
        conn.OpenConnection();
        String sql = "insert into repairhistory values('"+repairHistory_datetime+"','"+username+"',"+String.valueOf(carid)+",'"+s+"')";
       System.out.println(sql);
        flag = conn.InsertUpdateDelete(sql);
           if(flag == 1){
               JOptionPane.showMessageDialog(null, "Repair Updated");
           }
           else{
                JOptionPane.showMessageDialog(null, "Repair not updated" );
           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Update repair Query Failed");
        }
        repair.setText("");
      
    }//GEN-LAST:event_submitButtonMouseClicked

    private void submitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseEntered
        // TODO add your handling code here:
        submitButton.setBackground(new Color(153,102,255));
        jLabel3.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_submitButtonMouseEntered

    private void submitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseExited
        // TODO add your handling code here:
        submitButton.setBackground(new Color(255,255,255));
         jLabel3.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_submitButtonMouseExited

    private void repairButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_repairButton1MouseClicked

    private void repairButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_repairButton1MouseEntered

    private void repairButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repairButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_repairButton1MouseExited

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
            java.util.logging.Logger.getLogger(Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addVehicleButton5;
    private javax.swing.JPanel checkRidesButton;
    private javax.swing.JPanel currentRideButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JTextArea repair;
    private javax.swing.JPanel repairButton1;
    private javax.swing.JPanel settingsButton;
    private javax.swing.JPanel submitButton;
    // End of variables declaration//GEN-END:variables
}
