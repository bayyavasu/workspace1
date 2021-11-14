package threadsprograms;

public class Sleeptest extends Thread {

@Override
public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i%2==0)			{
				try
				{
				Thread.sleep(800);
				}catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
		}
}


public static void main(String[] args) {
	
	
Sleeptest s=new Sleeptest();
s.start();
}
}
class A extends Thread
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
}
