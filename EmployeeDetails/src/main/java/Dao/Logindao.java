package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Logindao {

	public boolean checkuser(String loginid, String pass) {
		boolean flag = false;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			
            String sql = "SELECT * FROM admin WHERE loginid=? AND password=? ";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,loginid);
			ps.setString(2,pass);
		    String id = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        return flag;
	}
	
}
