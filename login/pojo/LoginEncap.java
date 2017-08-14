package login.pojo;

//Login
public class LoginEncap {

	String userName;
	String userPassword;
	int	empID;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public LoginEncap(String userName, String userPassword, int empID) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.empID = empID;
	}

	
}
