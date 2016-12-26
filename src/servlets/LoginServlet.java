package servlets  ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;
	
	UserDao userDao = UserDao.getInstance();

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String pw = request.getParameter("password");
		
		if (!userDao.getAll().containsKey(userName)) {
			request.setAttribute("errorMsg", "This user is not exist.");
			RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			return;
		}
		
		UserBean dbUser = userDao.getAll().get(userName);	
		
		System.out.println("password: " + dbUser.getPassword());
		
		if (userDao.getAll().containsKey(userName) && !dbUser.getPassword().equals(pw)) {
			request.setAttribute("errorMsg", "This username and password is not match.");
			RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			return;
		}
		
		if (userDao.getAll().containsKey(userName) && dbUser.getPassword().equals(pw)) {
			HttpSession session = request.getSession();
			ServletContext application = session.getServletContext();
			application.setAttribute("allUsers", userDao.getAll());
			
			RequestDispatcher rd =request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd =request.getRequestDispatcher("fail.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
