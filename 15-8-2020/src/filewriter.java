import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
public static void main(String[] args)  {
	FileWriter fw=null;
			 BufferedWriter bw=null;
	try
	{
	 fw=new FileWriter("D:\\filewrite.txt");
      bw=new BufferedWriter(fw);
	bw.write("hii jncn jcccdewj jnn");
	bw.flush();
	bw.newLine();
	bw.write("hello");
	bw.flush();
	bw.close();
}catch(Exception e)
	{
	System.out.println("error");
	}

finally
{
try
{
	fw.close();
	bw.close();
}catch(Exception e)
{
System.out.println("error");
}

}}
}
