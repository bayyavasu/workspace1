package filetosql22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBDao {
static void saveStudent(Student std)
{
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
    PreparedStatement ps=con.prepareStatement("insert into march10.student22(id,name,age,qual) values(?,?,?,?)");
    ps.setInt(1, std.getId());
    ps.setString(2,std.getName());
    ps.setInt(3, std.getAge());
    ps.setString(4, std.getQual());
    ps.executeUpdate();
    }catch(Exception e)
{
	e.printStackTrace();
}
}
}
