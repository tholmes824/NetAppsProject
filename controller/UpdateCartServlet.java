package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartItems;
import dbHelpers.ReadCart;
import dbHelpers.UpdateCart;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet(description = "This will get a product and use the data to fill in a table for updating the cart", urlPatterns = { "/updateCart" })
public class UpdateCartServlet extends HttpServlet {
	
	private HttpSession session; 
	
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
		int prodID = Integer.parseInt(request.getParameter("prodID"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		CartItems ci = new CartItems();
		ci.setQuantity(quantity);
		ci.setProdID(prodID);
		
		// create an UpdateQuery object and use it to update the product
		UpdateCart uc = new UpdateCart("d2decoy", "root", "#1LOVEschool");
		uc.doUpdate(ci);

		// pass control on to the ReadServlet
		String url = "/read";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
