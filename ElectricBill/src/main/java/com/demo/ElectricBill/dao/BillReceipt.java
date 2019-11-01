package com.demo.ElectricBill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.ElectricBill.util.DButil;

public class BillReceipt {

    public static boolean getData(String uname, String pass) {
        Connection con = null;
        PreparedStatement pst = null;
        con = DButil.getConnection();
        ResultSet rs=null;
        boolean value=false;
        try {

            pst = con.prepareStatement("select * from savetable where username=? and password=?");
            pst.setString(1, uname);
            pst.setString(2, pass);
            rs = pst.executeQuery();
             if (rs.next()) {
                value=true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return value;
    }
}
