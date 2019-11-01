package com.demo.ElectricBill.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
    
private static Connection con=null;
    static {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
        	 Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject?user=root&password=");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    public static Connection getConnection() {
        return con;
    }
}
