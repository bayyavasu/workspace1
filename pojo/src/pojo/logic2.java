package pojo;

import java.io.BufferedReader;
import java.io.FileReader;

public class logic2 
{
	product getProductsByName(String name)
	{
		product p=null;
		try {
			FileReader fr= new FileReader("d:\\productinfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				line=line.trim();
				if(line.length()>0)
				{
				String aa[]=line.split(",");
				if(name.equals(aa[1]))
				{
					
					p=new product();
					
			          p.id=Integer.parseInt(aa[0]);
			          p.name=aa[1];
			          p.color=aa[2];
			          p.price=Integer.parseInt(aa[3]);
				}
				
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return p;
	}

}
