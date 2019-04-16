package pizzeria.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import pizzeria.model.*;
import pizzeria.model.dao.PizzaDAO;

import javax.servlet.RequestDispatcher;


@WebServlet("/listaa-pizzat")
public class ListaaPizzatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListaaPizzatServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	//	ArrayList <Pizza> pizzalist = new ArrayList<Pizza>();
		
		PizzaDAO pizzadao = new PizzaDAO();
		ArrayList <Pizza> pizzalist = pizzadao.findAll();
		
		//pizzalist.add(new Pizza(1,"Kinkkupizza","Kinkku, Ananas", 3.3));
	//	pizzalist.add(new Pizza(2,"Quornpizza","Quorn, Paprika", 900.3));
	//	pizzalist.add(new Pizza(3,"PizzaPizza","Pizza, Taikina", 3999.3));
		
		request.setAttribute("pizzalist", pizzalist);
		
		
		String jsp = "/view/pizzalista.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
