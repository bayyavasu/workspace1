package composition;

public class Tl {
	private Developer1 dev=new Developer1();
	public void doWork()
	{
		System.out.println("Tl work started");
		dev.doWork();
		System.out.println("Tl work end");
	}
}
