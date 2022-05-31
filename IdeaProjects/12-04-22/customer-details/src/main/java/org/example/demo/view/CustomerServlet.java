package org.example.demo.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.example.demo.model.*;

@WebServlet(urlPatterns = "/Customer.view")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Customer> customerList = null;
  
   

	public CustomerServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerList = new LinkedList<Customer>();
		customerList.add( new Customer(1,"Gurmeet","singh","gur@email.com"));
		customerList.add( new Customer(2,"Harshit","Kaushal","harshit@email.com"));
		customerList.add( new Customer(3,"Marry","singh","marry@email.com"));
		customerList.add( new Customer(4,"John","	dOE","john@email.com"));
		String pageTitle = "Customers Details :Customers";
		
		 // Specify the content type is HTML
		 response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 // Generate the HTML response
		 out.println("<html>");
		out.println("<head>");
		out.println("<title>"+ pageTitle + "</title>");
		out.println("</head>");
		out.println("<body bgcolor='white'>");
		
		 // Generate page heading
		 out.println("<!-- Page Heading -->");
		out.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
		out.println("<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>");
		out.println("<td><h3>" + pageTitle + "</h3></td>");
		out.println("</tr>");
		out.println("</table>");

		out.println("<p>");
		out.println("The set of Customers are:");
		out.println("</p>");
		
		Iterator<Customer> items = customerList.iterator();
		out.println("<table border='1' cellpadding='5' cellspacing='0' >");
		out.println(" <tr>");
		out.println(" <td>CustomerId</td>");
		out.println(" <td>Customer First_Name</td>");
		out.println(" <td>Customer Last_Name</td>");
		out.println(" <td>CustomerEmail</td>");
		out.println(" </tr>");
		while ( items.hasNext() ) {
			Customer customer = items.next();
		out.println(" <tr>");
		out.println(" <td>"+customer.getCustomerId()+"</td>");
		out.println(" <td>"+customer.getFirstName()+"</td>");
		out.println(" <td>"+customer.getLastName()+"</td>");
		out.println(" <td>"+customer.getEmail()+"</td>");
		out.println(" </tr>");
		}
		out.println(" </table>");
	
		
		 out.println("</body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	
}