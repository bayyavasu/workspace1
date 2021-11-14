package com.synchronous;

public class Pojo1 {
	public synchronized void test1()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
		
	}
	
	public synchronized void test2()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
		
	}
}
