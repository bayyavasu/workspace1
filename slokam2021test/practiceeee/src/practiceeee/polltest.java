package practiceeee;

import java.util.Scanner;

public class polltest {
public static void main(String[] args) {
	int n,pall=0,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
while(n>0)
	{
	
		int temp=n;
	
			while(n>0)
	{
		a=n%10;
		pall=(pall*10)+a;
		n=n/10;
		}
			System.out.println(pall);
	if(temp==pall)
	{
		System.out.println(pall);
		break;
	}
	n++;
}
}
}
