
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehico;

/**
 *
 * @author user
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import net.proteanit.sql.DbUtils;
import javax.swing.table.*;

public class RidesHistory extends javax.swing.JFrame {

    private String adminusername;

    /**
     * Creates new form BanDriver
     *
     *
     *
     */
    public RidesHistory() {

    }

    public RidesHistory(String adminusername) {
//          this.setLocationRelativeTo(null);
        this.adminusername = adminusername;
        initComponents();
        ResultSet rst;
        ResultSet rst2;
        ResultSet rst3;
        try {
            Admin p = new Admin();
            rst = p.RideRealTimeCombined();
            int count = 0;
            DbConnection conn = new DbConnection();

            while (rst.next()) {
                String date = rst.getString("Datee");
                String dname = rst.getString("Username");

                String type = "";

                try {
                    conn.OpenConnection();
                    String select_sql = "Select Type from Driver where ID='" + dname + "'";
                    rst2 = conn.GetData(select_sql);
                    while (rst2.next()) {

                        type = rst2.getString("Type");
//                    System.out.println(name);
//                checkId=1;
                    }
                    conn.CloseConnection();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid ID\n"
                            + "Search again with valid ID");

//                    return;
                }

                if (type.equals("Car")) {
                    DriverCar d = new DriverCar();
                    int id = d.getRCarId(dname);
                    String pname = rst.getString("PUsername");
                    String fromm = rst.getString("Fromm");
                    String too = rst.getString("Too");
                    String start = rst.getString("StartTime");
                    String end = rst.getString("EndTime");
                    String ridestatus = rst.getString("RideStatus");
                    String billstatus = rst.getString("BillStatus");
                    double bill = rst.getDouble("Bill");
                    int passengers = rst.getInt("NoOfPassengers");
                    String rideid=rst.getString("iD");

                    Object[] row = {date,rideid, dname, id, type, pname, fromm, too, start, end, ridestatus, billstatus, bill, passengers};

                    DefaultTableModel model = (DefaultTableModel) RidesHistoryTable.getModel();

                    model.addRow(row);
                    count = count + 1;
                    System.out.println(count);
                } else if (type.equals("Rickshaw")) {
                    DriverRickshaw d = new DriverRickshaw();
                    int id = d.getRRickshawId(dname);
                    String pname = rst.getString("PUsername");
                    String fromm = rst.getString("Fromm");
                    String too = rst.getString("Too");
                    String start = rst.getString("StartTime");
                    String end = rst.getString("EndTime");
                    String ridestatus = rst.getString("RideStatus");
                    String billstatus = rst.getString("BillStatus");
                    double bill = rst.getDouble("Bill");
                    int passengers = rst.getInt("NoOfPassengers");
                    String rideid=rst.getString("iD");

                    Object[] row = {date,rideid, dname, id, type, pname, fromm, too, start, end, ridestatus, billstatus, bill, passengers};

                    DefaultTableModel model = (DefaultTableModel) RidesHistoryTable.getModel();

                    model.addRow(row);
                    count = count + 1;
                    System.out.println(count);
                } else {
                    DriverBus d = new DriverBus();
                    int id = d.getRBusId(dname);
                    
                    
                    String rideid=rst.getString("iD");
                    String rideid2=rideid.substring(1);
                    int rideID=Integer.parseInt(rideid2);
                    
                    String pname = "";
                    
                    try {
                    conn.OpenConnection();
                    String select_sqll = "Select PUsername from PassengerBusRides where iD='" + rideID + "'";
                    rst3 = conn.GetData(select_sqll);
                    while (rst3.next()) {

                        pname = rst3.getString("PUsername");
                        String fromm = rst.getString("Fromm");
                    String too = rst.getString("Too");
                    String start = rst.getString("StartTime");
                    String end = rst.getString("EndTime");
                    String ridestatus = rst.getString("RideStatus");
                    String billstatus = rst.getString("BillStatus");
                    double bill = rst.getDouble("Bill");
                    int passengers = rst.getInt("NoOfPassengers");

                    Object[] row = {date, rideid,dname, id, type, pname, fromm, too, start, end, ridestatus, billstatus, bill, passengers};

                    DefaultTableModel model = (DefaultTableModel) RidesHistoryTable.getModel();

                    model.addRow(row);
                    count = count + 1;
                    System.out.println(count);
//                    System.out.println(name);
//                checkId=1;
                    }
                    conn.CloseConnection();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid ID\n"
                            + "Search again with valid ID");

//                    return;
                }
                    
                    
                    
                    
                }

            }
//            System.out.println(count);
//            RidesHistoryTable.setModel(DbUtils.resultSetToTableModel(rst));

//            int i=RidesHistoryTable.getRowCount();
//            for(int j=0;j<i;j++){
//                String username=(String)RidesHistoryTable.getModel().getValueAt(i, 1);
//                DriverCar d= new DriverCar();
//                int id;
//                id = d.getRCarId(username);
//                RidesHistoryTable.getModel().setValueAt(String.valueOf(id),i, 2);
//                
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ride History  Error");
        }

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
        addVehicleButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        banDriverButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ridesHistoryButton = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RidesHistoryTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fuelButton = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        rephisbutton = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        manageVehicle = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(25, 25, 112));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vehico");

        addVehicleButton.setBackground(new java.awt.Color(25, 25, 112));
        addVehicleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addVehicleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButtonMouseExited(evt);
            }
        });
        addVehicleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Add Vehicle");
        addVehicleButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        addVehicleButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

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

        banDriverButton.setBackground(new java.awt.Color(25, 25, 112));
        banDriverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banDriverButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                banDriverButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                banDriverButtonMouseExited(evt);
            }
        });
        banDriverButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Ban Driver");
        banDriverButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Denied_25px.png"))); // NOI18N
        banDriverButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        ridesHistoryButton.setBackground(new java.awt.Color(25, 25, 112));
        ridesHistoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ridesHistoryButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ridesHistoryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ridesHistoryButtonMouseExited(evt);
            }
        });
        ridesHistoryButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Rides History");
        ridesHistoryButton.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Clock_25px.png"))); // NOI18N
        ridesHistoryButton.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

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

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Here's list of Vehico's Rides");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        RidesHistoryTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RidesHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "RideID", "DriverUsername", "VehicleId", "Vehicle type", "PassengerUname", "From", "To", "StartTime", "EndTime", "RideStatus", "BillStatus", "Bill", "NoOfPassengers"
            }
        ));
        RidesHistoryTable.setGridColor(new java.awt.Color(255, 255, 255));
        RidesHistoryTable.setSelectionBackground(new java.awt.Color(51, 0, 102));
        jScrollPane1.setViewportView(RidesHistoryTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1020, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 330, 20));

        fuelButton.setBackground(new java.awt.Color(25, 25, 112));
        fuelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fuelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fuelButtonMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-petrol-25.png"))); // NOI18N
        jLabel14.setText("       Fuel Price");

        javax.swing.GroupLayout fuelButtonLayout = new javax.swing.GroupLayout(fuelButton);
        fuelButton.setLayout(fuelButtonLayout);
        fuelButtonLayout.setHorizontalGroup(
            fuelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fuelButtonLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fuelButtonLayout.setVerticalGroup(
            fuelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fuelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        rephisbutton.setBackground(new java.awt.Color(25, 25, 112));
        rephisbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rephisbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rephisbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rephisbuttonMouseExited(evt);
            }
        });
        rephisbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("View Repair History");
        rephisbutton.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Clock_25px.png"))); // NOI18N
        rephisbutton.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        manageVehicle.setBackground(new java.awt.Color(25, 25, 112));
        manageVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageVehicleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageVehicleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageVehicleMouseExited(evt);
            }
        });
        manageVehicle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Manage Vehicle");
        manageVehicle.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        manageVehicle.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fuelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ridesHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                    .addComponent(banDriverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(rephisbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(manageVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(addVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(manageVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ridesHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fuelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rephisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1436, 682));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButtonMouseClicked
        // TODO add your handling code here:
        AddVehicle addvehicle = new AddVehicle(adminusername);
        this.setVisible(false);
        addvehicle.setVisible(true);
    }//GEN-LAST:event_addVehicleButtonMouseClicked

    private void addVehicleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButtonMouseEntered
        // TODO add your handling code here:
        addVehicleButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_addVehicleButtonMouseEntered

    private void addVehicleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButtonMouseExited
        // TODO add your handling code here:
        addVehicleButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_addVehicleButtonMouseExited

    private void addVehicleButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseEntered

    private void addVehicleButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseExited

    private void removeVehicleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseEntered
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_removeVehicleButtonMouseEntered

    private void removeVehicleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseExited
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_removeVehicleButtonMouseExited

    private void banDriverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banDriverButtonMouseClicked
        // TODO add your handling code here:
        BanDriver bd = new BanDriver(adminusername);
        this.setVisible(false);
        bd.setVisible(true);

    }//GEN-LAST:event_banDriverButtonMouseClicked

    private void banDriverButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banDriverButtonMouseEntered
        // TODO add your handling code here:
        banDriverButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_banDriverButtonMouseEntered

    private void banDriverButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banDriverButtonMouseExited
        // TODO add your handling code here:
        banDriverButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_banDriverButtonMouseExited

    private void ridesHistoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ridesHistoryButtonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ridesHistoryButtonMouseClicked

    private void ridesHistoryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ridesHistoryButtonMouseEntered
        // TODO add your handling code here:
        ridesHistoryButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_ridesHistoryButtonMouseEntered

    private void ridesHistoryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ridesHistoryButtonMouseExited
        // TODO add your handling code here:
        ridesHistoryButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_ridesHistoryButtonMouseExited

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // TODO add your handling code here:
        AdminSettings as = new AdminSettings(adminusername);
        this.setVisible(false);
        as.setVisible(true);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        // TODO add your handling code here:
        settingsButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // TODO add your handling code here:
        settingsButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_settingsButtonMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        LoginMain lm = new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(153, 102, 255));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(255, 255, 255));
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
        jPanel6.setBackground(new Color(153, 102, 255));
        jLabel17.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel6MouseExited

    private void fuelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelButtonMouseClicked
        // TODO add your handling code here:

        FuelPrice fuelprice = new FuelPrice(adminusername);
        this.setVisible(false);
        fuelprice.setVisible(true);
    }//GEN-LAST:event_fuelButtonMouseClicked

    private void rephisbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rephisbuttonMouseClicked
        // TODO add your handling code here:
        ViewRepairHis rephis = new ViewRepairHis(adminusername);
        this.setVisible(false);
        rephis.setVisible(true);

    }//GEN-LAST:event_rephisbuttonMouseClicked

    private void rephisbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rephisbuttonMouseEntered
        // TODO add your handling code here:
        rephisbutton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_rephisbuttonMouseEntered

    private void rephisbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rephisbuttonMouseExited
        // TODO add your handling code here:
        rephisbutton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_rephisbuttonMouseExited

    private void manageVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVehicleMouseClicked
        // TODO add your handling code here:
        ManageVehicle as = new ManageVehicle(adminusername);
        this.setVisible(false);
        as.setVisible(true);
    }//GEN-LAST:event_manageVehicleMouseClicked

    private void manageVehicleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVehicleMouseEntered
        // TODO add your handling code here:
        manageVehicle.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_manageVehicleMouseEntered

    private void manageVehicleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageVehicleMouseExited
        // TODO add your handling code here:
        manageVehicle.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_manageVehicleMouseExited

    private void fuelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelButtonMouseEntered
        // TODO add your handling code here:
        fuelButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_fuelButtonMouseEntered

    private void fuelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuelButtonMouseExited
        // TODO add your handling code here:
        fuelButton.setBackground(new Color(25, 25, 112));
    }//GEN-LAST:event_fuelButtonMouseExited

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
            java.util.logging.Logger.getLogger(RidesHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RidesHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RidesHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RidesHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RidesHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RidesHistoryTable;
    private javax.swing.JPanel addVehicleButton;
    private javax.swing.JPanel addVehicleButton5;
    private javax.swing.JPanel banDriverButton;
    private javax.swing.JPanel fuelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel manageVehicle;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JPanel rephisbutton;
    private javax.swing.JPanel ridesHistoryButton;
    private javax.swing.JPanel settingsButton;
    // End of variables declaration//GEN-END:variables
}
