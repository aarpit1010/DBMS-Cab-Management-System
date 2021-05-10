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

public class Ride {

    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;

    public void updateRideStatus(String username, String rideStatus) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET RideStatus = '"
                    + rideStatus + "' where ID = 'C" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Ride Status Updated");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverCarRT SET RideStatus = '" + rideStatus + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateRideStatusRickshaw(String username, String rideStatus) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET RideStatus = '"
                    + rideStatus + "' where ID = 'R" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Ride Status Updated");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET RideStatus = '" + rideStatus + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateRideStatusBus(String username, String rideStatus) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverBusRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
        
        
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET RideStatus = '"
                    + "" + rideStatus + "' where iD = 'B" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "Ride Status Updated");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion RIDE Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//                try
//        {
//        DbConnection comm = new DbConnection();
//        conn.OpenConnection();
//        String sql = "UPDATE PassengerBusRides SET RideStatus = '"+ rideStatus +"' where iD = '"+mat+"'";
//         int flagg=comm.InsertUpdateDelete(sql);
//                 
//           if(flagg>=1){
////               JOptionPane.showMessageDialog(null, "PassengerBusRides RideStatus updated");
//           }
//           else{
//               JOptionPane.showMessageDialog(null, "a: Insertion  PASSFailed");
//           }
//      
//           conn.CloseConnection();
//          }
//        catch(Exception e){
//          JOptionPane.showMessageDialog(null, e);  
//        }
                        try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverBusRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
        System.out.println(sql);
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "RideStatus updated");
           }
           else{
               JOptionPane.showMessageDialog(null, "a: Insertion RT Failed");
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }

    }

    public void updateStartTimeDateCar(String username, String date, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET StartTime = '" + time + ""
                    + "',Datee='" + date + "' where ID = 'C" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            } else {
                JOptionPane.showMessageDialog(null, "e: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverCarRT SET StartTime = '" + time + "',Datee='" + date + "' where ID = " + mat + "";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "f: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateStartTimeDateRickshaw(String username, String date, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET StartTime = '" + time + ""
                    + "',Datee='" + date + "' where ID = 'R" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET StartTime = '" + time + "',Datee='" + date + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateStartTimeDateBus(String username, String date, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverBusRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;

//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET StartTime = '" + time + ""
                    + "',Datee='" + date + "' where iD = 'B" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            } else {
                JOptionPane.showMessageDialog(null, "b: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
//        try {
//            DbConnection comm = new DbConnection();
//            conn.OpenConnection();
//            String sql = "UPDATE PassengerBusRides SET StartTime = '" + time + ""
//                    + "',Datee='" + date + "' where iD = '" + mat + "'";
//            System.out.println(sql);
//            int flagg = comm.InsertUpdateDelete(sql);
//
//            if (flagg >= 1) {
////                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
//            } else {
//                JOptionPane.showMessageDialog(null, "b: Insertion Failed");
//            }
//
//            conn.CloseConnection();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverBusRT SET DriverAvail = '0' where ID = '" + mat + "'";
            System.out.println(sql);
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            } else {
                JOptionPane.showMessageDialog(null, "b: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverBusRT SET StartTime = '" + time + ""
                    + "',Datee='" + date + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
            } else {
                JOptionPane.showMessageDialog(null, "b: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateEndTimeDateCar(String username, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET EndTime = '" + time + "' "
                    + "where ID = 'C" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "End Time Updated ");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverCarRT SET EndTime = '" + time + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "b: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateEndTimeDateBus(String username, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverBusRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
        
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET EndTime = '" + time + "' "
                    + "where iD = 'B" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "End Time Updated");
            } else {
                JOptionPane.showMessageDialog(null, "f: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
//        try {
//            DbConnection comm = new DbConnection();
//            conn.OpenConnection();
//            String sql = "UPDATE PassengerBusRides SET EndTime = '" + time + "' "
//                    + "where iD = '" + mat + "'";
//            int flagg = comm.InsertUpdateDelete(sql);
//
//            if (flagg >= 1) {
////                JOptionPane.showMessageDialog(null, "End Time Updated");
//            } else {
//                JOptionPane.showMessageDialog(null, "f: Insertion Failed");
//            }
//
//            conn.CloseConnection();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverBusRT SET EndTime = '" + time + "' "
                    + "where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "End Time Updated");
            } else {
                JOptionPane.showMessageDialog(null, "f: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateEndTimeDateRickshaw(String username, String time) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET EndTime = '" + time + ""
                    + "' where ID = 'R" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "End Time Updated ");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET EndTime = '" + time + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateBillStatusCar(String username, String billStatus, double billCar) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET BillStatus = '" + billStatus + ""
                    + "',Bill = '" + billCar + "' where ID = 'C" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Bill Status Updated ");
            } else {
                JOptionPane.showMessageDialog(null, "c: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverCarRT SET BillStatus = '" + billStatus + "',Bill = '" + billCar + "' where ID = " + mat + "";
            System.out.println(sql);
            int flaggg = comm.InsertUpdateDelete(sql);

            if (flaggg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "d: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateBillStatusRickshaw(String username, String billStatus, double billRickshaw) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {

        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET BillStatus = '" + billStatus + "'"
                    + ",Bill = '" + billRickshaw + "' where ID = 'R" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
                JOptionPane.showMessageDialog(null, "Bill Status Updated ");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverRickshawRT SET BillStatus = '" + billStatus + "',Bill = '" + billRickshaw + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {

            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void updateBillStatusBus(String username, String billStatus, double billBus) {
        String matching = null;
        int mat = 0;
        try {
            conn.OpenConnection();
            String sql = "Select MAX(ID) AS ID FROM DriverBusRT where Username = '" + username + "'";

            rst = conn.GetData(sql);
            while (rst.next()) {
                mat = rst.getInt("ID");
                System.out.println(mat);
//           matching=rst.getString("RideStatus");

            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nCouldn't Select Last DriverCarId");
        }
        String j = matching;
        
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE RideRealtime SET BillStatus = '" + billStatus + ""
                    + "',Bill = '" + billBus + "' where ID = 'B" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "Bll Status UPDATED");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            DbConnection comm = new DbConnection();
            conn.OpenConnection();
            String sql = "UPDATE DriverBusRT SET BillStatus = '" + billStatus + ""
                    + "',Bill = '" + billBus + "' where ID = '" + mat + "'";
            int flagg = comm.InsertUpdateDelete(sql);

            if (flagg == 1) {
//                JOptionPane.showMessageDialog(null, "Bll Status UPDATED");
            } else {
                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
            }

            conn.CloseConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//        try {
//            DbConnection comm = new DbConnection();
//            conn.OpenConnection();
//            String sql = "UPDATE PassengerBusRides SET BillStatus = '" + billStatus + ""
//                    + "',Bill = '" + billBus + "' where iD = '" + mat + "'";
//            int flagg = comm.InsertUpdateDelete(sql);
//
//            if (flagg >= 1) {
//                JOptionPane.showMessageDialog(null, "Bll Status UPDATED");
//            } else {
//                JOptionPane.showMessageDialog(null, "a: Insertion Failed");
//            }
//
//            conn.CloseConnection();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

    }

    public ResultSet DriverRide(String username) {
        ResultSet rst1 = null;

        try {
            conn.OpenConnection();
            String sql = "Select iD,Datee,Username,PUsername,"
                    + "Fromm,Too,StartTime,EndTime,"
                    + "RideStatus,BillStatus,Bill,NoOfPassengers "
                    + "from RideRealtime where Username ='" + username + "'";
            rst1 = conn.GetData(sql);
            do {
                return rst1;
            } while (rst1.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nSelect DriverCarRT Error");
        }

        conn.CloseConnection();
        return null;
    }

}
