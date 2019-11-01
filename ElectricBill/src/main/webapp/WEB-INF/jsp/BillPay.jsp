<%
    session.setAttribute("username", null);
    session.invalidate();
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bill Pay Form</title>
        <meta charset="utf-8">
        <meta name="description" content="Onlin Bill Payment">
        <meta name="keywords" content="Bill Pay Form,Name,password,Mobile Payment type,Transaction ID,Bangladesh Power Development Board(BPDB)">
        <meta name="author" content="Md. Sohel Rana">
        <link rel="shortcut icon" href="image/logo.png" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
       

        <link rel="stylesheet" href="css/BillPayForm.css" type="text/css">
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
                <li><a class="active" href="BillPay">Bill Pay</a></li>
                <li><a href="billReceipt_login">Bill Receipt</a></li>
                <li><a href="Admin_login">Admin</a></li>
                <li style="float:right"><a href="about">About</a></li>
</ul>

<div> <img src="image/neulear.jpg" alt="Bill Screen Image" class="image2">


<div class="bill_infocontainer">


<div class="from_container">
<h2>Bill pay form</h2><p>Please fill this form for bill pay.</P>
</div>

<div class="form_container"> 
    <form action="Bill" method="post">
User Name:<br>
<input type="text" name="username"  placeholder="Username" required><br>
Password:<br>
<input type="password" name="Password" placeholder="Password" required ><br>
Mobile Payment Type:<br>
<select name="payment" required>
    <option value="" selected>select payment</option>
  <option value="Bkash">bKash</option>
  <option value="Duch Bangla">Dutch-Bangla</option>
</select><br>
Transaction ID:<br>
<input type="text" name="trannsaction_id" placeholder="Transaction ID" required><br>

Electric Bill (Example:500Tk):<br>
<input type="text" name="bill" placeholder="Bill" required><br>

<input type="submit" value="Submit">
</form>
</div>



</div>

</div>

<footer>Copyright &copy; Sohel Rana</footer>
</div>

    </body>
</html>
