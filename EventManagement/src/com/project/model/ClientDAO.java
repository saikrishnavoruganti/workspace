package com.project.model;
import java.sql.*;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ClientDAO {
	
	public int checkClient(Client client) {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4 =ses.createQuery("from Event e where e.eventid=?");
		q4.setBigDecimal(0,client.getClientid());
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
        
	public void deleteClient(String clientid) {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4=ses.createQuery("delete from Client where clientId=?");
		q4.setString(0,clientid);
		int count=q4.executeUpdate();
		System.out.println("number of rows removed : "+count );
		tx.commit(); 
    }
	
	public List<Client> getAllClients() {
    	System.out.println("in method getallclients");
        List<Client> clients = new ArrayList<Client>();
        Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query query =ses.createQuery("from Client");
		Iterator i1=query.iterate();

		while(i1.hasNext())
		{
			Client e=(Client) i1.next();
			clients.add(e);
		}
		       System.out.println(clients);

        return clients;
    }
}
