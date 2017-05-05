<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Attendies</title>

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
                <th>Client Name</th>
               <th> Client Organization</th>
                <th>Client PhoneNumber</th>
                <th>Client MobileNumber</th>
                <th>Client Emailid</th>
             <th>Vendor Name</th>
               <th> Vendor Organization</th>
                <th>Vendor PhoneNumber</th>
                <th>Vendor MobileNumber</th>
                <th>Vendor Emailid</th>
<!--                 <th colspan=6>Action</th>
 -->                
            </tr>
        </thead>
        <tbody>
                <tr>
                    <td><c:out value="${client.firstname}" /></td>
                    <td><c:out value="${client.organization}" /></td>
                    <td><c:out value="${client.phonenumber}" /></td>
                    <td><c:out value="${client.mobilenumber}" /></td>
                    <td><c:out value="${client.emailid}" /></td>
                    <td><c:out value="${vendor.firstname}" /></td>
                    <td><c:out value="${vendor.organization}" /></td>
                    <td><c:out value="${vendor.phonenumber}" /></td>
                    <td><c:out value="${vendor.mobilenumber}" /></td>
                 
                    <td><c:out value="${vendor.emailid}" /></td>
                
                    
                </tr>
        </tbody>
    </table>
</body>
</html>