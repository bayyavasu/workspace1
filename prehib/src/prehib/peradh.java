package prehib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class peradh {
	public static void main(String[] args) {
		ArrayList<personpojo> al1=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
	        PreparedStatement ps=con.prepareStatement("select * from jan244.person p  inner join jan244.adhar a  on a.fkpid='1'");
		          ResultSet rs=ps.executeQuery();
		          while(rs.next())
		          {
		        	personpojo peradhar =new personpojo();
		        	peradhar.setId(rs.getInt(1));
		        	peradhar.setName(rs.getString(2));
		        	peradhar.setAge(rs.getInt(3));
		        	al1.add(peradhar);
		          }
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<al1.size();i++)
		{
			personpojo p=al1.get(i);
			System.out.print(p.getId());
			System.out.print(p.getName());
			System.out.print(p.getAge());
			System.out.println();
			
		}
	}
}
