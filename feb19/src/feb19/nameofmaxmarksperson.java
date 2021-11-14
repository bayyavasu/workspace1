package feb19;

import java.io.BufferedReader;
import java.io.FileReader;

public class nameofmaxmarksperson {
public static void main(String[] args) {
	String name="";
	
	try {
		FileReader fr=new FileReader("D:\\filewrite.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		int hm=0;
		while((str=br.readLine())!=null)
		{
			str=str.trim();
			String aa[]=str.split(",");
			int marks=Integer.parseInt(aa[3]);
			if(marks>hm)
			{
			    hm=marks;
			    name=aa[1];
			}
		}
		System.out.println(name);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
