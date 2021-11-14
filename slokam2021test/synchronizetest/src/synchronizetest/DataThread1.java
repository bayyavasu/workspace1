package synchronizetest;

public class DataThread1 extends Thread {
private Data data;
DataThread1(Data data)
{
	this.data=data;
	
}

@Override
public void run() {
data.test();	
}

}
