package functionalprogrammingmethods;

import java.io.File;

public class fileoperations {
	public static void main(String[] args) {
		File fi=new File("D:\\vv");
		if(fi.exists())
		{
			System.out.println("file is existed");
		}else
		{
		try
		{
			fi.createNewFile();
		System.out.println("file created");
		
		}
		catch(Exception e)
		{
			System.out.println("unable to create a file");
			e.printStackTrace();
		}
		}
	}
	public static void main1(String[] args) {
		File f=new File("D:\\jp\\a.java");
		System.out.println(f.exists());
	
	System.out.println(f.length());
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f.getParent());
	System.out.println(f.getParentFile());
	}

}
