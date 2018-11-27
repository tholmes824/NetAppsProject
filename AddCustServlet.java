package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Customer;


/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "Controller for adding a new customer to the database", urlPatterns = { "/addCust", "/AddCustServlet" })
public class AddCustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the data
	    int custID = Integer.parseInt(request.getParameter("custID"));
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zip = Integer.parseInt(request.getParameter("zip"));
	
		// set up a customer object
		
		Customer customer = new Customer();
		customer.setCustID(custID);
		customer.setfName(fName);
		customer.setlName(lName);
		customer.setEmail(email);
		customer.setPhone(phone);
		customer.setAddress1(address1);
		customer.setAddress2(address2);
		customer.setCity(city);
		customer.setState(state);
		customer.setZip(zip);
		
	    
		// set up an addQuery object
	    AddQuery aq = new AddQuery("d2decoyhhc", "root", "password");
	    
		// pass the book to addQuery to add to the database
	    aq.doAdd(customer);
	    
		// pass execution control to the ReadServlet
	    String url = "/read";
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	    
		
	}

}
