

<%@page import="java.sql.ResultSet"%>
<%@page import="com.demo.ElectricBill.util.DButil"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bill Receipt Page</title>
        <meta name="description" content="Onlin Bill Payment">
        <meta name="keywords" content="Admin login,Name,password,Mobile Payment type,Transaction ID,Bangladesh Power Development Board(BPDB)">
        <meta name="author" content="Md. Sohel Rana">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="refresh" content="120">
        <link rel="shortcut icon" href="image/logo.png" />
        <link rel="stylesheet" href="css/billReceipt.css" type="text/css">
        <script src="javaScript/billReceipt.js"></script>
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
                <li><a class="active" href="billReceipt_login">Bill Receipt</a></li>
                <li><a href="Admin_login">Admin</a></li>
                <li><a href="billReceipt_login">Logout</a></li>
                <li style="float:right"><a href="about">About</a></li>
            
            
            
            
               <!--   <li><a  href="Home.jsp">Home</a></li>
                <li><a href="RegistrationForm.jsp">Registration</a></li>
                <li><a  href="BillPay.jsp">Bill Pay</a></li>
                <li><a  class="active" href="billReceipt_login.jsp">Bill Receipt</a></li>
                <li><a  href="Admin_login.jsp">Admin</a></li>
                <li><a  href="billReceipt_login.jsp">Logout</a></li>
                <li style="float:right"><a href="about.jsp">About</a></li>
                -->
            </ul>


            <div  class="receipt_out_body">

                <div class="receipt_body" id="page">
                    <center><img src="image/logo.png" alt="Receipt Logo" class="receipt_logo" ></center>

                    <center style="margin-bottom:10px;"><h3>Bangladesh Power Development Board</h3></center>
                    <hr>

                    <div class="date"><span>Date & Time:</span>
                        <span  id="demo"></span></div>

                    <%
                        Connection con = null;
                        PreparedStatement pst = null;
                        con = DButil.getConnection();
                        pst = con.prepareStatement(" select * from savetable where username=?");
                        pst.setString(1, (String) session.getAttribute("username"));
                        ResultSet rs = pst.executeQuery();

                        while (rs.next()) {
                    %>
                    <form>
                        <br><br><br><br><br>
                        <b>Electric Bill ID:</b>
                        <input type="text" name="id" size="60" value="<%= rs.getInt("id")%>"><br><br><br>

                        <b>Electric Bill Payer Name:</b>
                        <input type="text" name="name" size="60" value="<%= rs.getString("name")%>"><br><br><br>

                        <b>Electric Bill Payer Father Name:</b>
                        <input type="text" name="father" size="60" value="<%= rs.getString("father")%>"><br><br><br>

                        <b>Electric Bill Payer UserName:</b>
                        <input type="text" size="60" name="username" value="<%= rs.getString("username")%>" ><br><br><br><br>

                        <table style="width:100%"><caption><b>Payment Detail Information</b></caption>
                            <tr><th>Mobile Number</th><th>Transaction ID</th><th>Payment Type</th><th>Bill Amount</th></tr>
                            <tr><td><%=rs.getString("mobile")%></td><td><%=rs.getString("tranid")%></td><td><%=rs.getString("paytype")%></td><td><%= rs.getString("bill")%> taka</td></tr>
                        </table><br><br>
                        <b>Electric Bill Payer Address:</b><br><br>
                        <input type="text" name="address"size="100" font-size="20px" value="<%= rs.getString("address")%>,"><br>
                        <input type="text" name="thana"size="60"value="<%=rs.getString("thana")%>,"><br>
                        <input type="text" name="district"size="60" value="<%=rs.getString("district")%>,"><br>
                        <input type="text" name="division" size="60" value="<%=rs.getString("division")%>." ><br>

                    </form>

                    <%}%>
                    <div class="authority_signature" >
                        <br><br>
                        <p style="margin-left:60%;"><b>Bill Verification Authority Signature</b></p><br>
                        <p style="margin-left:68%;"><b>Md. Sohel Rana</b></p>
                        <img src="image/sig.png" alt="sinnature" align="right">
                    </div><br><br><br><br><br>
                    <hr>
                    <center><p>Bangladesh Power Development board Head office<p><center>
                            </div>
                            <div class="button_div">

                                <button class="button button2" onclick="javascript:printDiv('page')" ><b>Print</b></button>
                            </div>
                            </div>

                            <%
                                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                                response.setHeader("Pragma", "no-cache");
                                response.setHeader("Expires", "0");

                                if (session.getAttribute("username") == null) {
                                    response.sendRedirect("billReceipt_login");
                                }
                            %>

                            <footer>Copyright &copy; Sohel Rana</footer>
                            </div>


                            <script>
                                document.getElementById("demo").innerHTML = Date();
                            </script>
                            </body>
                            </html>
