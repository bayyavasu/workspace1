package feb19;

import java.io.BufferedReader;
import java.io.FileReader;

public class studentnamebasedonId {
	int id;
String 	getNameById(int id)
{
	String name="";
	this.id=id;
	try {
		FileReader fr=new FileReader("D:\\filewrite.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			str=str.trim();
			String aa[]=str.split(",");
			int num=Integer.parseInt(aa[0]);
			if(num==id)
			{
			   name=aa[1];
			}
		}

}catch(Exception e)
	{
	e.printStackTrace();
	}
return name;
}
}
