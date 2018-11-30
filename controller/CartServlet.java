package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadCart;
import model.CartItems;
import model.Customer;
import model.Cart;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet(urlPatterns = {"/CartServlet" , "/viewCart"})
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CartItems cartItems = new CartItems();
		
		Customer cust = new Customer();
		ArrayList<Integer> cartArray = new ArrayList<Integer>();
			for(int i = 0; i<= cartArray.size(); i++) {
				cartArray.add(cust.getCustID());
			}
		
		if()
		
		//make userID = cartID?????
		
		ReadCart ci = new ReadCart("d2decoy", "root", "12042108a", cartID);
		
		ci.doRead();
		
		String cart = ci.getHTMLTable();
		
		String url = "/cart.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
				
		
		
	}

}
