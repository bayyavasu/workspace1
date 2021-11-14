
public class Main {
public static void main(String[] args) {
		
		Data1 data1 = new Data1();
		Data2 data2 = new Data2();
		
		data1.setData2(data2);
		data2.setData1(data1);
		
		Thread1 t1 = new Thread1(data1);
		Thread2 t2 = new Thread2(data2);
		
		t1.start();
		t2.start();
		
	}
}
