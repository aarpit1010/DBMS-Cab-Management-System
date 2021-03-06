
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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DriverRickshaw implements Driver {

    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;

    private String name;
    private String fatherName;
    private String gender;
    private String securityQ;
    private String username;
    private String password, type, aadhar, contactNo, dob;

    DriverRickshaw() {

    }

    DriverRickshaw(String name, String fatherName, String gender, String securityQ, String username, String password, String type, String aadhar, String contactNo, String dob) {
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

    public String getCnic() {
        return aadhar;
    }

    public String getContactno() {
        return contactNo;
    }

    public String getDob() {
        return dob;
    }

    public boolean ConfirmCurrentRide(String username) {

        String matching = null;
//        "SELECT TOP 1 ID FROM DriverCarRT ORDER BY ID DESC"; 
        boolean flag = false;
        int idd = 0;
//        String sqlBill = "Select MAX(BillNumber) AS BillNumber FROM BillT where PID = '" + PID + "'"  ;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                idd = rst.getInt("ID");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverRickshawId");

        }

        try {
            conn.OpenConnection();
            String sql = "Select RideStatus FROM DriverRickshawRT where ID = " + idd + "";
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
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverRickshawId");
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
//
//        String j = matching;
//        if (matching.equals("Running") || matching.equals("Built") || matching.equals("AtPickUp")) {
//            flag = true;
//
//        }
//
//        return flag;

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

    public boolean verifySecurityQ(String username, String securityQuestion) {
        boolean flag = false;

        try {
            conn.OpenConnection();
            String sql = "Select ID,SecurityQuestion from Driver where ID = '" + username + "' and SecurityQuestion = '" + securityQuestion + "'";

            rst = conn.GetData(sql);
            if (rst.next()) {
                flag = true;
            } //             String answer=rst.getString("SecurityQuestion");
            //            
            //            if(answer==securityQuestion)
            //            {
            //                flag=true;
            //            }
            else {
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
            String sql = "Insert into Driver (ID, Password, Name,FatherName, Gender, SecurityQuestion, Type,aadhar,ContactNo,DOB) values ('"
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
                JOptionPane.showMessageDialog(null, "You Are Now Registered As Rickshaw Driver");
            } else {
                JOptionPane.showMessageDialog(null, "Couldn't Add Rickshaw Driver");
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
            String sql = "Select ID,Password from Driver where ID = '" + id + "' and Password = '" + pass + "'";
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

    public void insertDriverRickshawData(String driverUsername, String driverName, String type, String rickshawPlate, int RickshawId, String RickshawName) {
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into DriverRickshawT (DriverUsername, RickshawID) values ('"
                    + driverUsername + "','"
                    //                    + driverName + "','"
                    //                    + type + "','"
                    //                    + rickshawPlate + "','"
                    //                    + RickshawName + "'"
                    + RickshawId + "'"
                    //                    + ",'"
                    //                    + RickshawName + "'"
                    + ")";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "0 Insertion Failed");
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
            String sql = "Select Name from Driver where ID = '" + username + "'";
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
            String sql = "Select Username from DriverRickshawRT where ID = '" + Id + "'";
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

    public int getRRickshawId(String username) {
        int ass = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select RickshawID from DriverRickshawT where DriverUsername = '" + username + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getInt("RickshawID");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCheck Driver Error");
        }
        return ass;
    }

    public String getRRickshawPlate(String username) {
        int id = getRRickshawId(username);
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select PlateNo from RickshawT where RickshawId = '" + id + "'";
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

    public String getRRickshawName(String username) {
        int id = getRRickshawId(username);
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select RickshawName from RickshawT where RickshawId = '" + id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("RickshawName");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRRickshawName Error");
        }
        return ass;
    }

    public String getRRRickshawName(int id) {
        String ass = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select Username from DriverRickshawRT where ID = '" + id + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                ass = rst.getString("Username");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\n getRRRickshawName Error");
        }
        return getRRickshawName(ass);
    }

    public void insertAvailablity(String driverUsername, String driverName, String plateNo, int RickshawId, String RickshawName, int avail) {
        String contact = null;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Insert into DriverRickshawRT (Username, RickshawId,DriverAvail) values ('"
                    + driverUsername + "','"
                    //                    + driverName + "','"
                    //                    + plateNo + "','"
                    + RickshawId + "','"
                    //                    + RickshawName + "','"
                    + avail + "')";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "12 Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int no = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "SELECT ID FROM DriverRickshawRT where Username = '" + driverUsername + "'";
            rst = conn.GetData(sql);

            while (rst.next()) {
                no = rst.getInt("ID");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "Select ContactNo from Driver where ID = '" + driverUsername + "'";
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
            String sql = "Insert into RideRealtime (ID,Username, VehicleId) values ('"
                    + "R" + no + "','"
                    + driverUsername + "','"
                    //                    + driverName + "','"
                    //                    + plateNo + "','"
                    //                    + RickshawId + "','"
                    + RickshawId
                    //                    "','"
                    //                    + contact + ""
                    + "')";

            int flag = conn.InsertUpdateDelete(sql);

            if (flag == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "11 Insertion Failed");
            }
            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int assignDriver(String pusername, String pname, String currentLocation, String finalLocation) {

        int newAss = 0;
        int ass = 5;
        int i = 1;

        int total = 0;
        try {
            DbConnection conn = new DbConnection();
            conn.OpenConnection();
            String sql = "SELECT ID FROM DriverRickshawRT ORDER BY ID DESC LIMIT 1";
            rst = conn.GetData(sql);

            while (rst.next()) {
                total = rst.getInt("ID");

            }

//           conn.CloseConnection();
            conn.CloseConnection();
        } catch (Exception e) {
            return -1;
//          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverRickshawId");  
        }
        total = total + 1;
        while (i < total) {

            try {
                DbConnection conn = new DbConnection();
                conn.OpenConnection();
                String sql = "Select DriverAvail from DriverRickshawRT where ID = '" + i + "'";
                rst = conn.GetData(sql);

                while (rst.next()) {
                    ass = rst.getInt("DriverAvail");

                }

//           conn.CloseConnection();
                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "\n 1");
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
                String sql = "UPDATE DriverRickshawRT SET DriverAvail = '" + newAss + "' where ID = '" + i + "'";

                flag = conn.InsertUpdateDelete(sql);
                if (flag == 1) {
                    //               JOptionPane.showMessageDialog(null, "YOU HAVE BEEN ASSIGNED DRIVER. HIS DRIVER ID IS :  "+i);
                } else {
                    JOptionPane.showMessageDialog(null, " 2 : Sorry, No Rickshaw Available ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "3 : UpdateBill Query Failed");
            }
            try {
                DbConnection comm = new DbConnection();
                conn.OpenConnection();
                String sql = "UPDATE DriverRickshawRT SET PUsername = '" + pusername + "',Fromm ='" + currentLocation + "',Too='" + finalLocation + "' where ID = '" + i + "'";

                int flagg = comm.InsertUpdateDelete(sql);

                if (flagg == 1) {

                } else {
                    JOptionPane.showMessageDialog(null, "4: Insertion Failed");
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
                String sql = "UPDATE RideRealtime SET PUsername = '" + pusername + "',Fromm ='" + currentLocation + "',Too='" + finalLocation + "' where ID = 'R" + i + "'";
                int flagg = comm.InsertUpdateDelete(sql);

                if (flagg == 1) {

                } else {

                }

                conn.CloseConnection();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
//            try {
//                DbConnection comm = new DbConnection();
//                conn.OpenConnection();
//                String sql = "UPDATE DriverRickshawRT SET PName = '" + pname + "' where ID = '" + i + "'";
//
//                int flagg = comm.InsertUpdateDelete(sql);
//
//                if (flagg == 1) {
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "5: Insertion Failed");
//                }
//                conn.CloseConnection();
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//            try {
//                DbConnection comm = new DbConnection();
//                conn.OpenConnection();
//                String sql = "UPDATE RideRealtime SET PName = '" + pname + "' where ID = 'R" + i + "'";
//                int flagg = comm.InsertUpdateDelete(sql);
//
//                if (flagg == 1) {
//
//                } else {
//
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

    public String getRType(String username) {
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

}
