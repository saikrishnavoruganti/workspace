package com.project.controller;

import java.io.IOException;
import java.math.BigDecimal;
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

/**
 * Servlet implementation class ClientFormServlet
 */
@WebServlet("/ClientFormServlet")
public class ClientFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/clientdetails.jsp";

    private static String LIST_CLIENTS = "/client.jsp";

	private EventDAO eventdao;
    private ClientDAO clientdao;
    private VendorDAO vendordao;

    public ClientFormServlet() {
        super();
        eventdao = new EventDAO();
        clientdao= new ClientDAO();
        vendordao= new VendorDAO();

    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
        String action = request.getParameter("action");
        System.out.println("in ClientFormController");
        if (action.equalsIgnoreCase("delete")){
        	
        }else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		
		Client client = new Client();
       
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal cid,phonenum,mobilenum;
		try {
			cid = (BigDecimal) decimalFormat.parse(request.getParameter("clientid"));
			phonenum=(BigDecimal) decimalFormat.parse(request.getParameter("phonenumber"));
			mobilenum=(BigDecimal) decimalFormat.parse(request.getParameter("mobilenumber"));

			client.setClientid(cid);
			client.setPhonenumber(phonenum);
			client.setMobilenumber(mobilenum);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	       client.setFirstname(request.getParameter("firstname"));
	       client.setMiddlename(request.getParameter("middlename"));
	       client.setLastname(request.getParameter("lastname"));
	       client.setStreetname(request.getParameter("streetname"));
	       client.setAptno(request.getParameter("aptno"));
	       client.setCity(request.getParameter("city"));
	       client.setState(request.getParameter("state"));
	       client.setZip(request.getParameter("zip"));
	       client.setCountry(request.getParameter("country"));
	       client.setEmailid(request.getParameter("emailid"));
	       client.setClientweb(request.getParameter("clientweb"));
	       client.setOrganization(request.getParameter("organization"));

       
      int a= clientdao.checkClient(client);
      if(a==0){
           ses.save(client);
           tx.commit();
      }else if(a==1){
    	  ses.update(client);
          tx.commit();
      }else {
    	  System.out.println("smthing wrong");
      }
       
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_CLIENTS);
        request.setAttribute("clients", clientdao.getAllClients());
        view.forward(request, response);
    }
}
