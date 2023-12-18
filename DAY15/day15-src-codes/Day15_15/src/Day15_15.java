
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//inserting records in a table "registration" in database "students"

public class Day15_15
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
			
			String query = "INSERT INTO registration VALUES(100,'p1','l1',40)";
			stmt.executeUpdate(query);
			
			query = "INSERT INTO registration VALUES(101,'p2','l2',35)";
			stmt.executeUpdate(query);
			
			query = "INSERT INTO registration VALUES(102,'p3','l3',45)";
			stmt.executeUpdate(query);
			
			query = "INSERT INTO registration VALUES(103,'p4','l4',25)";
			stmt.executeUpdate(query);
			
			
			System.out.println("added records in table ...");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
