package p1;

import java.util.Scanner;

public class nineth {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("enter the number of rotations needed");
	int n=d.nextInt();
	int a[]= {4,5,1,9,7};
	for(int k=0;k<n;k++)
	{
	for(int i=0;i<a.length-1;i++)
	{
	int temp=a[i];
	a[i]=a[a.length-1];
	a[a.length-1]=temp;
	}
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]);

	
}
	System.out.println();
	
	}
	System.out.println("enter the required position");
	int pos=d.nextInt();
	System.out.println(a[pos]);
	
	
	
}
}
