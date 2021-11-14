
public class Thread2 extends Thread{
private Data2 data2;

Thread2(Data2 data2)
{
	this.data2=data2;
}
@Override
public void run() {
	data2.test2();
}
}
