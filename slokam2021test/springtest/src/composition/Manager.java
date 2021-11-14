package composition;

public class Manager {

	private Tl  t=new Tl();
	public void doWork()
	{
		System.out.println("Manager work started");
		t.doWork();
		System.out.println("Manager work end");
	}

}
