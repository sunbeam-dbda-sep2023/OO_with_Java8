import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//creating a table "registration" in database "students"

public class Day15_14
{
	static final String DB_URL="jdbc:mysql://localhost/students";
	static final String USER = "root";
	static final String password = "manager";

	public static void main(String[] args)
	{
		// open a connection
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,password);
				Statement stmt = conn.createStatement();)
		{
			
			String query = "CREATE TABLE REGISTRATION "+
			"(id INTEGER not null, "+
					"first VARCHAR(255), "+
			"last VARCHAR(255), "+
					"age INTEGER, "+
			" PRIMARY KEY (id))";
			stmt.executeUpdate(query);
			System.out.println("table is created in database...");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
