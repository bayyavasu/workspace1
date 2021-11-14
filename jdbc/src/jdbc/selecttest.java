package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class selecttest {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         Statement stmt=con.createStatement();
		String query="select * from jan24joins.slokam";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
		System.out.print(rs.getInt("sid") +" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString("scourse"));
		System.out.println();
		}
		con.close();
}catch(Exception e)
		{
	e.printStackTrace();
		}
	}

}
