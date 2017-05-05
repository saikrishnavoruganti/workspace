package com.project.model;
import java.math.BigDecimal;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class EventDAO {

	public int checkEvent(Event event) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4 =ses.createQuery("from Event e where e.eventid=?");
		q4.setBigDecimal(0,event.getEventid());
		Iterator i1=q4.iterate(); // lazy loading
		try {
			
		if(i1.hasNext()){    //found
        
			return 1;
            } else {
                return 0;
            }
        } catch (Exception ex) {
            System.out.println("Error in check() -->" + ex.getMessage());
        }
		return 2; 
    }    
    

    public void deleteEvent(String eventid) {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4=ses.createQuery("delete from Event where eventId=?");
		q4.setString(0,eventid);
		int count=q4.executeUpdate();
		System.out.println("number of rows removed : "+count );
		tx.commit(); 
    }

    public void addClientToEvent(String clientid,String eventid){
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Client client=null;
		Set<Client> clients = new HashSet<Client>();
		Query q4 =ses.createQuery("from Client c where c.clientid=?");
		q4.setString(0,clientid);
		Iterator i1=q4.iterate(); // lazy loading
		if(i1.hasNext()){
			client = (Client)i1.next();
			clients.add(client);
		}
		System.out.println(client);
		Event event = null;
		Query q =ses.createQuery("from Event e where e.eventid=?");
		q.setString(0,eventid);
		Iterator i=q.iterate(); // lazy loading
		if(i.hasNext()){
			event = (Event)i.next();
		}
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal eid;
		try {
			eid = (BigDecimal) decimalFormat.parse(eventid);
			event.setEventid(eid);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ses.update(event);
		event.setClients(clients);
		//ses.merge(event);
        tx.commit();
//		return client;
    }

    public List<Event> getAllEvents() {
    	System.out.println("in method");
        List<Event> events = new ArrayList<Event>();
        Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query query =ses.createQuery("from Event");
		Iterator i1=query.iterate();
		//System.out.println("Event details are .....");

		while(i1.hasNext())
		{
			Event e=(Event) i1.next();
			events.add(e);
		}
		       System.out.println(events);

        return events;
    }

    public Event getEventById(String eventid) {
        Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4 =ses.createQuery("from Event e where e.eventid=?");
		q4.setString(0,eventid);
		Iterator i1=q4.iterate(); // lazy loading
		if(i1.hasNext()){
			Event event = (Event)i1.next();
		return event;
    }else return null;
}


	public void addVendorToEvent(String vendorid, String eventid) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Vendor vendor=null;
		Set<Vendor> vendors = new HashSet<Vendor>();
		Query q4 =ses.createQuery("from Vendor v where v.vendorid=?");
		q4.setString(0,vendorid);
		Iterator i1=q4.iterate(); // lazy loading
		if(i1.hasNext()){
			vendor = (Vendor)i1.next();
			vendors.add(vendor);
		}
		System.out.println(vendor);
		Event event = null;
		Query q =ses.createQuery("from Event e where e.eventid=?");
		q.setString(0,eventid);
		Iterator i=q.iterate(); // lazy loading
		if(i.hasNext()){
			event = (Event)i.next();
		}
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal eid;
		try {
			eid = (BigDecimal) decimalFormat.parse(eventid);
			event.setEventid(eid);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ses.update(event);
		event.setVendors(vendors);
		//ses.merge(event);
        tx.commit();

	}


	@SuppressWarnings("unchecked")
	public void viewAttendies(String eventid) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Event event = null;
		Set<Vendor> vendors = new HashSet<Vendor>();
		Set<Client> clients = new HashSet<Client>();
		Query q =ses.createQuery("from Event e where e.eventid=?");
		q.setString(0,eventid);
		Iterator i=q.iterate(); // lazy loading
		if(i.hasNext()){
			event = (Event)i.next();
		}
		System.out.println(event);
		System.out.println(event.getClients());
		System.out.println(event.getVendors ());

		clients=event.getClients();
		vendors=event.getVendors();
		for (Vendor element : vendors) {
			System.out.println(element);
			Vendor v=element;
			break;
		}
		for (Client element : clients) {
			System.out.println(element);
			Client c=element;
			break;
		}
		
	}


	@SuppressWarnings("unchecked")
	public Client viewClientInEvent(String eventid) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Event event = null;
		Client client=null;
		Set<Client> clients = new HashSet<Client>();
		Query q =ses.createQuery("from Event e where e.eventid=?");
		q.setString(0,eventid);
		Iterator i=q.iterate(); // lazy loading
		if(i.hasNext()){
			event = (Event)i.next();
		}
		System.out.println(event);
		System.out.println(event.getClients());
		clients=event.getClients();

		for (Client element : clients) {
			System.out.println(element);
			client=element;
			break;
		}
		return client;
	}


	@SuppressWarnings("unchecked")
	public Vendor viewVendorInEvent(String eventid) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Event event = null;
		Vendor vendor=null;
		Set<Vendor> vendors = new HashSet<Vendor>();
		Query q =ses.createQuery("from Event e where e.eventid=?");
		q.setString(0,eventid);
		Iterator i=q.iterate(); // lazy loading
		if(i.hasNext()){
			event = (Event)i.next();
		}
		System.out.println(event);
		System.out.println(event.getVendors());
		vendors=event.getVendors();
		for (Vendor element : vendors) {
			System.out.println(element);
			 vendor=element;
			break;
		}
		return vendor;
	}


	
}