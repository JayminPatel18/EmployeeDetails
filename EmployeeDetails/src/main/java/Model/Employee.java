package Model;

public class Employee {

	private int id;
	private String loginid;
	private String empname;
	private String department;
	private String skills;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String loginid, String empname, String department, String skills, int salary) {
		super();
		this.loginid = loginid;
		this.empname = empname;
		this.department = department;
		this.skills = skills;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



}
