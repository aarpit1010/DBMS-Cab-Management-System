

<h1 align="center">
    THE VEHICO 
</h1>

<h3 align="center">A Vehicle Management System for Vehicles, Drivers & Passengers.</h3>

---
<br>

# Abstract

<h4> Vehico is a Vehicle Management System built in Java using MySQL for queries. </h4>
<br>

* The aim of this project was to develop an application that could manage vehicles, drivers as well as the passengers.
* It supports multiple vehicle (Car, Rickshaw, Bus) features and functionalities.
* Allows passengers to book car/rickshaw/bus ride.
* Google Maps Integration helps in entering Source and Destination.
* Also, route/path between source and destination can be viewed for different vehicles.
* Keeps accurate records for any type of vehicle.
* Keeps track of Driver, Passengers and other employee ledgers.

<br> 

# Tech Stack

* Java Swing (NetBeans v12.1)
* JDBC for `PHPMyAdmin (MySQL)` Connectivity
* SQL (queries)

<br> 

# Dependencies

* NetBeans
* MySQL
* JavaFX-SDK-16

<br>

# Getting Started

* Install Netbeans & import this project.
* Install JavaFX-SDK-16
* Add the [Libraries](https://drive.google.com/drive/folders/128n7fQVWfDO438E0JGWCyQDgkbhs4lTt?usp=sharing).
* Also add Libraries from `lib` folder after installing `JavaFX-SDK-16`. 

* Add ***```--module-path "PATH to lib folder in JavaFX-SDK-16"``` <br>
    ```--add-modules=javafx.controls,javafx.fxml,javafx.web,javafx.media,javafx.swing```***.

* Open the file **[`/src/Vehico/DbConnection.java`](https://github.com/aarpit1010/DBMS-Cab-Management-System/blob/main/src/Vehico/DbConnection.java)**, alter URL depending upon your MySQL Server, Username and Password.
* Database (SQL file) is present in **[`/Database`](https://github.com/aarpit1010/DBMS-Cab-Management-System/tree/main/DataBase)** folder.
* Admin account username: **`1`** <br>
  Admin account password : **`y`**
* For Driver & Passenger, register and proceed.

<br>

# Modules

There are mainly 3 modules in this project.

### Admin Management

* Add Vehicle
* View Vehicle Details
* Delete Vehicle 
* Ban Driver
* View Rides History
* Vehicle Repair History
* Manage Fuel Price


### Driver Management

* Upon signing up, driver selects the kind of vehicle he/she drives and are alloted a vehicle (if vacant).
* Option for turning ride status as online and start picking rides.
* View Previous Rides
* Check for Current Ride and update ride status (AtPickup / Running / Completed).
* On completion of ride, distance is noted and Bill is calculated. 

### Passenger Management

* Passengers need to sign up, and login thereafter.
* Upon logging in, they can Book Car / Rickshaw / Bus Rides.
* From the **Google Maps** (integrated), they can enter `From` and `To` locations and begin the ride.
* Directions are available via Google Maps for various vehicle routes.
* Car & Driver Details can be viewed anytime.
* Passengers Ride History

<br>







