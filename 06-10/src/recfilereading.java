import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class recfilereading {
	public static List<String> filenames=new ArrayList();
public static void main(String[] args)
{
	readFileNames("D:\\MS OFFICE");
	System.out.println(filenames);
	System.out.println(filenames.size());
}
public static void readFileNames(String foldername) {
	File folder=new File(foldername);
	if(folder.isDirectory())
	{
		File[] files=folder.listFiles();
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isFile())
			{
				filenames.add(files[i].getName());
			}else if(files[i].isDirectory())
			{
				readFileNames(files[i].getAbsolutePath());
			}
		}
	}
	
}
}
