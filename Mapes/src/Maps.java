

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Maps
 */
@WebServlet("/Maps")
public class Maps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Maps() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		City c = new City();
		int distance = c.getDistance(from, to);
		float bike = ((float)distance / 20) *60;
		float foot = ((float)distance / 5) *60;
		float car = ((float)distance / 80) *60;
		
		request.setAttribute("bike", bike);
		request.setAttribute("foot", foot);
		request.setAttribute("car", car);
		request.setAttribute("distance", distance);
		request.setAttribute("from", from);
		request.setAttribute("to", to);
		request.setAttribute("x",c.getX());
		request.setAttribute("y", c.getY());
		request.setAttribute("x2",c.getX2());
		request.setAttribute("y2", c.getY2());
		request.setAttribute("centerX",c.getCenterX());
		request.setAttribute("centerY", c.getCenterY());
		//String iframe = "";
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
