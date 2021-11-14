package pojotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class logic {
	ArrayList<product> getAllProducts( String filename)
	{
		ArrayList<product> allproducts=new ArrayList<>();
		product p=null;
		try {
			FileReader fr= new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				line=line.trim();
				if(line.length()>0)
				{
					p=new product();
					String aa[]=line.split(",");
					p.id=Integer.parseInt(aa[0]);
					p.name=aa[1];
					p.color=aa[2];
					p.price=Integer.parseInt(aa[3]);

			
				}
				allproducts.add(p);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return allproducts;
	}

}
