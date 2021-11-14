package threadsprograms;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threadusingcallable {
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(1); 
		A11 a1=new A11(1,5);
		A11 a2=new A11(1,5);
		Future<Integer> data1=service.submit(a1);
		Future<Integer> data2=service.submit(a2);
		try
		{
			int a=data1.get();
			int b=data2.get();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		service.isShutdown();
	}

}
class A11 implements Callable<Integer> {
private int start;
private int end;
	A11(int start,int end)
	{
		super();
		this.start=start;
		this.end=end;
	}
	
	@Override
	public Integer call() throws Exception {
		int count=0;
		for(int i=start;i<=end;i++) {
			//Thread.sleep(100);
			System.out.println(Thread.currentThread().getName()+"::"+i);
			count =count+i;
		}
		return count;
	}
	
}
