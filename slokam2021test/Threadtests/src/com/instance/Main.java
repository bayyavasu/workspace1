package com.instance;

public class Main {
public static void main(String[] args) {
	//runs parallelly
	Pojo1 p1=new Pojo1();
	one o=new one(p1);
	one o1=new one(p1);
	o.start();
	o1.checkAccess();
	o1.start();
}
}
