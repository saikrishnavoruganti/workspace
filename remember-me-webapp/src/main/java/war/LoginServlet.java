package war;


	import java.io.IOException;
	 
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.Cookie;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	 
	import com.roytuts.auth.Auth;
	 
	/**
	 * Servlet implementation class LoginServlet
	 */
	public class LoginServlet extends HttpServlet {
	  private static final long serialVersionUID = 1L;
	 
	  /**
	   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	   */
	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	  }
	 
	  /**
	   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	   */
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String userName = request.getParameter("username");
	    String password = request.getParameter("password");
	    if (userName != null && userName.trim().length() > 0 && password != null && password.trim().length() > 0) {
	      System.out.println(userName + ":" + password);
	      boolean success = Auth.authenticate(userName.trim(), password.trim());
	      if (success) {
	        if (request.getParameter("remember") != null) {
	          String remember = request.getParameter("remember");
	          System.out.println("remember : " + remember);
	          Cookie cUserName = new Cookie("cookuser", userName.trim());
	          Cookie cPassword = new Cookie("cookpass", userName.trim());
	          Cookie cRemember = new Cookie("cookrem", remember.trim());
	          cUserName.setMaxAge(60 * 60 * 24 * 15);//15 days
	          cPassword.setMaxAge(60 * 60 * 24 * 15);
	          cRemember.setMaxAge(60 * 60 * 24 * 15);
	          response.addCookie(cUserName);
	          response.addCookie(cPassword);
	          response.addCookie(cRemember);
	        }
	        HttpSession httpSession = request.getSession();
	        httpSession.setAttribute("sessuser", userName.trim());
	        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
	        requestDispatcher.forward(request, response);
	      } else {
	        System.out.println("Authentication failure.");
	        request.setAttribute("msg", "Authentication failure.");
	        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
	        requestDispatcher.forward(request, response);
	      }
	    } else {
	      System.out.println("Username and Password are required fields.");
	      request.setAttribute("msg", "Username and Password are required fields.");
	      RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
	      requestDispatcher.forward(request, response);
	    }
	  }
	}
}
