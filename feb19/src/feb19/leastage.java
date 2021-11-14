package feb19;

import java.io.BufferedReader;
import java.io.FileReader;

public class leastage {
	public static void main(String[] args) {
		int sa=100;
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
				int n=Integer.parseInt(arr[2]);
				
				if(sa>n)
				{
					sa=n;
				
				}
			}
			}
			System.out.println(sa);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
