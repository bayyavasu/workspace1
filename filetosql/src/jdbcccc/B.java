package jdbcccc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {

	public void b() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pojo", "root", "root");
			Statement st = con.createStatement();
			
			String query = "insert into pojo.product(pid,pname,pcolor,pprice,pcategory) values(999,'pp79','cc79',79,'79c')";
			int h = st.executeUpdate(query);
			System.out.print(h);
			String query1 = "insert into pojo.product(pid,pname,pcolor,pprice,pcategory) values(100,'pp79','cc79',79,'79c')";
			int i = st.executeUpdate(query1);
			System.out.print(h);
			String query2 = "insert into pojo.product(pid,pname,pcolor,pprice,pcategory) values(101,'pp79','cc79',79,'79c')";
			int j = st.executeUpdate(query2);
			System.out.print(h);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
