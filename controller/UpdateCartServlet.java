package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CartItems;
import dbHelpers.ReadCart;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet(description = "This will get a product and use the data to fill in a table for updating the cart", urlPatterns = { "/updateCart" })
public class UpdateCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the custID
		String custID = request.getParameter("custID");
		
		// create ReadRecord class
		ReadCart rc = new ReadCart("d2decoyhhc", "root", "#1LOVEschool", custID);
		
		// Use ReadRecord to get the product data
		rc.doRead();
		
		CartItems cartItems = rc.getCartItems();
		
		// pass Product and control to the updateForm.jsp
		request.setAttribute("cartItems", cartItems);
		
		String url = "/updateForm.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
