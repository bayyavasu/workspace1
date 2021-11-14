package p1;

import java.util.Scanner;

public class third {
public static void main(String[] args) {
	Scanner f=new Scanner(System.in);
	int a[]= {4,6,5,7,1,3,9};
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
