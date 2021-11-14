import java.io.BufferedReader;
import java.io.FileReader;

public class typesofreading {
public static void main(String[] args) { 
	try
{
	FileReader fr=new FileReader("D:\\vv");
	BufferedReader br=new BufferedReader(fr);
			
//			  int a=fr.read();
//			  System.out.println(a);              
//			 b=(char)fr.read();
//			 System.out.println(b);
//		
//			
//			
//			  int a;
//			  
//			  while((a=fr.read())!=-1) 
//			  {
//				  System.out.println((char)a);
//				  }
//			 	
String b;
	
	while((b=br.readLine())!=null)
	{
		System.out.println(b);
	
	}
	System.out.println();
  

}
catch(Exception e)
	{
	
	}
}
}