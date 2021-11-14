package pojotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class logic2 {
		ArrayList<product> getAllProductsBynamestartswith( String name)
		{
			ArrayList<product> allproducts=new ArrayList<>();
			product p1=null;
			try {
				FileReader fr= new FileReader("D:\\filewrite.txt");
				BufferedReader br=new BufferedReader(fr);
				String line;
				while((line=br.readLine())!=null)
				{
					line=line.trim();
					if(line.length()>0)
					{
						p1=new product();
						String aa[]=line.split(",");
						if(aa[1].startsWith(name))
						{
						p1.id=Integer.parseInt(aa[0]);
						p1.name=aa[1];
						p1.color=aa[2];
						p1.price=Integer.parseInt(aa[3]);
						allproducts.add(p1);
						}
				
					}
				
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return allproducts;
		}
}
