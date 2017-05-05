<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Metadata</title>

<link href="css/client.css" rel="stylesheet" type="text/css" />
</head>
 <body>
 <div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>
 <table id="table" class="tbl">
    <tr>
        
     
          <th><a href="ServletController?action=listevent">List Events</a></th>
       
        <th><a href="ServletController?action=insert">Add Event</a></th>
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
      <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;....................................................@..................................................................................</p>
<h2>Event Metadata &nbsp client/vendor &nbsp sponsored participants </h2></center>
<form action="eventtype.jsp"><table>
<tr>
			<td>client</td>
			<td><input id="clientID" type="text" name="clientID" required autofocus/></td>
			<td><input align="left" type="submit" name="next" onclick='window.location.assign("clientdetails.jsp")' value="clientdetails" id="next"></td>
			<br>
		</tr>
		<tr>
		<td>client contact:</td>
		<tr>
		<td>
		<select>
  			<option value="contact1">contact1</option>
 		 	<option value="contact2">contact2</option>
  			<option value="contact3">contact3</option>
  			<option value="contact4">contact4</option>
		</select>
		</td>
		</tr>
		</tr>
		<td align="center">
		<input type="submit" formaction="save" formmethod="post" value="save" />
		</td>
		</tr>
	</table>
	</form>		
	<td><input align="left" type="submit" name="next" onclick='window.location.assign("sponsorship.jsp")' value="next" id="next"></td>

</table></table></center></body>
</html>