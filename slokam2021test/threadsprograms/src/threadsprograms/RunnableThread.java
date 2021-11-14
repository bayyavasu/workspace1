package threadsprograms;

public class RunnableThread implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}	
	}
}
