import java.sql.*;
public class Deletepro {

		public static void main(String[]args) throws Exception {
			delete();
			}
			public static void delete() throws Exception {
				String url="jdbc:mysql://127.0.0.1:3306/product";
				String username="root";
				String password="0525";
				String Query="delete from details  where id=104";
				Connection con=DriverManager.getConnection(url, username, password);
				PreparedStatement pst=con.prepareStatement(Query);
				pst.executeUpdate();

				con.close();
				}

	}

