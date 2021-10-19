package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	@Test
	public void executeQuery() throws SQLException {
		Connection con =null;
		try {
		//step:1 register the database
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);
		//step:2 establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		//step:3 issue create statement
		Statement stat = con.createStatement();
		//step:4 execute the query
		int result = stat.executeUpdate("insert into customer (id,first_name,last_name,address)\r\n"
				+ "values(13,'Gaurav', 'Patel', 'Jhansi');\r\n"
				+ "");
		if(result==1) {
			System.out.println("TABLE IS UPDATED");
		}
		else {
			System.out.println("QUERY FAILED");
		}
		stat.executeUpdate("delete from customer where id='4';");
		stat.executeUpdate("delete from customer where id='5';");
		ResultSet res = stat.executeQuery("Select * from customer;");
		ResultSetMetaData rsm=res.getMetaData();
		int ccount = rsm.getColumnCount();
		while(res.next())
		{
			for(int i=1;i<=ccount;i++) 
			{
				System.out.print(res.getString(i)+" ");
			}
			System.out.println("");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
         finally {
        	 con.close();
         }

	}

}
