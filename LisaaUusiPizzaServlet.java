package pizzeria.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LisaaUusiPizzaServlet
 */
@WebServlet("/lisaa_pizza")
public class LisaaUusiPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LisaaUusiPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsp = "/view/pizzalomake.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pizzaName = request.getParameter("pizzaName");
		String pizzaDescription = request.getParameter("pizzaDescription");
		String pizzaPrice = request.getParameter("pizzaPrice");
		Double dpizzaPrice = Double.parseDouble(pizzaPrice);
		
		System.out.print(pizzaName + pizzaDescription + dpizzaPrice);
		
		response.sendRedirect("http://localhost:8080/PIzzeria/listaa-pizzat");
	//	String jsp = "/view/pizzalista.jsp";
	//	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
	//	dispatcher.forward(request, response);
	//	doGet(request, response);
	}

}
