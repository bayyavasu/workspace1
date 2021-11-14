import java.util.ArrayList;
import java.util.Scanner;

public class coltest {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int a=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<>(); 
	for(int i=1;i<=a;i++)
	{
	al.add(i);
	}
	for(int i=0;i<al.size();i++)
	{
	//System.out.print(al.get(i));
	}
	vvvv v=new vvvv();

	int b=v.methhod1(al);
	System.out.println(b);
	
}
}
