package com.demo.ElectricBill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.ElectricBill.model.BillPay;
import com.demo.ElectricBill.util.DButil;

public class BillPayCurd {

    public static int insertData(BillPay obj) {
        Connection con = null;
        PreparedStatement pst = null;

        int value = 0;

        try {
            con = DButil.getConnection();
            pst = con.prepareStatement("insert into billpay (username,password,paytype,tranid,bill)values (?,?,?,?,?)");
            pst.setString(1, obj.getUsername());
            pst.setString(2, obj.getPassword());
            pst.setString(3, obj.getPaytype());
            pst.setString(4, obj.getTranid());
            pst.setString(5, obj.getBill());
            value = pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return value;
    }



    public static int deleteData(int id) {
        Connection con = null;
        PreparedStatement pst = null;
        int result = 0;
        con = DButil.getConnection();
        try {
            pst = con.prepareStatement("delete from billpay where bid = ?");
            pst.setInt(1, id);

            result = pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static BillPay readSingleData(String uname, String pass) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        BillPay bp = new BillPay();
        con = DButil.getConnection();
        try {
            pst = con.prepareStatement("select * from billpay where username = ? and password=?");
            pst.setString(1, uname);
            pst.setString(2, pass);
            rs = pst.executeQuery();

            while (rs.next()) {
                bp.setUsername(rs.getString("username"));
                bp.setPassword(rs.getString("password"));
                bp.setPaytype(rs.getString("paytype"));
                bp.setTranid(rs.getString("tranid"));
                bp.setBill(rs.getString("bill"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return bp;
    }
}