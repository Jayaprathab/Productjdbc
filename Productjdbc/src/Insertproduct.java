import java.sql.*;
public class Insertproduct {
 
	public static void main(String[]args) throws Exception {
		insert();
	}
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/product";
		String username="root";
		String password="0525";
		String Query="insert into details values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 109);
		pst.setString(2, "oneplus nord");
		pst.setInt(3,29000);
		pst.executeUpdate();
		con.close();
		}
	
	
	
}
