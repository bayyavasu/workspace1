
public class Data2 {
private Data1 data1;

public Data1 getData1() {
	return data1;
}

public void setData1(Data1 data1) {
	this.data1 = data1;
}
synchronized public void test1() {
	for(int i=1;i<=100;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	
}
synchronized public void test2() {
	for(int i=1;i<=100;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	data1.test2();
}
}
