package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.LocationQuery;
import dbHelpers.ReadLocation;
import model.Location;

/**
 * Servlet implementation class LocationServlet
 */
@WebServlet(description = "Takes information about zip code", urlPatterns = { "/LocationServlet" , "/search" })
public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocationServlet() {
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
		Location location = new Location();
		
		//get data
		String state = request.getParameter("state"));
		
		//readLocation
		ReadLocation rl= new ReadLocation("name", "root", "password", "state");
		
		//get data
		rl.doRead();
		
		Location results = rl.getLocation();
		
		//pass grocery and control to the updateform.jsp
		request.setAttribute("results", results);
		
		String url = "/locationresults.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
				

		
		
	}

}
