/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehler;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginMain extends javax.swing.JFrame {

    /**
     * Creates new form LoginMain
     */
    public LoginMain() {
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

        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginAsCombo = new javax.swing.JComboBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        TextPass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        LoginButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        forgotButton = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        SignUpButton = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(41, 144, 181));
        kGradientPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Vehicles at your footsteps");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(130, 180, 250, 40);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 64)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TheVehler");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(120, 90, 360, 120);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("LOGIN AS:");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(910, 220, 70, 19);

        LoginAsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Driver", "Passenger" }));
        LoginAsCombo.setOpaque(false);
        kGradientPanel1.add(LoginAsCombo);
        LoginAsCombo.setBounds(910, 260, 110, 20);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator4);
        jSeparator4.setBounds(910, 370, 270, 10);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("PASSWORD");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(910, 390, 76, 19);

        TextPass.setBackground(new java.awt.Color(0, 51, 153));
        TextPass.setForeground(new java.awt.Color(255, 255, 255));
        TextPass.setBorder(null);
        TextPass.setOpaque(false);
        TextPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPassFocusGained(evt);
            }
        });
        kGradientPanel1.add(TextPass);
        TextPass.setBounds(910, 410, 270, 30);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("USERNAME");
        kGradientPanel1.add(jLabel13);
        jLabel13.setBounds(910, 310, 90, 19);

        TextId.setBackground(new java.awt.Color(0, 51, 153));
        TextId.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TextId.setForeground(new java.awt.Color(255, 255, 255));
        TextId.setBorder(null);
        TextId.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        TextId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextIdFocusGained(evt);
            }
        });
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        kGradientPanel1.add(TextId);
        TextId.setBounds(910, 340, 270, 30);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator6);
        jSeparator6.setBounds(910, 450, 270, 10);

        LoginButton.setBackground(new java.awt.Color(26, 111, 145));
        LoginButton.setToolTipText("");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("EMAIL");
        LoginButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("SignIn");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        LoginButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(LoginButton);
        LoginButton.setBounds(920, 510, 150, 40);

        forgotButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        forgotButton.setForeground(new java.awt.Color(204, 204, 204));
        forgotButton.setText("Forgot Password?");
        forgotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotButtonMouseClicked(evt);
            }
        });
        kGradientPanel1.add(forgotButton);
        forgotButton.setBounds(1140, 520, 104, 16);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator2);
        jSeparator2.setBounds(1140, 540, 110, 10);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Don't have an account?");
        kGradientPanel1.add(jLabel16);
        jLabel16.setBounds(150, 550, 230, 16);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator7);
        jSeparator7.setBounds(150, 570, 150, 10);

        SignUpButton.setBackground(new java.awt.Color(26, 111, 145));
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseExited(evt);
            }
        });
        SignUpButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("SignUp");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        SignUpButton.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(SignUpButton);
        SignUpButton.setBounds(150, 590, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.png"))); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(20, 230, 530, 280);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator8);
        jSeparator8.setBounds(910, 290, 270, 10);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel1.add(jSeparator1);
        jSeparator1.setBounds(760, 230, 50, 320);

        jPanel1.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(0, 51, 153));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xpanelMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(0, 51, 153));
        ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ypanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ypanelMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(1180, 10, 83, 30);

        jPanel2.add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1307, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseExited
        // TODO add your handling code here:
        SignUpButton.setBackground(new Color(26, 111, 145));
    }//GEN-LAST:event_SignUpButtonMouseExited

    private void SignUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseEntered
        // TODO add your handling code here:
        SignUpButton.setBackground(new Color(51, 153, 153));
    }//GEN-LAST:event_SignUpButtonMouseEntered

    private void SignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        RegistrationForm reg = new RegistrationForm();
        reg.setVisible(true);
    }//GEN-LAST:event_SignUpButtonMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void forgotButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ForgotPasswordForm fp = new ForgotPasswordForm();
        fp.setVisible(true);
    }//GEN-LAST:event_forgotButtonMouseClicked

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        LoginButton.setBackground(new Color(26, 111, 145));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        LoginButton.setBackground(new Color(51, 153, 153));
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:

        if (TextId.getText().equals("") || TextPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill All Fields");
        } else {
            String LoginAs = String.valueOf(LoginAsCombo.getSelectedItem());
            Admin a = new Admin();
            DriverCar d = new DriverCar();
            Passenger passing = new Passenger();
            String iidd = TextId.getText();
            String pass = TextPass.getText();
            if (LoginAs == "Admin") {
                if (a.chkAdminPass(iidd, pass)) {
                    AdminHome ah = new AdminHome(iidd);
                    this.setVisible(false);
                    ah.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid UserID or Password");
                }

            } else if (LoginAs.equals("Driver")) {
                DriverCar checking = new DriverCar();
                if (checking.chkDriverPass(iidd, pass)) {
                    String answer = checking.getDriverType(iidd);
                    if (answer.equals("Car")) {
                        String dname = d.getRDriverName(iidd);
                        int carid = d.getRCarId(iidd);
                        String carName = d.getRCarName(iidd);
                        String type = "Car";
                        String plateNo = d.getRCarPlate(iidd);
                        DriverHome dh = new DriverHome(iidd, dname, type, plateNo, carid, carName);
                        this.setVisible(false);

                        dh.setVisible(true);
                    } else if (answer.equals("Rickshaw")) {
                        DriverRickshaw dr = new DriverRickshaw();
                        String dname = dr.getRDriverName(iidd);
                        int carid = dr.getRRickshawId(iidd);
                        String carName = dr.getRRickshawName(iidd);
                        String plateNo = dr.getRRickshawPlate(iidd);
                        String type = "Rickshaw";
                        DriverHome dh = new DriverHome(iidd, dname, type, plateNo, carid, carName);
                        this.setVisible(false);

                        dh.setVisible(true);
                    } else if (answer.equals("Bus")) {
                        DriverBus dr = new DriverBus();
                        String dname = dr.getRDriverName(iidd);
                        int carid = dr.getRBusId(iidd);
                        String carName = dr.getRBusName(iidd);
                        String plateNo = dr.getRBusPlate(iidd);
                        String type = "Bus";
                        DriverHome dh = new DriverHome(iidd, dname, type, plateNo, carid, carName);
                        this.setVisible(false);
                        dh.setVisible(true);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            } else if (LoginAs == "Passenger") {
                if (passing.chkPassPass(iidd, pass)) {

                    this.setVisible(false);
                    String pname = passing.getRPassengerName(iidd);
                    PassengerHome ph = new PassengerHome(iidd, pname);
                    //            BookRide psi=new BookRide(iidd,pname);
                    ph.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid UserID or Password");
                }

            }

        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        LoginButton.action(null, null);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextIdFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_TextIdFocusGained

    private void TextPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_TextPassFocusGained

    private void xpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseEntered
        // TODO add your handling code here:
        xpanel.setBackground(new Color(51, 153, 153));
    }//GEN-LAST:event_xpanelMouseEntered

    private void xpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseExited
        // TODO add your handling code here:
        xpanel.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        ypanel.setBackground(new Color(51, 153, 153));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        ypanel.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_ypanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(LoginMain.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xpanelMouseClicked

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox LoginAsCombo;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JPanel SignUpButton;
    private javax.swing.JTextField TextId;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JLabel forgotButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
