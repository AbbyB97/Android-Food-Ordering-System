# virtualW
This app can be implemented in restaurant for easier management and keeping track of all the orders. 

The prerequisites of this project are:
1) LAN Wifi (can also work without Internet)
2) Java 1.7.0_02 (The newer version does'nt work properly so make sure you get this one :) )




To run this project you have to do just 2 steps.

1) Open finalize_order.java inside :virtualW\app\src\main\java\com\lakj\comspace\simpletextclient
   change the 211th line of code i.e.client = new Socket("192.168.1.105", 4444); to the ip adress of your system.
   to get the ip adress- 1)Run CMD , write ipconfig hit enter.
                         2)Now, note down the ipv4 adress under Wireless LAN adapter WIFI..
                         3)Put that IP in place of "192.168.1.105"
2) Open cmd , write : setpath ="//the path of 1.7 java wherever you have installed it"
3) now compile the file Loading.java under server and run it :)
                         
