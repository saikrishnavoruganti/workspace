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
      <p>..............@..............................................................................................................................</p>
<h2>Event Metadata &nbsp Client / Vendor &nbsp Sponsored Participants </h2></center>
<tr>
	
	<td valign="top" align="center"><br/>
		<form method="POST" action='ServletController' name="frmeventmetadata"><table>
		<%-- <% String action = request.getParameter("action");
                System.out.println(action);
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            User Name : <input type="text" name="uname" value="<c:out value="${user.uname}" />" readonly="readonly"/> (You Can't Change this)<br /> 
            <%} else {%>
            User Name : <input type="text" name="uname" /> <br />
            <%}%>
            Password : <input type="password" name="pass" value="<c:out value="${user.password}" />" /> <br /> 
            Email : <input type="text" name="email"  value="<c:out value="${user.email}" />" /> <br /> 

            <% if (action.equalsIgnoreCase("edit")) {%>
                      Registration : <input type="text" name="dob"  value="<fmt:formatDate pattern="yyyy/MM/dd" value="${user.registeredon}" />" readonly="readonly"/>(You Can't Change this)  <br> />(yyyy/MM/dd)  <br /> 
                     Registration : <input type="text" name="dob"  value="<c:out value="${user.registeredon}" />" readonly="readonly"/>(You Can't Change this)  <br />
    
 
            <%} else {%>
            Registration : <input type="text" name="dob"   />(yyyy/MM/dd)  <br /> 
<!--             value="<fmt:formatDate pattern="yyyy/MM/dd"  />"
 -->            <%}%>
            <input  type="submit" value="Submit" /> --%>
		<tr>
			<td colspan="2" align="center"><b>Event Metadata</b></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><b>&nbsp;</td>
		</tr>
		<tr>
		<td>Event Type:&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td>
				<select name="eventType"> 
  			<option value="meeting">meeting</option>
 		 	<option value="conference">conference</option>
  			<option value="discussion">discussion</option>
  			<option value="launch">launch</option>
		</select>
		</td>
		</tr>
		<tr>
			<td>EventID</td>
			<td><input type="text" name="eventID" required autofocus/></td>
			<br>
		</tr>
		
		
		<tr>
			<td>Event Title</td>
			<td><input type="text" name="eventTitle"/></td>
		</tr>
		
		<tr>
			<td>Event Identifier</td>
			<td><input type="text" name="eventidentifier"/></td>
		</tr>
		<tr>
			<td>Event Date</td>
			<td>From&nbsp;<input type="text" name="startdate"/></td>
			<td>To&nbsp;<input type="text" name="enddate"/></td>
		</tr>
		<tr>
			<td>Event Description</td>
			<td><input type="text" name="eventdescription"/></td>
		</tr>
		<tr>
			<td>Custom Message</td>
			<td><input type="text" name="custommessage"/></td>
		</tr>
		<tr>
			<td>Instructions</td>
			<td><input type="text" name="instructions"/></td>
			
			
		</tr>
		<tr>
			<td>CFP_Process</td>
			<td><input type="text" name="cfpProcess"/></td>
			
			
		</tr>
		<!-- <tr>
		
             <td>Event Logo:</td> <td><input type="file" name="eventlogo"></td>
             

		</tr> -->
		<tr>
			<td>Event Track</td>
			<td><input id="eventtrack" type="text" name="eventtrack"/></td>
			
		</td>
		<tr>
			<td>VenueID</td>
			<td><input type="text" name="venueID"/></td>
			
			
		</tr> 
			<tr>
			<td>Venue</td>
			<td><input type="text" name="venuename"/></td>
					
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

			
<td><input align="center" type="submit" name="user" onclick='window.location.assign("client.jsp")' value="next" id="next"></td>
</body></html>