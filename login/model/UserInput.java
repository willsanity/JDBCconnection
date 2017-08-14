package login.model;

import java.util.Scanner;

import login.controller.LoginController;
import login.pojo.LoginEncap;

// User input methods
// Scanner 
public class UserInput {

	
	public void userLogin(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("-----------------------\n "
							+ "Please enter userName :\n"
							+"-----------------------\n");
		
		String userName = sc.nextLine();
		
		System.out.print("-----------------------\n"
							+ "Please enter userPassword :\n"
							+ "-----------------------\n");
		
		String pw = sc.nextLine();
		
		LoginController lc = new LoginController();
		lc.validateUser(userName, pw);

	}
}
