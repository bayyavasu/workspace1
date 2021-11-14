package layer;

import java.util.Scanner;

public class studentmain {
public static void main(String[] args) {
	service serv=new service();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter qual");
	String qual=sc.nextLine();

	System.out.println("enter start marks");
	int startMarks=sc.nextInt();
	System.out.println("enter end marks");
	int endMarks=sc.nextInt();

	try
	{
	serv.processData(startMarks, endMarks, qual);
}catch(ApplicationException e)
	{
	//e.printStackTrace();
	System.out.println(e.getMessage());

	System.out.println(e.getCause());
	}finally {
	sc.close();
	
	}
}
}