<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remember Login With JSP-Servlet</title>

<link href="css/styles1.css" rel="stylesheet" type="text/css" />
</head>
<body id="This">


<center>
<div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>

Welcome ${sessionScope.username }

<table id="table" class="tbl">
    <tr>
        
     
          <th><input align="right" type="submit" name="events" onclick='window.location.assign("welcome.jsp")' value="events" id="events"></th>
       
        <th><input align="right" type="submit" name="setupevent" onclick='window.location.assign("eventmetadata.jsp")' value="setupevent" id="setupevent"></th>
       </tr> 
      </table>
<br>
<h1>Event List</h1>
	
	
	<table id="table" class="tbl">
    <tr>
        <th>eventTitle</th>
        <th>venueID</th>
        <th>startDate</th>
        <th>endDate</th>
       </tr> 
      </table>
       </div> 
</center>

</body>

</html>