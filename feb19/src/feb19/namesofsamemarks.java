package feb19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class namesofsamemarks {
	int marks,d;
	
	ArrayList<String> 	getNamesBymarks(int marks)
	{
		this.marks=marks;
		ArrayList<String> list=new ArrayList<>();
		int i=0;
		try {
			FileReader fr=new FileReader("D:\\filewrite.txt");
			BufferedReader br=new BufferedReader(fr);
			String str;int count=0;
			while((str=br.readLine())!=null)
			{
				str=str.trim();
				String aa[]=str.split(",");
				int num=Integer.parseInt(aa[3]);
				if(num==marks)
				{
					
				  list.add(aa[1]);
				 	}
			}
	
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
return list;
	}
}
