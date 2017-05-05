<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Clients</title>

<link href="css/client.css" rel="stylesheet" type="text/css" />
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
               <tr>
                <th>Client Name</th>
                <th>Organization</th>
                <th>Client Web</th>
                <th>State</th>
                <th>Country</th>
                <th colspan=1>Action</th>
            </tr>
        <tbody>
            <c:forEach items="${clients}" var="client">
                <tr>
                    <td><c:out value="${client.firstname}" /></td>
                    <td><c:out value="${client.organization}" /></td>
                    <td><c:out value="${client.clientweb}" /></td>
           		   <td><c:out value="${client.state}" /></td>
                    <td><c:out value="${client.country}" /></td>
              
                    <td><a href="ServletController?action=Addclienttoevent&clientid=<c:out value="${client.clientid}"/>&eventid=<c:out value="${eventid}"/>">Add client to Event</a></td>
                    
                </tr>
            </c:forEach>
        </tbody>
</table>
<th><a href="ClientFormServlet?action=insert">Add New Client</a></th>
</body>
</html>