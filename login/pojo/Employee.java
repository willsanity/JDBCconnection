package login.pojo;

//Encapsulate

public class Employee {

	int empID;
	String empName;
	String empDOB;
	int empAge;
	String createBy;
	
	public Employee(int empID, String empName, String empDOB, int empAge, String createBy) {

		this.empID = empID;
		this.empName = empName;
		this.empDOB = empDOB;
		this.empAge = empAge;
		this.createBy = createBy;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	
	
}
