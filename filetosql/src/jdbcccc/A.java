package jdbcccc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A {
public void aa()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         PreparedStatement ps=con.prepareStatement("insert into pojo.product(pid,pname,pcolor,pprice,pcategory) values(?,?,?,?,?)");
         ps.setInt(1,77);
         ps.setString(2,"pp");
         ps.setString(3,"color77");
         ps.setInt(4,77);
         ps.setString(5, "cat77");
         ps.executeUpdate();

         ps.setInt(1,78);
         ps.setString(2,"pp78");
         ps.setString(3,"color8");
         ps.setInt(4,78);
         ps.setString(5, "cat78");
         ps.executeUpdate();
         

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
