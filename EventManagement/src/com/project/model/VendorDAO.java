package com.project.model;
import java.sql.*;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class VendorDAO {
	public void deleteVendor(String vendorid) {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4=ses.createQuery("delete from Vendor where vendorId=?");
		q4.setString(0,vendorid);
		int count=q4.executeUpdate();
		System.out.println("number of rows removed : "+count );
		tx.commit(); 
    }
	
	public List<Vendor> getAllVendors() {
    	System.out.println("in method getallvendors");
        List<Vendor> vendors = new ArrayList<Vendor>();
        Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query query =ses.createQuery("from Vendor");
		Iterator i1=query.iterate();

		while(i1.hasNext())
		{
			Vendor e=(Vendor) i1.next();
			vendors.add(e);
		}
		       System.out.println(vendors);

        return vendors;
    }
}
