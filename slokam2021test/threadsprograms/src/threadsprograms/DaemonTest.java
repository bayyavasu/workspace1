package threadsprograms;

import java.util.Set;

public class DaemonTest  {
public static void main(String[] args) {
	Set<Thread> set=Thread.getAllStackTraces().keySet();
	
	//System.out.println(thread);
	for (Thread se : set) {
//	System.out.println(thread2.isDaemon());	
	}
	
   Thread t=new Thread(()-> {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	});
   t.setDaemon(true);
   t.start();

}
}
