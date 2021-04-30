/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehler;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.awt.TextField;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.*;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import javafx.runtime.*;
import java.net.URL;
import java.util.regex.*;

/**
 *
 * @author user
 */
public class BookRide extends javax.swing.JFrame {

    /**
     * Creates new form BookRide
     */
    private String username;
    private String name;
    private WebEngine engine;
    private Stage stage;
    private WebView browser;
    private JFXPanel jfxPanel;
    private JButton swingButton;
    private WebEngine webEngine;
    private String url = "https://www.google.com/maps";

    public BookRide(String username, String name) {
//        setUndecorated(false);
//        setOpaque(false)
        this.username = username;
        this.name = name;
        initComponents();
        run();
//        jFXPanel1.setVisible(false);

    }

    public void run() {
        new JFXPanel();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // if you change the UI, do it here !

                browser = new WebView();
//    webEngine = browser.getEngine();
//    webEngine.load("http://www.google.com");
//    WebView wv=new WebView();
                engine = browser.getEngine();
//    jFXPanel1.setScene(scene);
                jFXPanel1.setScene(new Scene(browser));
//    jFXPanel1.setZoomFactors();
                engine.load(url);
                String urll = browser.getEngine().getLocation()+"/";
                System.out.println(urll);
                if(urll.equals("https://www.google.com/maps/")) {
//                    System.out.println("sadcsklfvjdkgbhv");
                }
                else {
                    String saddr = urll.substring(urll.indexOf("saddr=") + 5);
                    System.out.println(saddr);
                    String daddr = urll.substring(urll.indexOf("daddr=") + 5);
                    System.out.println(daddr);
                    String curr = saddr.substring(saddr.indexOf("=")+1);
                    curr = saddr.substring(1, saddr.indexOf("&"));
                    curr = curr.replace('+', ' ');
                    String fdest = daddr.substring(daddr.indexOf("=")+1);
                    fdest = daddr.substring(1, daddr.indexOf("/"));
                    fdest = fdest.replace('+', ' ');
                    System.out.println(curr);
                    System.out.println(fdest);
//                    System.out.println(browser.getEngine().getLocation());
                }
            }

        });
    }

    public BookRide() {
//        initComponents();
    }

    String currentLocation = "ZZZ";
    String finalLocation = "ZZZ";

//    @FXML
//    private WebView webView;
////    
//    @FXML
//    private TextField textField;
//    private WebEngine engine;
//    
//    public void initialize(URL arg0, ResourceBundle arg1) {
//        engine=webView.getEngine();
//        loadPage();
//    }
//    public void loadPage() {
//        engine.load("http://www.google.com");
//    }
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("JavaFX WebView Example");
//
//        WebView webView = new WebView();
//
//        webView.getEngine().load("http://google.com");
//
//        VBox vBox = new VBox(webView);
//        Scene scene = new Scene(vBox, 960, 600);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }
//    private static void initAndShowGUI() {
//        // This method is invoked on the EDT thread
//        JFrame frame = new JFrame("Swing and JavaFX");
//        final JFXPanel fxPanel = new JFXPanel();
//        frame.add(fxPanel);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Platform.runLater(new Runnable() {
//            @Override
//            public void run() {
//                initFX(fxPanel);
//            }
//       });
//    }
//
//    private static void initFX(JFXPanel fxPanel) {
//        // This method is invoked on the JavaFX thread
//        Scene scene = createScene();
//        fxPanel.setScene(scene);
//    }
//
//    private static Scene createScene() {
//        Group  root  =  new  Group();
//        Scene  scene  =  new  Scene(root, Color.ALICEBLUE);
//        Text  text  =  new  Text();
//        
//        text.setX(40);
//        text.setY(100);
//        text.setFont(new Font(25));
//        text.setText("Welcome JavaFX!");
//
//        root.getChildren().add(text);
//
//        return (scene);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        bookRideButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        myRidesButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        busRidesButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        toCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        mapbutton = new javax.swing.JButton();
        jFXPanel1 = new javafx.embed.swing.JFXPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(64, 34, 107));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vehler");

        bookRideButton.setBackground(new java.awt.Color(64, 34, 107));
        bookRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseExited(evt);
            }
        });
        bookRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Book Ride");
        bookRideButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_Key_25px.png"))); // NOI18N
        bookRideButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton.setBackground(new java.awt.Color(64, 34, 107));
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

        myRidesButton.setBackground(new java.awt.Color(64, 34, 107));
        myRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseExited(evt);
            }
        });
        myRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("My Rides");
        myRidesButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        myRidesButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        busRidesButton.setBackground(new java.awt.Color(64, 34, 107));
        busRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseExited(evt);
            }
        });
        busRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Bus Rides");
        busRidesButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Bus_25px.png"))); // NOI18N
        busRidesButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton.setBackground(new java.awt.Color(64, 34, 107));
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
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookRideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(busRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(bookRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(myRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(busRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 646));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Select your pickup location.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, -1, -1));

        fromCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ashraf Colony", "Malir1", "Malir2", "Qaidabad", "DHA", "Clifton", "4 Minaar", "Dhoraji", "Bahria University", "Sir Syed University", "Quaid-e-Azam Tomb", "Hyperstar Mall", "Bahria College NORE1", "Dalmia", "Gulshan Chowrangi", "Gulistan-e-Johar", "Gulshan-e-Iqbal", "Kemari", "Landhi", "Malir", "Quaidabad", "Landhi Town", "Korangi Town", "North Nazimabad Town", "New Karachi Town", "Gulberg Town", "Liaquatabad Town", "Malir Town", "Bin Qasim Town", "Gadap Town", "Kiamari Town", "S.I.T.E Town", "Baldia Town", "Orangi Town", "Lyari Town", "Saddar Town", "Jamshed Town", "Gulshan Town", "Shah Faisal Town" }));
        jPanel2.add(fromCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 180, 230, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Select your Ride.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, -1, -1));

        toCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quaiabad", "Malir1", "Malir2", "DHA", "Clifton", "4 Minaar", "Dhoraji", "Bahria University", "Sir Syed University", "Quaid-e-Azam Tomb", "Hyperstar Mall", "Bahria College NORE1", "Dalmia", "Gulshan Chowrangi", "Gulistan-e-Johar", "Gulshan-e-Iqbal", "Kemari", "Landhi", "Malir", "Quaidabad", "Landhi Town", "Korangi Town", "North Nazimabad Town", "New Karachi Town", "Gulberg Town", "Liaquatabad Town", "Malir Town", "Bin Qasim Town", "Gadap Town", "Kiamari Town", "S.I.T.E Town", "Baldia Town", "Orangi Town", "Lyari Town", "Saddar Town", "Jamshed Town", "Gulshan Town", "Shah Faisal Town" }));
        toCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toComboActionPerformed(evt);
            }
        });
        jPanel2.add(toCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 230, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Where do you want to go?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Car_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 130, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Three_Wheel_Car_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 250, 160, 130));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Tram_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, 160, 130));

        jPanel4.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(255, 255, 255));
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

        ypanel.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        mapbutton.setBackground(new java.awt.Color(64, 34, 107));
        mapbutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        mapbutton.setForeground(new java.awt.Color(255, 255, 255));
        mapbutton.setText("<html><center> Maps <br> (Direction)</center>  </html> ");
        mapbutton.setActionCommand("Maps");
        mapbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(mapbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, -1, -1));

        jFXPanel1.setAutoscrolls(true);
        jFXPanel1.setOpaque(true);
        jPanel2.add(jFXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 560, 560));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1364, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseClicked
        // TODO add your handling code here:
//        BookRide br=new BookRide(username,pname);
//        this.setVisible(false);
//        br.setVisible(true);
    }//GEN-LAST:event_bookRideButtonMouseClicked

    private void bookRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseEntered
        // TODO add your handling code here:
        bookRideButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_bookRideButtonMouseEntered

    private void bookRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseExited
        // TODO add your handling code here:
        bookRideButton.setBackground(new Color(64, 34, 107));
    }//GEN-LAST:event_bookRideButtonMouseExited

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
        removeVehicleButton.setBackground(new Color(64, 34, 107));
    }//GEN-LAST:event_removeVehicleButtonMouseExited

    private void myRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseClicked
        // TODO add your handling code here:
        MyRides mr = new MyRides(username, name);
        this.setVisible(false);
        mr.setVisible(true);
    }//GEN-LAST:event_myRidesButtonMouseClicked

    private void myRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseEntered
        // TODO add your handling code here:
        myRidesButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_myRidesButtonMouseEntered

    private void myRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseExited
        // TODO add your handling code here:
        myRidesButton.setBackground(new Color(64, 34, 107));
    }//GEN-LAST:event_myRidesButtonMouseExited

    private void busRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseClicked
        // TODO add your handling code here:
        PassengerBusRides pbr = new PassengerBusRides(username, name);
        this.setVisible(false);
        pbr.setVisible(true);
    }//GEN-LAST:event_busRidesButtonMouseClicked

    private void busRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseEntered
        // TODO add your handling code here:
        busRidesButton.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_busRidesButtonMouseEntered

    private void busRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseExited
        // TODO add your handling code here:
        busRidesButton.setBackground(new Color(64, 34, 107));
    }//GEN-LAST:event_busRidesButtonMouseExited

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
        logOutButton.setBackground(new Color(64, 34, 107));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(204, 204, 204));

    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        BookBus bookbus = new BookBus(username, name);
        this.setVisible(false);
        bookbus.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        // System.out.println(s.replace(' ','+'));
        currentLocation = String.valueOf(fromCombo.getSelectedItem());
        finalLocation = String.valueOf(toCombo.getSelectedItem());
        
        String url = "http://maps.google.com/maps?saddr=Amritsar&daddr=Jalandhar/";
        String saddr = url.substring(url.indexOf("saddr=") + 5);
//        System.out.println(saddr);
        String daddr = url.substring(url.indexOf("daddr=") + 5);
//        System.out.println(daddr);
        String curr = saddr.substring(saddr.indexOf("=")+1);
        curr = saddr.substring(1, saddr.indexOf("&"));
        String dest = daddr.substring(daddr.indexOf("=")+1);
        dest = daddr.substring(1, daddr.indexOf("/"));
        
        System.out.println(curr);
        System.out.println(dest);
        
        
        JOptionPane.showMessageDialog(null, "PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverRickshaw dr = new DriverRickshaw();
        int iidd = dr.assignDriver(username, name, currentLocation, finalLocation);
        String dname = dr.getRRDriverName(iidd);
        String cname = dr.getRRRickshawName(iidd);
        JOptionPane.showMessageDialog(null, "YOUR RIDE HAS BEEN BOOKED \n "
                + "DRIVER's NAME : " + dname + "\n RICKSHAW NAME : " + cname);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jPanel1MouseEntered


    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        // System.out.println(currentLocation.replace(' ','+'));
        currentLocation = String.valueOf(fromCombo.getSelectedItem());
        finalLocation = String.valueOf(toCombo.getSelectedItem());
        
        String url = "http://maps.google.com/maps?saddr=Amritsar&daddr=Jalandhar";
        String saddr = url.substring(url.indexOf("saddr=") + 2);
        System.out.println(saddr);
        
        JOptionPane.showMessageDialog(null, "PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverCar dr = new DriverCar();
        int iidd = dr.assignDriver(username, name, currentLocation, finalLocation);
        String dname = dr.getRRDriverName(iidd);
        String cname = dr.getRRCarName(iidd);
        JOptionPane.showMessageDialog(null, "YOUR RIDE HAS BEEN BOOKED \n "
                + "DRIVER's NAME : " + dname + "\n CAR NAME : " + cname);

    }//GEN-LAST:event_jPanel1MouseClicked

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xpanelMouseClicked

    private void xpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseEntered
        // TODO add your handling code here:
        xpanel.setBackground(new Color(153, 51, 255));
    }//GEN-LAST:event_xpanelMouseEntered

    private void xpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseExited
        // TODO add your handling code here:
        xpanel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(BookRide.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        ypanel.setBackground(new Color(153, 51, 255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        ypanel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_ypanelMouseExited

    private void toComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toComboActionPerformed

    private void mapbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapbuttonActionPerformed
        // TODO add your handling code here:

        jFXPanel1.setVisible(true);

        try {
            URL myurl = new URL("https://www.google.com/");

            // currentLocation=String.valueOf(fromCombo.getSelectedItem());
            // finalLocation=String.valueOf(toCombo.getSelectedItem());
            if ((currentLocation == "ZZZ") || (finalLocation == "ZZZ")
                    || (this.currentLocation == "ZZZ") || (this.finalLocation == "ZZZ")) {
                JOptionPane.showMessageDialog(null, "Location Not Defined, Book Ride First");
            } else {
                String source = currentLocation.replace(' ', '+');
                String dest = finalLocation.replace(' ', '+');

                String URL1
                        = "http://maps.google.com/maps?saddr=" + source + "&daddr=" + dest;

                String URL2
                        = "http://maps.google.com/maps/dir/" + source + "/" + dest;

                url = String.valueOf(java.net.URI.create(URL1));
//                BookRide r1=new BookRide();    
                run();
//                java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL1));
//                System.out.println(browser.getEngine().getLocation());
                
            }
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

//          WebEngine engine = webView.getEngine();
//          engine.load("http://www.google.com");

    }//GEN-LAST:event_mapbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookRide().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addVehicleButton5;
    private javax.swing.JPanel bookRideButton;
    private javax.swing.JPanel busRidesButton;
    private javax.swing.JComboBox fromCombo;
    private javafx.embed.swing.JFXPanel jFXPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JButton mapbutton;
    private javax.swing.JPanel myRidesButton;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JComboBox toCombo;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
