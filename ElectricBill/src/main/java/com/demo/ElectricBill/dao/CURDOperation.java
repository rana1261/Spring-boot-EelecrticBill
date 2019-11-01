package com.demo.ElectricBill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.ElectricBill.model.Registration;
import com.demo.ElectricBill.util.DButil;

public class CURDOperation {

    public static int insertData(Registration obj) {
        Connection con = null;
        PreparedStatement pst = null;
        int value = 0;
        try {

            con = DButil.getConnection();
            pst = con.prepareStatement("insert into registration (name,father,mobile,division,district,thana,address,rusername,rpassword) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getFatherName());
            pst.setString(3, obj.getMobileNumber());
            pst.setString(4, obj.getDivision());
            pst.setString(5, obj.getDistrict());
            pst.setString(6, obj.getThana());
            pst.setString(7, obj.getAddress());
            pst.setString(8, obj.getUserName());
            pst.setString(9, obj.getPassword());
            value = pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return value;
    }
    
//     public static List<Registration> retriveData() {
//        List<Registration> list = new ArrayList<Registration>();
//        Connection con = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        int result = 0;
//        con = DButil.getConnection();
//        try {
//            pst = con.prepareStatement(" select name,father,mobile,division,district,thana,address,paytype,tranid,bill,username,rpassword from registration r,billpay b where r.rusername=b.username");
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                Registration registration = new Registration();
//                registration.setName(rs.getString("name"));
//                registration.setFatherName("father");
//                registration.set
//               
//                
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return list;
//    }
    
    
  public static Registration readSingleData(String uname) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Registration reg = new Registration();
        con = DButil.getConnection();
        try {
            pst = con.prepareStatement("select * from registration where rusername = ?");
            pst.setString(1, uname);
            rs = pst.executeQuery();

            while (rs.next()) {
                
                reg.setName(rs.getString("name"));
                reg.setFatherName(rs.getString("father"));
                reg.setMobileNumber(rs.getString("mobile"));
                reg.setDivision(rs.getString("division"));
                reg.setDistrict(rs.getString("district"));
                reg.setThana(rs.getString("thana"));
                reg.setAddress(rs.getString("address"));
                reg.setUserName(rs.getString("rusername"));
                reg.setPassword(rs.getString("rpassword"));
         
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return reg;
    }
}
