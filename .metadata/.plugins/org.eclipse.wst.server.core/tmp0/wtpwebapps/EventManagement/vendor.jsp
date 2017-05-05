<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Contacts or Vendors</title>

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
               <tr>
                <th>Vendor Name</th>
                <th>Vendor Title</th>
                <th>Organization</th>
                <th>State</th>
                <th>Country</th>
                <th colspan=1>Action</th>
            </tr>
        <tbody>
            <c:forEach items="${vendors}" var="vendor">
                <tr>
                    <td><c:out value="${vendor.firstname}" /></td>
                    <td><c:out value="${vendor.title}" /></td>
                    <td><c:out value="${vendor.organization}" /></td>
           		   <td><c:out value="${vendor.state}" /></td>
                    <td><c:out value="${vendor.country}" /></td>
              
                    <td><a href="ServletController?action=Addvendortoevent&vendorid=<c:out value="${vendor.vendorid}"/>&eventid=<c:out value="${eventid}"/>">Add Vendor to Event</a></td>
                    
                </tr>
            </c:forEach>
        </tbody>
</table>
</body>
</html>