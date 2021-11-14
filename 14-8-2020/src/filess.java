
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class filess {

public static void main(String args[])throws Exception
{
	try
	{
	FileReader f=new FileReader("D:\\vasu.txt");
	BufferedReader fr=new BufferedReader(f);
	String str=fr.readLine();
	while(str !=null)
	{
		System.out.println(str);
		str=fr.readLine();
	}
	System.out.println(str);
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}