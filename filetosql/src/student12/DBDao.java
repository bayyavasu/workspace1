package student12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DBDao {
	public static void savestudents(ArrayList std) {
		try {
			

			for (int i = 0; i < std.size(); i++) {
						student st = (student) std.get(i);
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student12", "root", "root");
				PreparedStatement ps = con.prepareStatement(
						"insert into student12.passedstudents(id,name,course,marks) values(?,?,?,?)");
				ps.setInt(1, st.getId());
				ps.setString(2, st.getName());
				ps.setString(3, st.getCourse());
				ps.setInt(4, st.getMarks());
			

				ps.executeUpdate();

			}
		} catch (Exception e) {

		}
	}
}
