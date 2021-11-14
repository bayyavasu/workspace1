package pojotest1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class logic {
ArrayList<product>  productByCategory(String category)
{
	ArrayList<product> al=new ArrayList<>();
	product prod=null;
	try
	{
		FileReader fr =new FileReader("D:\\pojo\\produt2.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			line=line.trim();
			if(line.length()>0)
			{
				String arr[]=line.split(";");
				if(arr[4].equals(category))
				{
				 prod=new product();
	               prod.setId(Integer.parseInt(arr[0]));
                    	prod.setName(arr[1]);
	                prod.setColor(arr[2]);
                  	prod.setPrice(Integer.parseInt(arr[3]));
                        	prod.setCategory(arr[4]);
                        	al.add(prod);
					}
			}
		}
	}catch(Exception e)
	{
	e.printStackTrace();
	}
	return  al;
}
}
