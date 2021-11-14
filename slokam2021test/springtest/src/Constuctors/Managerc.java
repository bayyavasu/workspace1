package Constuctors;

import Constructors.Tlc;

public class Managerc {
	private Tlc tt;
	
	public Managerc(Tlc tt) {
		super();
		this.tt=tt;
	}

	public void doWork()
	{
		System.out.println("Manager work started");
		tt.doWork();
		System.out.println("Manager work end");
	}
}
