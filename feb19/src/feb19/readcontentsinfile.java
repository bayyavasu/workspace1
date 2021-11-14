package feb19;

import java.io.BufferedReader;
import java.io.FileReader;

public class readcontentsinfile {
public static void main(String[] args) {
	int count=0;
	try
	{
		FileReader fr=new  FileReader("D:\\filewrite.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while( (str=br.readLine())!=null)
		{
			str.trim();
			if(str.length()>0)
			{
			String arr[]=str.split(",");
			int n=Integer.parseInt(arr[3]);
			count=count+n;
		}
		}
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println(count);
}
}
