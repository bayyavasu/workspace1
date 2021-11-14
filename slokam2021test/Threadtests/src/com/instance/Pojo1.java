package com.instance;

public class Pojo1 extends Thread{

	public void test1()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
		
	}
	public void test2()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
		
	}
		
	
}
