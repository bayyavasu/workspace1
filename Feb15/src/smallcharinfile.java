import java.io.FileReader;
public class smallcharinfile {
public static void main(String[] args) {
	try {
	FileReader fr=new FileReader("D:\\filewrite.txt");
	int i=fr.read();
	int count=0;
	while(i!=-1)
	{
		if(i>='a' & i<='z')
		{
			count++;
		}
		i=fr.read();
	}
	System.out.println(count);
	
	
	
	}catch(Exception e)
	{
		System.out.println("error");
	}
}
}
