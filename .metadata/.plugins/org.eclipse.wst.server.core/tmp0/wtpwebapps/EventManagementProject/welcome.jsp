<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dixon Group Event Management</title>
<link href="css/stylewelcome.css" rel="stylesheet" type="text/css" />

</head>
<body>
<center>
<div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>
<h1>Welcome ${sessionScope.username }</h1>
<br>
<tr>
        
     <span class="login-box-options">
          <th><a href="ServletController?action=listevent"> List Events</a></th>
       
        <th><a href="ServletController?action=insert">Add New Event</a></th>
       </tr> 
       </span>
       </div>
   
 
       
       </center>
       
</body>
</html>

