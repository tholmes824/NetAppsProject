package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import dbHelpers.ReadQuery;
import dbHelpers.ReturnCust;
import model.Customer;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(
		description = "Controller for reading the customer table", 
		urlPatterns = { 
				"/ReadServlet", 
				"/returner"
		})

public class ReadServlet extends HttpServlet {
	
	private HttpSession session; 
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadServlet() {
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
		
		session = request.getSession();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// Create a ReadQuery helper object
		ReturnCust rc = new ReturnCust("d2decoy", "root", "#1LOVEschool", email, password);
		
		Customer customer = rc.verifyCust(email, password);
		
		if(customer != null) {
			session = request.getSession(true);
			session.setAttribute("customer", customer);
			String url = "home.jsp";

			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);	
		}	
		
	}

}

