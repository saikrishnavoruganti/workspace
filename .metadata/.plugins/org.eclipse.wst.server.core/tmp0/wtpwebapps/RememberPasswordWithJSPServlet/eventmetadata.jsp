<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remember Login With JSP-Servlet</title>

<link href="css/styles1.css" rel="stylesheet" type="text/css" />
</head>
 <body>
 <div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>
 <table id="table" class="tbl">
    <tr>
        
     
          <th><input align="right" type="submit" name="events" onclick='window.location.assign("welcome.jsp")' value="events" id="events"></th>
       
        <th><input align="right" type="submit" name="setupevent" onclick='window.location.assign("eventmetadata.jsp")' value="setupevent" id="setupevent"></th>
       </tr> 
      </table>
<center><table id="table" class="tb2">
    <tr>
  

<table border="1" width="100%" height="100%">
<center><table id="table1" class="tb2">
    <tr>
        <th>Event Details</th>
        <th>cpf Setup</th>
        <th>Review Setup</th>
        <th>Session Setup</th>
        <th>new Event</th>
        <th>abstract list</th>
       </tr> 
      </table>
      <p>..............@..............................................................................................................................</p>
<h2>Event Metadata &nbsp client/vendor &nbsp sponsored participants </h2></center>
<tr>
	<!--<td width="15%" valign="top" align="center">
		<br/><a href="Login.html">Login</a><br/>
		<br/><a href="registration.html">Register</a><br/>
	</td> -->
	<td valign="top" align="center"><br/>
		<form action="eventtype.jsp"><table>
		<tr>
			<td colspan="2" align="center"><b>Event Metadata</b></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><b>&nbsp;</td>
		</tr>
		<tr>
		<td>
		EventType:&nbsp;&nbsp;&nbsp;&nbsp;<select>
  			<option value="meeting">meeting</option>
 		 	<option value="conference">conference</option>
  			<option value="discussion">discussion</option>
  			<option value="launch">launch</option>
		</select>
		</td>
		</tr>
		<tr>
			<td>eventID</td>
			<td><input id="eventID" type="text" name="eventID" required autofocus/></td>
			<br>
		</tr>
		<tr>
			<td>venueID</td>
			<td><input id="venue" type="text" name="venueID"/></td>
			
			
		</tr>
		
		<tr>
			<td>eventTitle</td>
			<td><input id="eventTitle" type="text" name="eventTitle"/></td>
		</tr>
		
		<tr>
			<td>event Identifier</td>
			<td><input id="eventidentifier" type="text" name="eventIdentifier"/></td>
		</tr>
		<tr>
			<td>start date</td>
			<td><input id="eventdate" type="text" name="startDate"/></td>
			<td>end date</td>
			<td><input id="eventdate" type="text" name="endDate"/></td>
		</tr>
		<tr>
			<td>Event Description</td>
			<td><input id="description" type="text" name="eventDescription"/></td>
		</tr>
		<tr>
			<td>custom message</td>
			<td><input id="custommessage" type="text" name="customMessage"/></td>
		</tr>
		<tr>
			<td>instructions</td>
			<td><input id="instructions" type="text" name="instructions"/></td>
			
			
		</tr>
		<tr>
			<td>CPF_Process</td>
			<td><input id="CPF_Process" type="text" name="CPF_Process"/></td>
			
			
		</tr>
		<tr>
		
             <td>Event logo:</td> <td><input type="file" name="img"></td>
             

		</tr>
		<tr>
			<td>eventtrack</td>
			<td><input id="eventtrack" type="text" name="eventtrack"/></td>
			
		</td>
			
		</tr>
		
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<td align="center">
		<input type="submit" formaction="save" formmethod="post" value="save" />
		</td>
		
		
			
			
		
		</table></form>
	</td>
</tr>
</table>
<td><input align="right" type="submit" name="user" onclick='window.location.assign("client.jsp")' value="next" id="next"></td>
</body></html>