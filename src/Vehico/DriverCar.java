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
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DriverCar implements Driver {

    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;

    private String name;
    private String fatherName;
    private String gender;
    private String securityQ;
    private String username;
    private String password;
    private String type, aadhar, contactNo, dob;

    DriverCar() {

    }

    DriverCar(String name, String fatherName, String gender,
            String securityQ, String username, String password,
            String type, String aadhar, String contactNo, String dob) {
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
        this.securityQ = securityQ;
        this.username = username;
        this.password = password;
        this.type = type;
        this.aadhar = aadhar;
        this.contactNo = contactNo;
        this.dob = dob;
    }

    public void changePassword(String username, String newPassword) {
        int flag;

        try {
            conn.OpenConnection();
            String sql = "UPDATE Driver SET Password = '" + newPassword
                    + "' where ID = '" + username + "'";

            flag = conn.InsertUpdateDelete(sql);
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "YOUR PASSWORD "
                        + "HAS BEEN CHANGED  ");
            } else {
                JOptionPane.showMessageDialog(null, "YOUR PASSWORD "
                        + "COULDn't BE CHANGED");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UpdatePassword Query Failed");
        }

    }

    public String getCnic() {
        return aadhar;
    }

    public String getContactno() {
        return contactNo;
    }

    public String getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getfName() {
        return fatherName;
    }

    public String getGender() {
        return gender;
    }

    public String getSecurityQ() {
        return securityQ;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean ConfirmCurrentRide(String username) {

        String matching = null;
//        "SELECT TOP 1 ID FROM DriverCarRT ORDER BY ID DESC"; 
        boolean flag = false;
        int idd = 0;
//        String sqlBill = "Select MAX(BillNumber) AS BillNumber 
//        FROM BillT where PID = '" + PID + "'"  ;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverCarRT "
                    + "where Username = '" + username + "'";
//            System.out.println(sql);
            rst = conn.GetData(sql);
            while (rst.next()) {
                idd = rst.getInt("ID");
//           matching=rst.getString("ID");
//                System.out.println(idd);
            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }

        try {
            conn.OpenConnection();
            String sql = "Select RideStatus FROM DriverCarRT where ID = " + idd + "";
            System.out.println(sql);
            rst = conn.GetData(sql);
            while (rst.next()) {
//                idd=rst.getInt("ID");
                matching = rst.getString("RideStatus");
//                System.out.println(matching);
            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }

        if (matching == null) {
            matching = "";
        }
        String j = matching;
        if (matching.equals("Running") || matching.equals("Built") || matching.equals(""
                + "AtPickUp") || matching.equals("")) {
            flag = true;

        }

        return flag;

    }

    public String getRType(String username) {
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select VehicleType from DriverCarT where DriverUsername = "
                    + "'" + username + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("VehicleType");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getVehicleType  Error");
        }
        return ass;

    }

    public String getDriverType(String username) {
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select Type from Driver where ID = '" + username + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("Type");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getVehicleType  Error");
        }
        return ass;

    }

    public boolean verifySecurityQ(String username, String securityQuestion) {
        boolean flag = false;

        try {
            conn.OpenConnection();
            String sql = "Select ID,SecurityQuestion from Driver where ID = "
                    + "'" + username + "' and SecurityQuestion "
                    + "= '" + securityQuestion + "'";

            rst = conn.GetData(sql);
            if (rst.next()) {
                flag = true;
            } else {
                flag = false;
            }
            conn.CloseConnection();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n Error");
        }
        return flag;
    }

    public String getType() {
        return type;
    }

    public void addDriver() {
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into Driver (ID, Password, Name, FatherName, "
                    + "Gender, SecurityQuestion,Type,aadhar,ContactNo,DOB) values ('"
                    + getUsername() + "','"
                    + getPassword() + "','"
                    + getName() + "','"
                    + getfName() + "','"
                    + getGender() + "','"
                    + getSecurityQ() + "','"
                    + getType() + "','"
                    + getCnic() + "','"
                    + getContactno() + "','"
                    + getDob() + "')";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "You Are Now "
                        + "Registered As A Driver");
            } else {
                JOptionPane.showMessageDialog(null, "Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean chkDriverPass(String id, String pass) {
        boolean flag = false;

        try {
            conn.OpenConnection();
            String sql = "Select ID,Password from Driver where ID = "
                    + "'" + id + "' and Password = '" + pass + "'";
            rst = conn.GetData(sql);
            if (rst.next()) {
                flag = true;

            } else {
                flag = false;
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCheckLogin ChkAdminPass Error");
        }
        return flag;
    }

    public void insertDriverCarData(String driverUsername, String driverName,
            String carPlate, String type, int carId, String carName) {
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into DriverCarT (DriverUsername, CarID) values ('"
                    + driverUsername + "','"
                    + carId + "')";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public String getRDriverName(String username) {
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select Name from Driver "
                    + "where ID = '" + username + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("Name");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRDriverName  Error");
        }
        return ass;
    }

    public String getRRDriverName(int Id) {

        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select Username from DriverCarRT where ID = '" + Id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("Username");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRRDriverName  Error");
        }

        return getRDriverName(ass);
    }

    public int getRCarId(String username) {
        int ass = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select CarID from DriverCarT "
                    + "where DriverUsername = '" + username + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getInt("CarID");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCheck Driver Error");
        }
//        System.out.println("CAR ID: "+ass);
        return ass;
    }

    public String getRCarName(String username) {
        int id = getRCarId(username);
//        System.out.println("CAR ID2: "+id);
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select CarName from CarT "
                    + "where CarId = '" + id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("CarName");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRCarName Error");
        }
//        System.out.println("CAR name: "+ass);
        return ass;
    }

    public String getRRCarName(int id) {
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select Username from DriverCarRT where ID = '" + id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("Username");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRRCarName Error");
        }
//        int car_id = getRCarId(ass);
        return getRCarName(ass);
    }

    public void insertAvailablity(String driverUsername, String driverName,
            String plateNo, int carId, String carName, int avail) {
        String contact = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into DriverCarRT (Username,"
                    + "CarId,DriverAvail) values ('"
                    + driverUsername + "','"
                    //                    + driverName + "','"
                    //                    + plateNo + "',"
                    + carId + "','"
                    //                    + carName + "','"
                    + avail + "')";

//            System.out.println("sql");
            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int no = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "SELECT ID FROM DriverCarRT "
                    + "where Username = '" + driverUsername + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                no = rst.getInt("ID");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        //Adeel
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select ContactNo from Driver "
                    + "where ID = '" + driverUsername + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                contact = rst.getString("ContactNo");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getDriverContact  Error");
        }
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into RideRealtime (ID,Username,"
                    + "VehicleId) values ('"
                    + "C" + no + "','"
                    + driverUsername + "','"
                    //                    + driverName + "','"
                    //                    + plateNo + "','"
                    + carId + ""
                    + //                    + carName + "','"
                    //                    + contact + 
                    "')";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int assignDriver(String pusername, String pname,
            String currentLocation, String finalLocation) {

        int newAss = 0;
        int ass = 5;
        int i = 1;

        int total = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "SELECT ID FROM DriverCarRT ORDER BY ID DESC LIMIT 1";
            rst = conn.GetData(sql);

            while (rst.next()) {
                total = rst.getInt("ID");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
//          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
            return -1;
        }
        total = total + 1;
        while (i < total) {

            try {
                DbConnection conn = new DbConnection();
                conn.OpenConnection();
                String sql = "Select DriverAvail from DriverCarRT where ID = '" + i + "'";
                rst = conn.GetData(sql);

                while (rst.next()) {
                    ass = rst.getInt("DriverAvail");

                }

//           conn.CloseConnection();
                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "\nCheck Driver ID Error");
            }

            if (ass == 1) {
                break;
            }

            i++;
        }
        if (i < total) {
            DbConnection conn = new DbConnection();
            int flag;
            try {
                conn.OpenConnection();
                String sql = "UPDATE DriverCarRT SET DriverAvail = " + newAss + " where ID = " + i + "";

                flag = conn.InsertUpdateDelete(sql);
                if (flag == 1) {
//                   JOptionPane.showMessageDialog(null, "YOU HAVE BEEN ASSIGNED DRIVER. HIS DRIVER ID IS :  "+i);
                } else {
                    JOptionPane.showMessageDialog(null, "No Car Available ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "UpdateBill Query Failed");
            }
            try {
                DbConnection comm = new DbConnection();
                conn.OpenConnection();
                String sql = "UPDATE DriverCarRT SET PUsername = '" + pusername + "',"
                        + "Fromm ='" + currentLocation + "',"
                        + "Too='" + finalLocation + "' where ID = " + i + "";

                int flagg = comm.InsertUpdateDelete(sql);

                if (flagg == 1) {

                } else {
                    JOptionPane.showMessageDialog(null, "Insertion Failed asdfghjk");
                }
                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String contact = null;
            try {
                DbConnection conn2 = new DbConnection();
                conn2.OpenConnection();
                String sql = "Select ContactNo from PassengerT where PID = '" + pusername + "'";
                rst = conn2.GetData(sql);

                while (rst.next()) {
                    contact = rst.getString("ContactNo");

                }

                //           conn.CloseConnection();
                conn2.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "\n getPassengerContact  Error");
            }

            try {
                DbConnection comm = new DbConnection();
                conn.OpenConnection();
                String sql = "UPDATE RideRealtime SET PUsername = '" + pusername + "',"
                        + "Fromm ='" + currentLocation + "',Too='" + finalLocation + "' "
                        //                        "',"
                        //                        + "PassengerContactNo='" + contact + "' "
                        + "where ID = 'C" + String.valueOf(i) + "'";

//                System.out.println(sql);
                int flagg = comm.InsertUpdateDelete(sql);

                if (flagg == 1) {

                } else {
                    JOptionPane.showMessageDialog(null, "Insertion Failed abc");
                }

                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
//            try {
//                DbConnection comm = new DbConnection();
//                conn.OpenConnection();
//                String sql = "UPDATE DriverCarRT SET PName = '" + pname + "' where ID = " + i + "";
//
//                int flagg = comm.InsertUpdateDelete(sql);
//
//                if (flagg == 1) {
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Insertion Failed dfghjhgf");
//                }
//                conn.CloseConnection();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//            try {
//                DbConnection comm = new DbConnection();
//                conn.OpenConnection();
//                String sql = "UPDATE RideRealtime SET PName = '" + pname + "' where ID = 'C" + i + "'";
//                int flagg = comm.InsertUpdateDelete(sql);
//
//                if (flagg == 1) {
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Insertion Failed cvbnm");
//                }
//
//                conn.CloseConnection();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
            return i;
        } else {
            return -1;
        }

    }

    public String getRCarPlate(String username) {
        int id = getRCarId(username);
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select PlateNo from CarT where CarId = '" + id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("PlateNo");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCheck Driver Error");
        }
        return ass;
    }

    public void banDriver(String username) {

        // To BAN/DELETE Driver, .. 
        // 1. Find Car details for that driver
        // 2. Find personal info from Driver table
        // 3. Add to BanDriver
        // 4. Remove/Delete from Driver Table
        // 5. Delete from DriverCarT ... but that would delete the car entry too if assigned??
        // HISTORY FOR THAT DRIVER WILL BE DELETED FOREVER PERMANENTLY...
        // since assigned flag for car is 0 for banned driver, that car could be given to another driver, so
        // no problem by deleting driver from DriverCarT...
        String Id = "";
        String password = "";
        String name = "";
        String fname = "";
        String gender = "";
        String security = "";
        String type = "";
        String aadhar = "";
        String mobile = "";
        String dob = "";
        String checkType = "";

        DbConnection conn = new DbConnection();
        int checkUsername = 0;    //Checking valid Username
        // driver username is given => extracting CarID from DriverCarT
        try {
            conn.OpenConnection();
            String select_sql = "Select ID,Type from Driver where ID='" + username + "'";
            System.out.println(select_sql);
            rst = conn.GetData(select_sql);
            while (rst.next()) {
                Id = rst.getString("ID");
                checkType = rst.getString("Type");
//           matching=rst.getString("ID");
                System.out.println("HELLP");
                checkUsername = 1;
            }
            conn.CloseConnection();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Driver Username\nSearch again with valid username");
            return;
        }

        System.out.println(checkType);
        if (checkUsername == 1) {
            String vehicle = "";
            if (checkType.equals("Car")) {
                try {
                    conn.OpenConnection();
                    String select_sql = "Select CarID from DriverCarT where DriverUsername='" + username + "'";
                    System.out.println(select_sql);
                    rst = conn.GetData(select_sql);
                    while (rst.next()) {
                        vehicle = rst.getString("CarID");
//                checkType = rst.getString("Type");
//           matching=rst.getString("ID");
                        System.out.println("HELLP");
//                checkUsername = 1;
                    }
                    conn.CloseConnection();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid Driver Username\nSearch again with valid username");
                    return;
                }
            } else if (checkType.equals("Rickshaw")) {
                try {
                    conn.OpenConnection();
                    String select_sql = "Select RickshawID from DriverRickshawT where DriverUsername='" + username + "'";
                    System.out.println(select_sql);
                    rst = conn.GetData(select_sql);
                    while (rst.next()) {
                        vehicle = rst.getString("RickshawID");
//                checkType = rst.getString("Type");
//           matching=rst.getString("ID");
                        System.out.println("HELLP");
//                checkUsername = 1;
                    }
                    conn.CloseConnection();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid Driver Username\nSearch again with valid username");
                    return;
                }
            } else {
                try {
                    conn.OpenConnection();
                    String select_sql = "Select BusID from DriverBusT where DriverUsername='" + username + "'";
                    System.out.println(select_sql);
                    rst = conn.GetData(select_sql);
                    while (rst.next()) {
                        vehicle = rst.getString("BusID");
//                checkType = rst.getString("Type");
//           matching=rst.getString("ID");
                        System.out.println("HELLP");
//                checkUsername = 1;
                    }
                    conn.CloseConnection();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid Driver Username\nSearch again with valid username");
                    return;
                }
            }
            // Extracting all Driver personal info from Driver Table

            try {
                conn.OpenConnection();
                String select_sql = "Select * from Driver where ID='" + username + "'";
                rst = null;
                rst = conn.GetData(select_sql);
                //            System.out.println(rst.getObject("*"));
//                System.out.println(select_sql);
                //            rst.absoulte(1);

                while (rst.next()) {
//                    System.out.println(rst.getString("ID"));
                    password = rst.getString("Password");
                    name = rst.getString("Name");
                    fname = rst.getString("FatherName");
                    gender = rst.getString("Gender");
                    security = rst.getString("SecurityQuestion");
                    type = rst.getString("Type");
                    aadhar = rst.getString("aadhar");
                    mobile = rst.getString("ContactNo");
                    dob = rst.getString("DOB");
                    //                System.out.println("HHHHH");
                    //           System.out.println(rst.getInt("ID"));
//                    System.out.println(rst.getString("Password"));
                }
                conn.CloseConnection();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Get Car Data Query Failed");
                return;
            }

            // Adding Banned Driver to New Table BanDriver   
            try {
                conn.OpenConnection();
                String sql = "Insert into BanDriver (ID, CarId, Password, Name, "
                        + "FatherName, Gender, SecurityQuestion, Type, "
                        + "aadhar, ContactNo, DOB) values ('"
                        + username + "','"
                        + vehicle + "','"
                        + password + "','"
                        + name + "','"
                        + fname + "','"
                        + gender + "','"
                        + security + "','"
                        + type + "','"
                        + aadhar + "','"
                        + mobile + "','"
                        + dob + "')";

                System.out.println(sql + "  ??");
//System.out.println(sql);
                int flag = conn.InsertUpdateDelete(sql);

                if (flag == 1) {
//                   JOptionPane.showMessageDialog(null, "Driver inserted in Ban Driver");
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion into Ban Failed");
                }
                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            // Deleting Driver from from its own information table (Driver)
            try {
                DbConnection comm = new DbConnection();
                comm.OpenConnection();
                String sql = "DELETE from Driver WHERE ID = '" + username + "'";

                int flagg = comm.InsertUpdateDelete(sql);

                if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Driver Banned");
                } else {
                    JOptionPane.showMessageDialog(null, "Driver Ban Failed");
                }
                comm.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            // If a Car was assigned to that deleted Driver, its assigned flag is updated to 0 in CarT table. 
            if (checkType.equals("Car")) {
                try {
                    //        DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    int newAss = 0;
                    String sql = "Update CarT set Assigned='" + newAss + "' where CarId= '" + vehicle + "'";

                    int flagg = conn.InsertUpdateDelete(sql);

                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Car status updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "Car status update failed");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                // Deleting Driver & Car from DriverCarT ...
                try {
                    DbConnection comm = new DbConnection();
                    comm.OpenConnection();
                    String sql = "DELETE from DriverCarT WHERE DriverUsername = '" + username + "'";

                    int flagg = comm.InsertUpdateDelete(sql);

                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Driver & Car link Deleted");
                    } else {
//                        JOptionPane.showMessageDialog(null, "Driver & Car removal FAILED");
                    }
                    comm.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                JOptionPane.showMessageDialog(null, "Driver Banned");
            } else if (checkType.equals("Rickshaw")) {
                try {
                    //        DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    int newAss = 0;
                    String sql = "Update RickshawT Set Assigned='" + newAss + "' where RickshawId= '" + vehicle + "'";

                    int flagg = conn.InsertUpdateDelete(sql);

                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Car status updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "R status update failed");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                // Deleting Driver & Car from DriverCarT ...
                try {
//                    DbConnection comm = new DbConnection();
                    conn.OpenConnection();
                    String sql = "DELETE from DriverRickshawT WHERE DriverUsername = '" + username + "'";

                    int flagg = conn.InsertUpdateDelete(sql);
                    System.out.println(flagg);
                    System.out.println(sql);
                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Driver & Car link Deleted");
                    } else {
//                        JOptionPane.showMessageDialog(null, "Driver & R removal FAILED");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                JOptionPane.showMessageDialog(null, "Driver Banned");
            } else {
                try {
                    //        DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    int newAss = 0;
                    String sql = "Update BusT set Assigned='" + newAss + "' where BusId= '" + Id + "'";

                    int flagg = conn.InsertUpdateDelete(sql);

                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Car status updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "Bus status update failed");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                // Deleting Driver & Car from DriverCarT ...
                try {
                    DbConnection comm = new DbConnection();
                    comm.OpenConnection();
                    String sql = "DELETE from DriverBusT WHERE DriverUsername = '" + username + "'";

                    int flagg = comm.InsertUpdateDelete(sql);

                    if (flagg == 1) {
//                   JOptionPane.showMessageDialog(null, "Driver & Car link Deleted");
                    } else {
//                        JOptionPane.showMessageDialog(null, "Driver & Bus removal FAILED");
                    }
                    comm.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                JOptionPane.showMessageDialog(null, "Driver Banned");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Invalid Driver Username\nSearch again with valid username");
        }

    }

    public ResultSet getDriverData() {
        DbConnection conn = new DbConnection();
        try {
            conn.OpenConnection();
            String select_sql = "Select ID,Name,FatherName,Gender from Driver ";
            rst = conn.GetData(select_sql);
            do {
                return rst;
            } while (rst.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GetDriverData Query Failed");
        }
        conn.CloseConnection();
        return null;

    }

    public ResultSet getCarData() {
        DbConnection conn = new DbConnection();
        try {
            conn.OpenConnection();
            String select_sql = "Select * from CarT ";
            rst = conn.GetData(select_sql);
            do {
                return rst;
            } while (rst.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Get Car Data Query Failed");
        }
        conn.CloseConnection();
        return null;

    }

    public ResultSet getBusData() {
        DbConnection conn = new DbConnection();
        try {
            conn.OpenConnection();
            String select_sql = "Select * from BusT ";
            rst = conn.GetData(select_sql);
            do {
                return rst;
            } while (rst.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Get Bus Data Query Failed");
        }
        conn.CloseConnection();
        return null;

    }

    public ResultSet getRickshawData() {
        DbConnection conn = new DbConnection();
        try {
            conn.OpenConnection();
            String select_sql = "Select * from RickshawT ";
            rst = conn.GetData(select_sql);
            do {
                return rst;
            } while (rst.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Get Rickshaw Data Query Failed");
        }
        conn.CloseConnection();
        return null;

    }
}
