package com.demo.ElectricBill.ElectricBillController;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.ElectricBill.dao.BillPayCurd;
import com.demo.ElectricBill.dao.CURDOperation;
import com.demo.ElectricBill.dao.CombineInsert;
import com.demo.ElectricBill.model.BillPay;
import com.demo.ElectricBill.model.Registration;

@WebServlet(urlPatterns = "/SaveTableServlet", loadOnStartup = 1)
public class SaveTableServlet extends HttpServlet {

   
	private static final long serialVersionUID = 1L;


	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        String susername = request.getParameter("username");
        String spassword = request.getParameter("password");
        Registration reg = CURDOperation.readSingleData(susername);
        BillPay bp = BillPayCurd.readSingleData(susername,spassword);
        
        

        int a=CombineInsert.insertData(reg, bp);
        if(a>0){
            RequestDispatcher rd=request.getRequestDispatcher("saveSuccessfull");
            rd.forward(request, response);

        }else{
        RequestDispatcher rd=request.getRequestDispatcher("saveFailed");
            rd.forward(request, response);
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
