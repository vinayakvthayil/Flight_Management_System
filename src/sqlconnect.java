
import java.sql.*;
public class sqlconnect {
	public Connection connect() {
		Connection db= null;
		try {
			db = DriverManager.getConnection("jdbc:postgresql://localhost/project", "postgres", "408070");
			if(db!=null)
				System.out.println("Connected!");
			
			/*ResultSet rs = st.executeQuery("SELECT * FROM test");
			*/
			}catch(Exception e) {
				System.out.println(e);
			}
		return db;
	}
	public static void main(String[] args) {
	    sqlconnect connection = new sqlconnect();
	    Connection con = connection.connect();
	    Statement st;
	    String query="SELECT * from localflights";
	    try {
	        st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        while (rs.next()) {
	            System.out.print("");
	            System.out.println(rs.getString(1));
	        }
	    } catch(SQLException e) {
	        System.err.println("Error: " + e.getMessage());
	    }
	}
}
