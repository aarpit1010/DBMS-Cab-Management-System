/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author user
 */
public class Vehicle {

    private String Model, Version, Color, plateNo, registrationDate, expirationDate;
    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;

    Vehicle() {

    }

    Vehicle(String Model, String Version, String Color, String plateNo,
            String registrationDate, String expirationDate) {
        this.Model = Model;
        this.Version = Version;
        this.Color = Color;
        this.plateNo = plateNo;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }
//    public String getAssigned()
//    {
//        return assigned;
//    }

    public String getModel() {
        return Model;
    }

    public String getVersion() {
        return Version;
    }

    public String getColor() {
        return Color;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public String getregistrationDate() {
        return registrationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void deleteVehicle(String id, String type) {

        String model = "";
        String version = "";
        String color = "";
        String plate = "";
        String regDate = "";
        String expDate = "";
        String name = "";
        int ass = -1;
        String dId = "";
        String fromm = "";
        String too = "";
        String newPlate = "";
        int newId = -1;
        String newName = "";

        DbConnection conn = new DbConnection();
        // Retrieve details of vehicle if it is Car
        

        if (type.equals("Car")) {
            try {
                conn.OpenConnection();
                String select_sql = "Select * from CarT where CarId='" + id + "'";
                rst = conn.GetData(select_sql);
                int count =0;
                while (rst.next()) {
                    model = rst.getString("Model");
                    version = rst.getString("Version");
                    color = rst.getString("Color");
                    plate = rst.getString("PlateNo");
                    regDate = rst.getString("RegistrationDate");
                    expDate = rst.getString("ExpirationDate");
                    name = rst.getString("CarName");
                    ass = rst.getInt("Assigned");
                    count++;

//              matching=rst.getString("ID");
                    System.out.println(name);
//                checkId=1;
                    
                }
                conn.CloseConnection();
                        if(count==0){
                        JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
                    }
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
            }

        }
        if (type.equals("Bus")) {
            try {
                conn.OpenConnection();
                String select_sql = "Select * from BusT where BusId='" + id + "'";
                rst = conn.GetData(select_sql);
                int count =0;
                while (rst.next()) {
                    model = rst.getString("Model");
                    version = rst.getString("Version");
                    color = rst.getString("Color");
                    plate = rst.getString("PlateNo");
                    regDate = rst.getString("RegistrationDate");
                    expDate = rst.getString("ExpirationDate");
                    name = rst.getString("BusName");
                    ass = rst.getInt("Assigned");
                    count++;
//           matching=rst.getString("ID");
                    System.out.println(name);
//           checkId=1;
                }
                
                conn.CloseConnection();
                if(count==0){
                        JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
                    }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
            }

        }

        if (type.equals("Rickshaw")) {
            try {
                conn.OpenConnection();
                String select_sql = "Select * from RicksawT where RickshawId='" + id + "'";
                rst = conn.GetData(select_sql);
                int count =0;
                while (rst.next()) {
                    model = rst.getString("Model");
                    version = rst.getString("Version");
                    color = rst.getString("Color");
                    plate = rst.getString("PlateNo");
                    regDate = rst.getString("RegistrationDate");
                    expDate = rst.getString("ExpirationDate");
                    name = rst.getString("RickshawName");
                    ass = rst.getInt("Assigned");
                    count++;
//           matching=rst.getString("ID");
                    System.out.println(name);
//           checkId=1;
                }
                conn.CloseConnection();
                if(count==0){
                        JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
                    }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid ID\n"
                        + "Search again with valid ID");
                return;
            }
        }

        if (ass == 0) {
            //Delete from Respective Table (CarT/ BustT/ RickshawT)
            if (type.equals("Car")) {
                try {
                    DbConnection comm = new DbConnection();
                    comm.OpenConnection();
                    String sql = "DELETE from CarT WHERE CarId = '" + id + "'";

                    int flagg = comm.InsertUpdateDelete(sql);

                    if (flagg == 1) {
                        JOptionPane.showMessageDialog(null, "Car removal Sucess");
                    } else {
                        JOptionPane.showMessageDialog(null, "Car removal FAILED");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            if (type.equals("Bus")) {
                try {
                    DbConnection comm = new DbConnection();
                    comm.OpenConnection();
                    String sql = "DELETE from BusT WHERE BusId = '" + id + "'";

                    int flagg = comm.InsertUpdateDelete(sql);

                    if (flagg == 1) {
                        JOptionPane.showMessageDialog(null, "Bus removal Sucess");
                    } else {
                        JOptionPane.showMessageDialog(null, "Bus removal FAILED");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            if (type.equals("Rickshaw")) {
                try {
                    DbConnection comm = new DbConnection();
                    comm.OpenConnection();
                    String sql = "DELETE from RickshawT WHERE RickshawId = '" + id + "'";

                    int flagg = comm.InsertUpdateDelete(sql);

                    if (flagg == 1) {
                        JOptionPane.showMessageDialog(null, "Rickshaw removal SUCESS");
                    } else {
                        JOptionPane.showMessageDialog(null, "Rickshaw removal FAILED");
                    }
                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            return;
        } else {

            //CAR
            if (type.equals("Car")) {
//                int newAss=1;
                int checkAss = -1;
                int i = 1;
                int total = 0;
                try {
//                DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    String sql = "SELECT CarId FROM CarT ORDER BY CarId DESC LIMIT 1";

                    rst = conn.GetData(sql);

                    while (rst.next()) {
                        total = rst.getInt("CarId");
                    }

                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last CarId");
                }
                total = total + 1;
                while (i < total) {

                    try {

                        conn.OpenConnection();
                        String sql = "Select Assigned from CarT where CarId = '" + i + "'";
                        rst = conn.GetData(sql);

                        while (rst.next()) {
                            checkAss = rst.getInt("Assigned");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + "\nCheck Car ID Error");
                    }

                    if (checkAss == 0) {
                        break;
                    }

                    i++;
                }
                if (i < total) {
                    newId = i;
                    int flag;
                    try {
                        conn.OpenConnection();
                        String sql = "UPDATE CarT SET Assigned = '" + "1" + "' "
                                + "where CarId = '" + newId + "'";

                        flag = conn.InsertUpdateDelete(sql);
                        if (flag == 1) {
                            JOptionPane.showMessageDialog(null, ""
                                    + "Car's Availablity Updated ");

                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "No Car Available. Try again later. ");

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Update car availability Query Failed");
                    }

                    //FETCH NEW CAR DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from CarT where CarId='" + newId + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            newPlate = rst.getString("PlateNo");
                            newName = rst.getString("CarName");
//                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch new vehicle ID");
                        return;
                    }

                    // GETTING DRIVER ID TO UPDATE HIS DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from DriverCarT "
                                + "where CarID='" + id + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            dId = rst.getString("DriverUsername");
                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch driver ID");
                        return;
                    }

                    //Updating his details
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "Update DriverCarT Set CarID = '" + newId
                                + "' where DriverUsername"
                                + " = '" + dId + "'";

                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "DriverCarT details Update Success");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "DriverCarT details Update Failed");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                    //Delete Car
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "DELETE from CarT WHERE CarId = '" + id + "'";

                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Car removal Sucess");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Car removal FAILED");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Can't delete vehicle "
                            + "as it is assigned to a driver and "
                            + "no extra vehicle is available.");
                    return;
                }
            }

            //RICKSHAW
            if (type.equals("Rickshaw")) {
//                int newAss=1;
                int checkAss = -1;
                int i = 1;
                int total = 0;
                try {
//                DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    String sql = "SELECT RickshawId FROM RickshawT "
                            + "ORDER BY RickshawId DESC LIMIT 1";

                    rst = conn.GetData(sql);

                    while (rst.next()) {
                        total = rst.getInt("RickshawId");
                    }

                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + "\n"
                            + "Couldn't Select Last RickshawId");
                }
                total = total + 1;
                while (i < total) {

                    try {

                        conn.OpenConnection();
                        String sql = "Select Assigned from RickshawT "
                                + "where RickshawId = '" + i + "'";
                        rst = conn.GetData(sql);

                        while (rst.next()) {
                            checkAss = rst.getInt("Assigned");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + "\n"
                                + "Check Rickshaw ID Error");
                    }

                    if (checkAss == 0) {
                        break;
                    }

                    i++;
                }
                if (i < total) {
                    newId = i;
                    int flag;
                    try {
                        conn.OpenConnection();
                        String sql = "UPDATE RickshawT SET Assigned = '"
                                + "1" + "' where RickshawId = '" + newId + "'";

                        flag = conn.InsertUpdateDelete(sql);
                        if (flag == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Rickshaw's Availablity Updated ");

                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "No Car Available. Try again later. ");

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Update Rickshaw availability Query Failed");
                    }

                    //FETCH NEW Rickshaw DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from RickshawT "
                                + "where RickshawId='" + newId + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            newPlate = rst.getString("PlateNo");
                            newName = rst.getString("RickshawName");
//                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch new vehicle ID");
                        return;
                    }

                    // GETTING DRIVER ID TO UPDATE HIS DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from DriverRickshawT "
                                + "where RickshawID='" + id + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            dId = rst.getString("DriverUsername");
                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch driver ID");
                        return;
                    }

                    //Updating his details
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "Update DriverRickshawT Set RickshawID = '" + newId + "' where DriverUsername"
                                + " = '" + dId + "'";

                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "DriverRickshawT details Update Success");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "DriverRickshawT details Update Failed");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                    //Delete Car
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "DELETE from RickshawT "
                                + "WHERE RickshawId = '" + id + "'";

                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Rickshaw removal Sucess");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Rickshaw removal FAILED");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Can't delete vehicle "
                            + "as it is assigned to a driver and no "
                            + "extra vehicle is available.");
                    return;
                }
            }

            //BUS
            if (type.equals("Bus")) {
//                int newAss=1;
                int checkAss = -1;
                int i = 1;
                int total = 0;
                try {
//                DbConnection conn = new DbConnection();
                    conn.OpenConnection();
                    String sql = "SELECT BusId FROM BusT ORDER BY BusId DESC LIMIT 1";

                    rst = conn.GetData(sql);

                    while (rst.next()) {
                        total = rst.getInt("BusId");
                    }

                    conn.CloseConnection();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + "\n"
                            + "Couldn't Select Last BusId");
                }
                total = total + 1;
                while (i < total) {

                    try {

                        conn.OpenConnection();
                        String sql = "Select Assigned from BusT where BusId = '" + i + "'";
                        rst = conn.GetData(sql);

                        while (rst.next()) {
                            checkAss = rst.getInt("Assigned");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + "\nCheck Bus ID Error");
                    }

                    if (checkAss == 0) {
                        break;
                    }

                    i++;
                }
                if (i < total) {
                    newId = i;
                    int flag;
                    try {
                        conn.OpenConnection();
                        String sql = "UPDATE BusT SET Assigned = '" + "1" + "' "
                                + "where BusId = '" + newId + "'";

                        flag = conn.InsertUpdateDelete(sql);
                        if (flag == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Bus's Availablity Updated ");

                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "No Bus Available. Try again later. ");

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Update Bus availability Query Failed");
                    }

                    //FETCH NEW CAR DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from BusT where BusId='" + newId + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            newPlate = rst.getString("PlateNo");
                            newName = rst.getString("BusName");
                            fromm = rst.getString("Fromm");
                            too = rst.getString("Too");
//                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch new vehicle ID");
                        return;
                    }

                    // GETTING DRIVER ID TO UPDATE HIS DETAILS
                    try {
                        conn.OpenConnection();
                        String select_sql = "Select * from DriverBusT "
                                + "where BusID='" + id + "'";
                        rst = conn.GetData(select_sql);
                        while (rst.next()) {
                            dId = rst.getString("DriverUsername");
                            System.out.println(dId);
                        }
                        conn.CloseConnection();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unable to fetch driver ID");
                        return;
                    }

                    //Updating his details
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "Update DriverBusT Set BusID = '" + newId + "',"
                                + " Fromm = '" + fromm + ""
                                + "',Too = '" + too + "' where DriverUsername ="
                                + " '" + dId + "'";
                        System.out.println(sql);
                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "DriverBusT details Update Success");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "DriverBusT details Update Failed");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                    //Delete Car
                    try {
                        DbConnection comm = new DbConnection();
                        comm.OpenConnection();
                        String sql = "DELETE from BusT WHERE BusId = '" + id + "'";

                        int flagg = comm.InsertUpdateDelete(sql);

                        if (flagg == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Bus removal Sucess");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Bus removal FAILED");
                        }
                        conn.CloseConnection();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Can't delete vehicle "
                            + "as it is assigned to a driver and no "
                            + "extra vehicle is available.");
                    return;
                }
            }
        }
    }
//   public void updateAssign(String assign)
//    {
//        this.assigned=assign;
//    }

}
