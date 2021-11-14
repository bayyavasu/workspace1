package jdbcpojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class retrievethedatafromsql {
public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
	         PreparedStatement ps=con.prepareStatement("select * from jan24joins.slokam");
	      ResultSet rs=ps.executeQuery();
	      ArrayList<person> pp=new ArrayList<>();
	      while(rs.next())
	      {
             person p=new person();
             p.setId(rs.getInt(1));
             p.setName(rs.getString(2));
             p.setAge(rs.getInt(3));
             p.setCourse(rs.getString(4));
	    	pp.add(p);
	      }
			for(int i=0;i<pp.size();i++)
			{
				person p=pp.get(i);
				System.out.print(p.getId());
				System.out.print(p.getName());
				System.out.print(p.getCourse());
				System.out.print(p.getAge());
				System.out.println();
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

}
}