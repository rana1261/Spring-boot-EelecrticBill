package com.demo.ElectricBill.ElectricBillController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.ElectricBill.dao.BillPayCurd;
import com.demo.ElectricBill.model.BillPay;

@WebServlet(urlPatterns = "/Bill", loadOnStartup = 1)
public class BillPayServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String susername = req.getParameter("username");
        String spassword = req.getParameter("Password");
        String spaytype = req.getParameter("payment");
        String stranid = req.getParameter("trannsaction_id");
        String sbill = req.getParameter("bill");
        
        BillPay obj=new BillPay(susername,spassword,spaytype,stranid,sbill);
        int a= BillPayCurd.insertData(obj);
        if(a>0){
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Good job!', 'Bill Pay Successful.', 'success');");
            out.println("});");
            out.println("</script>");

            RequestDispatcher rd = req.getRequestDispatcher("BillPay");
            rd.include(req, res);
        }else{
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Oops', 'Something went wrong!', 'error');");
            out.println("});");
            out.println("</script>");

            RequestDispatcher rd = req.getRequestDispatcher("BillPay");
            rd.include(req, res);
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}