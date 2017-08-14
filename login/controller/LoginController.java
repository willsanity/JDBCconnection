package login.controller;

import login.model.LoginDAO;
import login.pojo.LoginEncap;

// function statement

public class LoginController {

	public void validateUser(String userName, String pw){
		
	LoginDAO ref = new LoginDAO();
	LoginEncap le1 = ref.retrieveUserName(userName);
	
	
	if(le1 == null)
	{
		System.err.println("Account does not exist!");
	}
	else {
		
		if(pw.equals(le1.getUserPassword() ) )
		{
			System.out.println("=============\n"
							   + "Welcome " +userName +"\n"
							   +"=============\n");
			
		}
		else {
			
			System.err.println("-----------------------\n"
							+ "You have entered the wrong password ! \n"
							+ "-----------------------\n");
		}
		
	}
	
	 
  }
	
}