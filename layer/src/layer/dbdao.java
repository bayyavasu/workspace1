package layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class dbdao {
	public static void setstudents(ArrayList<student> al) throws ApplicationException{
		System.out.println("dbdao start");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pojo", "root", "root");
			PreparedStatement ps = con
					.prepareStatement("insert into exception(id,name,age,qual,marks,grade) values(?,?,?,?,?,?)");
		System.out.println("loop start");
			for (int i = 0; i < al.size(); i++) {
				student std = al.get(i);
				ps.setInt(1, std.getId());
				ps.setString(2, std.getName());
				ps.setInt(3, std.getAge());
				ps.setString(4, std.getQual());
				ps.setInt(5, std.getMarks());
				ps.setString(6, std.getGrade());
			ps.addBatch();
}
			ps.executeBatch();
		}catch(ClassNotFoundException e)
		{
			//e.printStackTrace();
			throw new ApplicationException("exception in loading the driver class in dbdao",e);
		}catch(SQLException e)
		{
			//e.printStackTrace();
			throw new ApplicationException("exception in loading the driver class in dbdao",e);
		}

	
System.out.println("dbdao end");
	}
}
