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

@WebServlet(urlPatterns = "/DeleteServlet", loadOnStartup = 1)
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = res.getWriter();
        int sid = Integer.parseInt(req.getParameter("id"));
       
        
        int a=BillPayCurd.deleteData(sid);
        
        if(a==0){
            RequestDispatcher rd=req.getRequestDispatcher("deleteSuccessful");
            rd.forward(req, res);
        }else{
        RequestDispatcher rd=req.getRequestDispatcher("deleteFail");
            rd.forward(req, res);
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
