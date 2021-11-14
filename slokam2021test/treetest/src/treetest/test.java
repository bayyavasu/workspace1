package treetest;

import java.util.Scanner;
import java.util.TreeSet;

public class test {
public static void main(String[] args) {
	student s1=new student(1,"vasu",22,"10th");
	student s2=new student(2,"mani",30,"12th");	
	student s3=new student(2,"moulali",40,"Degree");	
	student s4=new student(4,"venkat",76,"Btech");	
	student s5=new student(5,"papi",19,"PG");
 Scanner sc=new Scanner(System.in);
 System.out.println("enter option");
 System.out.println("1.ID");
 System.out.println("2.NAME");
 System.out.println("3.AGE");
 System.out.println("enter order");
 System.out.println("1.Ascending");
 System.out.println("2.Descending");
 int option=sc.nextInt();
 
 int order=sc.nextInt();

 
	
	TreeSet<student> ts=null;
	if(option==1 && order==1)
	ts=new TreeSet<>(new compareStudentId());
	else if(option==1 && order==2)
		ts=new TreeSet<>(new compareStudentId().reversed());
	else if(option==2 && order==1)
		ts=new TreeSet<>(new comparestudentname());

	else if(option==2 && order==2)
		ts=new TreeSet<>(new comparestudentname().reversed());

	else if(option==3 && order==1)
		ts=new TreeSet<>(new comparestudentage());

	else if(option==3 && order==2)
		ts=new TreeSet<>(new comparestudentage().reversed());

		
		/*
		 * switch(option) { case 1: ts=new TreeSet<>(new compareStudentId());break; case
		 * 2: ts=new TreeSet<>(new comparestudentname());break; case 3: ts=new
		 * TreeSet<>(new comparestudentage());break; }
		 */
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);
	
	System.out.println(ts);

}
}
