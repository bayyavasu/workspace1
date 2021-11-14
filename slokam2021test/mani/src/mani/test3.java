package mani;

import java.util.Scanner;

public class test3 {
public static void main(String[] args) {
	System.out.println("cost of ticket");
	Scanner sc=new Scanner(System.in);
	float x,y;
	 int cost;
	 cost=sc.nextInt();
	 System.out.println("Number of Tickets");
	 int n=sc.nextInt();
	 
	 if(n<50)
	 {
		 float expenses;
		 expenses=n*cost; 
		 System.out.println(expenses);
	 }else if(n>50&&n<100)
	 {
		 
       x=n*cost;
       System.out.println(x);
      float  expenses=(10/100)*x;
       System.out.println(expenses);
	 }
	 else if(n>100&&n<=200)
	 {
		 float expenses;
       x=n*cost;
       System.out.println(x);
       expenses=(float)20/100*x;
      System.out.println(x);
       System.out.println(expenses);
	 }else if(n>200&&n<=400)
	 {
		 float expenses;
	       x=n*cost;
	       System.out.println(x);
	       expenses=(float)(30/100)*x;
	       System.out.println(expenses);
		 }else if(n>400&&n<=500)
		 {
			 float expenses;
		       x=n*cost;
		       System.out.println(x);
		       expenses=(float)(40/100)*x;
		       System.out.println(expenses);
			 }
		 else if(n>500)
		 {
			 float expenses;
		       x=n*cost;
		       System.out.println(x);
		       expenses=(float)(50/100)*x;
		       System.out.println(expenses);
			 }
	
}
}
