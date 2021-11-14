package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updatetest {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         Statement stmt=con.createStatement();
		String query="update jan24joins.slokam set sage=50 where sid='7'";
		int a=stmt.executeUpdate(query);
		System.out.println(a);
		con.close();
}catch(Exception e)
		{
	e.printStackTrace();
		}
	}
}
