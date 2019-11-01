
<%@page import="java.sql.ResultSet"%>
<%@page import="com.demo.ElectricBill.util.DButil"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <meta charset="utf-8">
        <meta name="description" content="Onlin Bill Payment">
        <meta name="keywords" content="Admin checking bill amount,Name,password,Mobile Payment type,Transaction ID,Bangladesh Power Development Board(BPDB)">
        <meta name="author" content="Md. Sohel Rana">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="refresh" content="10">
       
        <link rel="shortcut icon" href="image/logo.png" />

        <link rel="stylesheet" href="css/admin.css" type="text/css">
    </head>
    <body>
        <div class="page_margin">


            <div class="header_container">
                <img src="image/logo.png" alt="Header Logo" class="image1">

                <div class="header_content">
                    <h1>Bangladesh Power Development Board</h1>
                </div>


            </div>

            <ul>
            
                <li><a href="home">Home</a></li>
                <li><a href="RegistrationForm">Registration</a></li>
                <li><a href="BillPay">Bill Pay</a></li>
                <li><a href="billReceipt_login">Bill Receipt</a></li>
                <li><a class="active" href="AdminData">Admin</a></li>
                <li><a href="Admin_login">Logout</a></li>
                <li style="float:right"><a href="about">About</a></li>
            
            
            
                <!--  <li><a  href="Home.jsp">Home</a></li>
                <li><a href="RegistrationForm.jsp">Registration</a></li>
                <li><a  href="BillPay.jsp">Bill Pay</a></li>
                <li><a href="billReceipt_login.jsp">Bill Receipt</a></li>
                <li><a class="active" href="AdminData.jsp">Admin</a></li>
                <li><a href="Admin_login.jsp">Logout</a></li>
                <li style="float:right"><a href="about.jsp">About</a></li>
                -->
            </ul>
            <div class="admintable">
                <%
                    Connection con = null;
                    PreparedStatement pst = null;
                    con =DButil.getConnection();
                    pst = con.prepareStatement(" select name,father,mobile,division,district,thana,address,paytype,tranid,bill,bid,username,password from registration r,billpay b where r.rusername=b.username");
                    ResultSet rs = pst.executeQuery();
                %>


                <table>
                    <caption>Bill Payer Detail Information</caption>
                    <tr>
                        <th>Name</th>
                        <th>Father</th> 
                        <th>Mobile</th>
                        <th>Division</th>
                        <th>District</th>
                        <th>Thana/Upazila</th>
                        <th>Address</th>
                        <th>Pay Type</th>
                        <th>Transaction ID</th>
                        <th>Bill</th>
                        <th>Delete</th>
                        <th>Save</th>
                    </tr>
                    <% while (rs.next()) {%>
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td><%=rs.getString(6)%></td>
                        <td><%=rs.getString(7)%></td>
                        <td><%=rs.getString(8)%></td>
                        <td><%=rs.getString(9)%></td>
                        <td><%=rs.getString(10)%></td>
                        <td><a href='DeleteServlet?id=<%=rs.getInt(11)%>'>Delete</a></td>
                        <td><a href='SaveTableServlet?username=<%=rs.getString(12)%>&password=<%=rs.getString(13)%>'>Save</a></td>
                    </tr>
                    <% }%>
                </table>
            </div>

            <%
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                response.setHeader("Pragma", "no-cache");
                response.setHeader("Expires", "0");

                if (session.getAttribute("username") == null) {
                    response.sendRedirect("Admin_login");
                }
            %>
           
            <footer>Copyright &copy; Sohel Rana</footer>
        </div>
    </body>
</html>