
<%
    session.setAttribute("username", null);
    session.invalidate();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <meta charset="utf-8">
        <meta name="description" content="Online Bill Registration Form">
        <meta name="keywords" content="Registration,customer Name, Mobile Number,gmail Address,Districts,Upazilla,customer password">
        <meta name="author" content="Md. Sohel Rana">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="image/logo.png" />
        <link rel="stylesheet" href="css/RegistrationForm.css" type="text/css">
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
                <li><a class="active" href="RegistrationForm">Registration</a></li>
                <li><a href="BillPay">Bill Pay</a></li>
                <li><a href="billReceipt_login">Bill Receipt</a></li>
                <li><a href="Admin_login">Admin</a></li>
                <li style="float:right"><a href="about">About</a></li>
            </ul>

            <div class="bgimg" style="background-image:url('image/pic.jpg') " >





                <div class="from_container">
                    <h2>Registration form</h2><p>Please fill this form for registration.</P>

                </div>

                <div class="formbody_container"> 
                    <form name="myform" id="myForm" action="Registration" method="post">
                        Name:<br>
                        <input type="text" name="name" placeholder="Full Name" required ><br>

                        Father Name:<br>
                        <input type="text" name="fatherName" placeholder="Father Full Name." required ><br>

                        Mobile Number:<br>
                        <input type="text" name="mobileNumber" placeholder="Mobile Number" required><br>

                        Division Name:<br>
                        <select name="division" id="divisionSel" size="1" required>

                            <option value="" selected="selected">-- Select Division --</option>
                        </select><br><br>


                        District Name:<br>
                        <select name="district" id="districtSel" size="1" required>
                            <option value="" selected="selected">-- Select District --</option>
                        </select><br><br>

                        Upazila/Thana Name:<br>
                        <select name="thana"id="upazilaSel" size="1" required>
                            <option value="" selected="selected">-- Select Upazila/Thana --</option>
                        </select><br><br>

                        Address:(Example:Union, Village, Para)<br>
                        <input type="text" name="address" placeholder="Address" required><br>

                        User Name:<br>
                        <input type="text" name="username" placeholder="User Name"required ><br>


                        Password:<br>
                        <input type="password" name="Password" placeholder="Password" required><br>



                        <input type="submit" value="Submit">
                    </form>


                </div>

           

            </div>

            <footer>Copyright &copy; Sohel Rana</footer>
        </div>
        <script src="javaScript/RegistrationForm.js"></script>
 
    </body>
</html>