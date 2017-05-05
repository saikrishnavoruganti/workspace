<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>
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
<table border=1>
        <thead>
            <tr>
                <th>Event Title</th>
               
                <th>Event Type</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th colspan=6>Action</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${events}" var="event">
                <tr>
                    <td><c:out value="${event.eventtitle}" /></td>
                                 
                           <td><c:out value="${event.eventtype}" /></td>
                <td><fmt:formatDate pattern="dd MMM,yyyy" value="${event.startdate}" /></td>
					 <td><fmt:formatDate pattern="dd MMM,yyyy" value="${event.enddate}" /></td>
                    <td><a href="ServletController?action=edit&eventId=<c:out value="${event.eventid}"/>">Update Event</a></td>
                    <td><a href="ServletController?action=delete&eventId=<c:out value="${event.eventid}"/>">Delete Event</a></td>
                    <td><a href="ServletController?action=listclient&eventId=<c:out value="${event.eventid}"/>">List Clients to add</a></td>
                    <td><a href="ServletController?action=listvendor&eventId=<c:out value="${event.eventid}"/>">List Vendors to add</a></td>
                    <td><a href="ServletController?action=viewattendies&eventId=<c:out value="${event.eventid}"/>">View Client and Vendor added</a></td>
<%--                     <td><a href="ServletController?action=viewvendorinevent&eventId=<c:out value="${event.eventid}"/>">View Vendor in event</a></td>
 --%>                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>