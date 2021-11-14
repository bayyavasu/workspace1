package com.synchronous;

import com.instance.Pojo1;

public class one extends Thread {
	private com.synchronous.Pojo1 pojo1;
	one(com.synchronous.Pojo1 p1)
	{
		this.pojo1=p1;
	}
		@Override
		public void run() {
			pojo1.test2();
			
		}

		
}
