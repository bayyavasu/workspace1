package ui;

import java.util.Scanner;

import contract.operation;
import impl.outil;

public class mainnn {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
int v1=Integer.parseInt(sc.nextLine());
int v2=Integer.parseInt(sc.nextLine());
System.out.println("enter operation");
String ope=sc.nextLine();
operation op=outil.getobject(ope);


int result=op.dooperation(v1,v2);
System.out.println(result);
}




}
