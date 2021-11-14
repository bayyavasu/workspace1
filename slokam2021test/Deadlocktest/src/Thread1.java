
public class Thread1 extends Thread {
private Data1 data1;
Thread1(Data1 data1)
{
	this.data1=data1;
}
@Override
	public void run() {
		 data1.test1();
	}
}
