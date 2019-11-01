package com.demo.ElectricBill.ElectricBillController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.ElectricBill.dao.BillReceipt;

@WebServlet(urlPatterns = "/BillReceipLoginServlet", loadOnStartup = 1)
public class BillReceipLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        String suname = req.getParameter("username");
        String spassword = req.getParameter("Password");

        boolean a = BillReceipt.getData(suname, spassword);

        if (a) {
            HttpSession session = req.getSession();
            session.setAttribute("username", suname);
            res.sendRedirect("billReceipt");
        } else {
            res.sendRedirect("billWaitPage");
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
