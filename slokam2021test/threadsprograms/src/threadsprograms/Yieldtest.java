package threadsprograms;

public class Yieldtest extends Thread {
public static void main(String[] args) {
	Yieldtest yt=new Yieldtest();
	
	
C c=new C();
yt.start();
c.start();
}
@Override
public void run() {
	Thread.currentThread().setName("main thread");
	String s1=Thread.currentThread().getName();
	for(int i=0;i<10;i++)
	{
		System.out.println(s1+"=======>"+i);
		if(i%2==0)
		{
			Thread.yield();
		}
	}

}
}
class C extends Thread
{
	@Override
	public void run() {
		Thread.currentThread().setName("C thread");
		String s2=Thread.currentThread().getName();
		for(int i=0;i<10;i++)
		{
			System.out.println(s2+"======>"+i);
		}
	}
}

