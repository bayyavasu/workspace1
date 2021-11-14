package testjar;
import java.util.Scanner;
import calculation.healper;
public class test {
public static void main(String[] args) {
	healper h=new healper();
	Scanner s=new Scanner(System.in);
	System.out.println("enter operation");
	String str1=s.nextLine();



	System.out.println("enter a and b");
	int a=s.nextInt();
	int b=s.nextInt();
		h.doOperation(a,b,str1);
	
}
}
