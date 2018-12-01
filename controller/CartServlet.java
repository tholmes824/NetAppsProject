package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.ReadCart;
import dbHelpers.ReturnCust;
import model.CartItems;
import model.Customer;
import model.Inventory;
import model.Cart;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet(urlPatterns = {"/CartServlet" , "/viewCart"})
public class CartServlet extends HttpServlet {
	
	private HttpSession session;
	
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
		session = request.getSession();
		
		ReadCart rc = new ReadCart ("d2decoy", "root", "TayTay1*");
		Cart c = (Cart) session.getAttribute("cart");
		rc.doRead(c);
		String table = rc.getHTMLTable(c);
		request.setAttribute("table", table);
		String url = "/cart.jsp";
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);	
				
		
		
	}

}
