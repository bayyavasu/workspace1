package threadsprograms;

public class JoinTest extends Thread {
public static void main(String[] args) {
	JoinTest jt=new JoinTest();
	
	B a =new B();
	try
	{
	a.join();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	a.start();

	jt.start();

}

@Override
public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
	}
}


}
class B extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
