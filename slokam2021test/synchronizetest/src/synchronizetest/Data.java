package synchronizetest;

public class Data {

	synchronized void test()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	synchronized static void test2()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
