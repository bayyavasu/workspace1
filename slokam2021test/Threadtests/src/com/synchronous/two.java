package com.synchronous;

public class two extends Thread{
	private Pojo1 pojo1;
two(Pojo1 pojo1)
{
	this.pojo1=pojo1;
}
@Override
public void run() {
	pojo1.test1();
}

}
