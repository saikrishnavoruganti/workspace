<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client details</title>

<link href="css/client.css" rel="stylesheet" type="text/css" />
</head>
 <body>
 <div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>
 <table id="table" class="tbl">
    <tr>
        
     
          <th><a href="ServletController?action=listevent">List Events</a></th>
       
        <th><a href="ServletController?action=insert">Create Event</a></th>
		<center><table id="table" class="tb2">
       </tr>

<table border="1" width="100%" height="100%">
<center><table id="table1" class="tb2">
    <tr>
        <th>Event Details</th>
        <th>CFP Setup</th>
        <th>Review Setup</th>
        <th>Session Setup</th>
        <th>New Event</th>
        <th>Abstract List</th>
       </tr> 
      </table>
      <p>.........................................@...................................................................................................</p>
<h2>Event Metadata &nbsp Client / Vendor &nbsp Sponsored Participants </h2></center>
<tr>
	<td valign="top" align="center"><br/>
      <form method="POST" action='ClientFormServlet' name="frmaddclientdetails"><table>
		<tr>
			<td colspan="2" align="center"><b>Add client details</b></td>
		</tr>
		<tr>
			<td>ClientId:</td>
			<td><input type="text" name="clientid" required autofocus/></td>
			<br>
		</tr>
<tr>
			<td>Firstname:</td>
			<td><input type="text" name="firstname" required autofocus/></td>
			<br>
		</tr>
	
	<tr>
			<td>Middlename:</td>
			<td><input type="text" name="middlename" /></td>
			<br>
		</tr>
		<tr>
			<td>Lastname:</td>
			<td><input type="text" name="lastname" required autofocus/></td>
			<br>
		</tr>
		<tr>
			<td>Streetname:</td>
			<td><input type="text" name="streetname"/></td>
			<br>
		</tr>
		<tr>
			<td>Aptno:</td>
			<td><input type="text" name="aptno"/></td>
			<br>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="city" /></td>
			<br>
		</tr>
		<tr>
			<td>State:</td>
			<td><input type="text" name="state" /></td>
			<br>
		</tr>
		<tr>
			<td>Zip:</td>
			<td><input type="text" name="zip" /></td>
			<br>
		</tr>
		<tr>
			<td>Country:</td>
			<td><input type="text" name="country" /></td>
			<br>
		</tr>
		<tr>
			<td>Phone:</td>
			<td><input type="text" name="phonenumber" required autofocus/></td>
			<br>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td><input type="text" name="mobilenumber" required autofocus/></td>
			<br>
		</tr>
		
		<tr>
			<td>Email id:</td>
			<td><input type="text" name="emailid" required autofocus/></td>
			<br>
		</tr>
		<tr>
			<td>client Web:</td>
			<td><input type="text" name="clientweb" /></td>
			<br>
		</tr>
		<tr>
			<td>Organization:</td>
			<td><input type="text" name="organization" required autofocus/></td>
			<br>
		</tr>
		</tr>
		
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<td align="center">
		<input  type="submit" value="Save" /> 
				</td>
		
		</table></form>
	</td>
</tr>
</table>

</body></html>