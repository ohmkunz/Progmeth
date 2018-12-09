
import java.sql.*;
public class Driver {
	
	
		
	
	
	
	public static void main(String[] args) {
		//"jdbc:mysql://127.0.0.1:3306/cdrent"
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cdrent", "root", "pond"); 
			
			
			Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from userinfo");
			String k = "eiei";  
			String sql = "insert into userinfo"
					+"(Username, Password)"
					+"values ('"+k.toString()+"','sssss')";
			
			myStmt.executeUpdate(sql);
			
			
		}catch(SQLException e1) {
			System.out.println(e1.toString());
			
		}
		
		
	}
	
}

