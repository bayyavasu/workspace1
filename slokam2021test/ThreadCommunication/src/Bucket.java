
public class Bucket {
private int water;
boolean isEmpty=true;
public synchronized void consumerwork()
{
	if(isEmpty==true)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("consuming water"+water);
	
isEmpty=true;
notifyAll();
}
public synchronized void producerwork(int a)
{
	if(isEmpty==false)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("filling water"+a);
	water=a;
	isEmpty=false;
	notify();
}
}
