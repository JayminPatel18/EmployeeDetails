package Model;

public class Admin {

	private int id;
	private String loginid;
	private String password;
	
	
	public Admin(String loginid, String password) {
		this.loginid = loginid;
		this.password = password;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
	
