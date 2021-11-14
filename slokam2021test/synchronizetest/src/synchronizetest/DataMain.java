package synchronizetest;

public class DataMain {
public static void main(String[] args) {
	Data d=new Data();
	DataThread1 t1=new DataThread1(d);
	t1.setName("t1111");
	DataThread1 t3=new DataThread1(d);
	t3.setName("t3333");
	
	
	
	DataThread2 t2=new DataThread2();
	t2.setName("t2222");
	DataThread2 t4=new DataThread2();
	t4.setName("t4444");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
