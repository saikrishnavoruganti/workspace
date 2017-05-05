<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
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
      <p>..............@..............................................................................................................................</p>
<h2>Event Metadata &nbsp Client / Vendor &nbsp Sponsored Participants </h2></center>
<tr>
	
	<td valign="top" align="center"><br/>
		<form method="POST" action='ServletController' name="frmeventmetadata"><table>
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
		<% String action = request.getParameter("action");
                System.out.println(action);
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <tr>
            <td>EventID</td>
            <td><input type="text" name="eventID" value="<c:out value="${event.eventid}" />" readonly="readonly"/> (You Can't Change this)<br /> 
            <%} else {%>
		<tr>
			<td>EventID</td>
			<td><input type="text" name="eventID" required autofocus/></td>
			<br>
		</tr>
		<%}%>
		
		<tr>
			<td>Event Title</td>
			<td><input type="text" name="eventTitle" value="<c:out value="${event.eventtitle}" />" /></td>
		</tr>
		
		<tr>
			<td>Event Identifier</td>
			<td><input type="text" name="eventidentifier" value="<c:out value="${event.eventidentifier}" />"/></td>
		</tr>
		<tr>
			<td>Event Date</td>
			<td>From&nbsp;<input type="text" name="startdate" value="<c:out value="${event.startdate}" />"/>(yyyy-MM-dd) </td>
			<td>To&nbsp;<input type="text" name="enddate" value="<c:out value="${event.enddate}" />"/>(yyyy-MM-dd) </td>
		</tr>
		<tr>
			<td>Event Description</td>
			<td><input type="text" name="eventdescription" value="<c:out value="${event.eventdescription}" />"/></td>
		</tr>
		<tr>
			<td>Custom Message</td>
			<td><input type="text" name="custommessage" value="<c:out value="${event.custommessage}" />"/></td>
		</tr>
		<tr>
			<td>Instructions</td>
			<td><input type="text" name="instructions" value="<c:out value="${event.instructions}" />"/></td>
			
			
		</tr>
		<tr>
			<td>CFP_Process</td>
			<td><input type="text" name="cfpProcess" value="<c:out value="${event.cfpProcess}" />"/>(yes/no)</td>
			
			
		</tr>
		
		<tr>
			<td>Event Track</td>
			<td><input id="eventtrack" type="text" name="eventtrack" value="<c:out value="${event.eventtracks}" />"/></td>
			
		</td>
		
			
		</tr> 
			<tr>
			<td>Venue</td>
			<td><input type="text" name="venuename" value="<c:out value="${event.venue}" />"/></td>
					
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