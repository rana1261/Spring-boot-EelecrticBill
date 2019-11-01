package com.demo.ElectricBill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.ElectricBill.model.BillPay;
import com.demo.ElectricBill.model.Registration;
import com.demo.ElectricBill.util.DButil;

public class CombineInsert {

    public static int insertData(Registration reg, BillPay bp) {
        Connection con = null;
        PreparedStatement pst = null;
        int result = 0;
        con = DButil.getConnection();
        try {

            pst = con.prepareStatement("insert into savetable(username,password,name,father,mobile,division,district,thana,address,paytype,tranid,bill) values (?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, reg.getUserName());
            pst.setString(2, reg.getPassword());
            pst.setString(3, reg.getName());
            pst.setString(4, reg.getFatherName());
            pst.setString(5, reg.getMobileNumber());
            pst.setString(6, reg.getDivision());
            pst.setString(7, reg.getDistrict());
            pst.setString(8, reg.getThana());
            pst.setString(9, reg.getAddress());
            pst.setString(10, bp.getPaytype());
            pst.setString(11, bp.getTranid());
            pst.setString(12, bp.getBill());

            result = pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
