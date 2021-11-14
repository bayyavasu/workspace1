package jdbcpojo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class dao {
public void insertt(person p)
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         PreparedStatement ps=con.prepareStatement("insert into jan24joins.slokam(sid,sname,sage,scourse) values(?,?,?,?)");
        ps.setInt(1, p.getId());
        ps.setString(2, p.getName());
        ps.setInt(3, p.getAge());
        ps.setString(4, p.getCourse());
        int rs=ps.executeUpdate();
        
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void update(person p)
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         PreparedStatement ps=con.prepareStatement("update jan24joins.slokam set scourse=? where sid=?");
        ps.setString(1, p.getCourse());
        ps.setInt(2, p.getId());
       
        int rs=ps.executeUpdate();
        
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void select()

{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
         PreparedStatement ps=con.prepareStatement("select * from jan24joins.slokam");
      ResultSet rs=ps.executeQuery();
      while(rs.next())
      {
    	System.out.print(rs.getInt("sid"));
    	System.out.print(rs.getString("sname"));
    	System.out.print(rs.getInt("sage"));
    	System.out.print(rs.getString("scourse"));
    	System.out.println();
    	
      }
        
	}catch(Exception e)
	{
		e.printStackTrace();
	}

}

}
