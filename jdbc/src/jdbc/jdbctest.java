package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbctest {
public static void main(String[] args) {
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");

	Statement st=con.createStatement();
	String query=" insert into jan24joins.slokam(sid,sname,sage,scourse) values(88,'name',33,'core')";
int rs=st.executeUpdate(query);
	System.out.println(rs );
	con.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
