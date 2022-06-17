package myproject;

import java.util.ResourceBundle;

public class app {

	public int userlogin(String in_user, String in_pwd) {
		ResourceBundle rd= ResourceBundle.getBundle("config");
	  String userName=rd.getString("username");
	  String pass=rd.getString("password");
	  
	  if(in_user.equals(userName) && in_pwd.equals(pass))
		return 1;
	  else
		return 0;
	}
}
