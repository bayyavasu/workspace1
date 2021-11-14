package com.instance;

public class one extends Thread {
private Pojo1 pojo1;
one(Pojo1 pojo1)
{
	this.pojo1=pojo1;
}
	@Override
	public void run() {
		pojo1.test1();
		
	}

	
}
