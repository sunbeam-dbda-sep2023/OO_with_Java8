
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//creating a database "students"

public class Day15_13
{
	static final String DB_URL="jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String password = "manager";

	public static void main(String[] args)
	{
		// open a connection
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,password);
				Statement stmt = conn.createStatement();)
		{
			
			String query = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(query);
			System.out.println("database is created");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
