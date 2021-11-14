package com.synchronous;
public class Main {
	public static void main(String[] args) {
	Pojo1 p1=new Pojo1();
	one o=new one(p1);
	o.setName("o1");
	//one o1=new one(p1);
	//o1.setName("o2");
	two t1=new two(p1);
	t1.setName("t1");
	//two t2=new two(p1);
	//t2.setName("t2");
	
	o.start();
	//o1.start();
	t1.start();
	//t2.start();
}
}