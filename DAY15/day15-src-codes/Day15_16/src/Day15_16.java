
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//select records and display records from table "registration" in database "students"

public class Day15_16 
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
			
			String query = "select id,first,last,age from registration";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("ID = "+rs.getInt("id"));
				System.out.println("Age = "+rs.getInt("age"));
				System.out.println("First = "+rs.getString("first"));
				System.out.println("Last = "+rs.getString("last"));
				
			}
			
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
