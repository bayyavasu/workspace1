package filetosql;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class dao 
{
	public void filetosql()
{
	ArrayList<product> allproducts=new ArrayList<>();
product p1=null;
	try
	{
		FileReader fr= new FileReader("D:\\produt2.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			line=line.trim();
			if(line.length()>0)
			{
				p1=new product();
				String aa[]=line.split(";");
				p1.setId(Integer.parseInt(aa[0]));
				p1.setName(aa[1]);
				p1.setColor(aa[2]);
				p1.setPrice(Integer.parseInt(aa[3]));
				p1.setCategory(aa[4]);
				allproducts.add(p1);
				}
		}
	}catch(Exception e)
	{
e.printStackTrace();		
	}
	sqll(allproducts);
}
	public void sqll(ArrayList<product> allproducts)
	{
		try
		{
			for(int i=0;i<allproducts.size();i++)
			{
				
			product p=allproducts.get(i);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan24joins","root","root");
	         PreparedStatement ps=con.prepareStatement("insert into pojo.product(pid,pname,pcolor,pprice,pcategory) values(?,?,?,?,?)");
	        ps.setInt(1, p.getId());
	        ps.setString(2, p.getName());
	        ps.setString(3, p.getColor());
	        ps.setInt(4, p.getPrice());
	        ps.setString(5, p.getCategory());
	        ps.executeUpdate();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

