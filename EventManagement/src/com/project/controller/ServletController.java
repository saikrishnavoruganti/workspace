package com.project.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.model.*;
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/eventmetadata.jsp";
    private static String LIST_EVENTS = "/event.jsp";
    private static String LIST_CLIENTS = "/client.jsp";
    private static String LIST_VENDORS= "/vendor.jsp";
    private static String LIST_ATTENDIES= "/listattendies.jsp";

    private EventDAO eventdao;
    private ClientDAO clientdao;
    private VendorDAO vendordao;

    public ServletController() {
        super();
        eventdao = new EventDAO();
        clientdao= new ClientDAO();
        vendordao= new VendorDAO();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");
        System.out.println("in ServletController");
        if (action.equalsIgnoreCase("delete")){
            String eventId = request.getParameter("eventId");
            eventdao.deleteEvent(eventId);
            forward = LIST_EVENTS;
            request.setAttribute("events", eventdao.getAllEvents());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String eventId = request.getParameter("eventId");
            Event event = eventdao.getEventById(eventId);
            request.setAttribute("event", event);
        } else if (action.equalsIgnoreCase("listevent")){
            forward = LIST_EVENTS;
            request.setAttribute("events", eventdao.getAllEvents());
        } else if (action.equalsIgnoreCase("listclient")){
            forward = LIST_CLIENTS;
            request.setAttribute("eventid", request.getParameter("eventId"));
            request.setAttribute("clients", clientdao.getAllClients());
        } else if (action.equalsIgnoreCase("listvendor")){
            forward = LIST_VENDORS;
            request.setAttribute("eventid", request.getParameter("eventId"));
            request.setAttribute("vendors", vendordao.getAllVendors());
        }else if (action.equalsIgnoreCase("addclienttoevent")){
            String eventId = request.getParameter("eventid");
            String clientId= request.getParameter("clientid");
            eventdao.addClientToEvent(clientId,eventId);
            forward = LIST_EVENTS;
            request.setAttribute("events", eventdao.getAllEvents()); 
        }else if (action.equalsIgnoreCase("addvendortoevent")){
            String eventId = request.getParameter("eventid");
            String vendorId= request.getParameter("vendorid");
            eventdao.addVendorToEvent(vendorId,eventId);
            forward = LIST_EVENTS;
            request.setAttribute("events", eventdao.getAllEvents()); 
        }else if (action.equalsIgnoreCase("viewattendies")){
            String eventId = request.getParameter("eventId");
            request.setAttribute("client", eventdao.viewClientInEvent(eventId));
            request.setAttribute("vendor", eventdao.viewVendorInEvent(eventId));
            forward = LIST_ATTENDIES;
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		
		Event event = new Event();
       event.setEventtype(request.getParameter("eventType"));
        event.setEventtitle(request.getParameter("eventTitle"));
        event.setEventidentifier(request.getParameter("eventidentifier"));
        try {
            Date startdate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startdate"));
            Date enddate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("enddate"));

            System.out.println("startdate"+ startdate);
            System.out.println("enddate"+ enddate);
            event.setStartdate(startdate);
            event.setEnddate(enddate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        event.setEventdescription(request.getParameter("eventdescription"));
        event.setCustommessage(request.getParameter("custommessage"));
        event.setInstructions(request.getParameter("instructions"));
        event.setCfpProcess(request.getParameter("cfpProcess"));
        event.setEventtracks(request.getParameter("eventtrack"));
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal eid;
		try {
			eid = (BigDecimal) decimalFormat.parse(request.getParameter("eventID"));
			event.setEventid(eid);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		event.setVenue(request.getParameter("venuename"));
       
      int a= eventdao.checkEvent(event);
      if(a==0){
           ses.save(event);
           tx.commit();
      }else if(a==1){
    	  ses.update(event);
          tx.commit();
      }else {
    	  System.out.println("smthing wrong");
      }
       
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_EVENTS);
        request.setAttribute("events", eventdao.getAllEvents());
        view.forward(request, response);
    }
}