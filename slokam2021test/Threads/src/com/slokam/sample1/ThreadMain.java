package com.slokam.sample1;

public class ThreadMain {

public static void main(String[] args) {
	RunnableThread rt1=new RunnableThread();
	RunnableThread rt2=new RunnableThread();
	Thread   t1=new Thread(rt1);
	Thread   t2=new Thread(rt2);
	t1.start();
	t2.start();
}
}
