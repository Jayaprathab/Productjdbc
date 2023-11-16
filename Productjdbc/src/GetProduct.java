
import java.sql.*;
public class GetProduct {
  
	public static void main(String[]args) throws Exception {
	get();
	}
	public static void get() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="0525";
		String Query="select * from details"; //where id=101
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id is:"+rs.getInt(1));
			System.out.println("name is:"+rs.getString(2));
			System.out.println("amount is:"+rs.getInt(3));
			}
		con.close();
		}
	
}
