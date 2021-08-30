

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Integer result=(Integer)request.getAttribute("result");
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		if(result==null) {
			rd.forward(request, response);
			return;
		}
		
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String op=(String)request.getAttribute("operation");
			out.println("<h1  style='color:#000;'><center >"+op+" "+"Result: <b>"+result.intValue()+"<b></center></h1>");
			rd.include(request, response);
		}
		catch(Exception e) {
			
		};
	


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
