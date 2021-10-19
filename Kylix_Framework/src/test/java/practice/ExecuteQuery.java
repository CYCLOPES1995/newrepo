package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {
	@Test
	public void executeQuery() throws SQLException {
		//step:1 register the database
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);
		//step:2 establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		//step:3 issue create statement
		Statement stat = con.createStatement();
		//step:4 execute the query
		ResultSet result = stat.executeQuery("Select * from customer;"); 
		ResultSetMetaData rsm=result.getMetaData();
		int ccount = rsm.getColumnCount();
		while(result.next())
		{
			for(int i=1;i<=ccount;i++) 
			{
				System.out.print(result.getString(i)+" ");
			}
			System.out.println("");
		}


	}

}
