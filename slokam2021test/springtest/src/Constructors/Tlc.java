package Constructors;

import Constuctors.DeveloperC;

public class Tlc {
	private DeveloperC devc;
	
	public Tlc(DeveloperC devc) {
		super();
		this.devc=devc;
	}

	public void doWork()
	{
		System.out.println("Tl work started");
		devc.doWork();
		System.out.println("Tl work end");
	}
}
