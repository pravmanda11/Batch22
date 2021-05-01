package SeleniumPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class databaseAutomation {

	public static void main(String[] args) throws SQLException {

		String URL = "jdbc:port:4040";
		String UN = "Praveen12";
		String PWD = "Test123#";

		// Connection to Database
		Connection con = DriverManager.getConnection(URL, UN, PWD);

		// To establish connection between table and database
		Statement stmt = con.createStatement();

		// Run the Query on particular Database
		ResultSet Res = stmt.executeQuery("Select * from employee");

		while (Res.next()) {
			String table_row1 = Res.getString(1);
			String table_row2 = Res.getString(2);
			System.out.println(table_row1);
			System.out.println(table_row2);
		}

	}

}
