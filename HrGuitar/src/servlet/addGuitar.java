package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Guitar;
import daoImpl.GuitarDaoImpl;

/**
 * Servlet implementation class AddGuitar
 */
@WebServlet("/AddGuitar")
public class addGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String serialNumber=request.getParameter("serialNumber");
		Double price=Double.parseDouble(request.getParameter("price"));
		String builder=request.getParameter("builder");
		String model=request.getParameter("model");
		String type=request.getParameter("type");
		String backWood=request.getParameter("backWood");
		String topWood=request.getParameter("topWood");
		GuitarDaoImpl dao=new GuitarDaoImpl();
		Guitar guitar=new Guitar();
			guitar.setSerialNumber(serialNumber);
			guitar.setPrice(price);
			guitar.setBuilder(builder);
			guitar.setModel(model);
			guitar.setType(type);
			guitar.setBackWood(backWood);
			guitar.setTopWood(topWood);
			dao.addGuitar(guitar);
		response.sendRedirect("addGuitarSuccess.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
