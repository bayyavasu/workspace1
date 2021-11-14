package functionalprogrammingmethods;

import java.io.File;

public class printlistoffiles {
public static void main(String[] args) {
	File f=new File("D:\\jp");
	if(f.isDirectory())
	{
		File[] filelist=f.listFiles();
		
		for(File s:filelist)
		{
			if(s.isDirectory())
			{
				File[] filelist2=s.listFiles();
				
				for(File s1:filelist2)
				{
			System.out.println(s1.getAbsolutePath());
		}
	}else
	{
		System.out.println(s.getAbsolutePath());
	}
}
}
}
}