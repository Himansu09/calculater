

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			Integer i1=Integer.valueOf(request.getParameter("num1"));
			Integer i2=Integer.valueOf(request.getParameter("num2"));
			request.setAttribute("n1", i1);
			request.setAttribute("n2", i2);
		}
		catch(Exception e) {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("value should be number");
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
			return;
			
		}
		String action=request.getParameter("action");
		RequestDispatcher rd=null;
		if(action.equals("+"))
			rd=request.getRequestDispatcher("/Add");
		else if(action.equals("-"))
			rd=request.getRequestDispatcher("/Sub");
		else if(action.equals("*"))
			rd=request.getRequestDispatcher("/mult");
		else
			rd=request.getRequestDispatcher("/div");
		rd.forward(request, response);	
		
	}


		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
