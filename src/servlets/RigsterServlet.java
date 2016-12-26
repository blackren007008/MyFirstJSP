package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class RigsterServlet
 */
@WebServlet("/RigsterServlet")
public class RigsterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDao = UserDao.getInstance();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RigsterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String pw = request.getParameter("password");
		String sex = request.getParameter("sex");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		UserBean newUser = new UserBean();
		newUser.setUsername(userName);
		newUser.setPassword(pw);
		newUser.setSex(sex);
		newUser.setTel(tel);
		newUser.setAddress(address);
		newUser.setEmail(email);
		
		userDao.createUser(newUser);
		
		RequestDispatcher rd =request.getRequestDispatcher("success.jsp");
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
