package war;

public class Auth {
	 public static boolean authenticate(String userName, String password) {
		    if ("user".equalsIgnoreCase(userName) && "user".equals(password)) {
		      return true;
		    }
		    return false;
		  }
		 
		}

