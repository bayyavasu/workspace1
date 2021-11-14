
public class Data1 {
private Data2 data2;

public Data2 getData2() {
	return data2;
}

public void setData2(Data2 data2) {
	this.data2 = data2;
}
synchronized public void test1() {
	for(int i=1;i<=100;i++) {
		System.out.println(Thread.currentThread().getName());
		data2.test1();
	}
	
}
synchronized public void test2() {
	for(int i=1;i<=100;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	
}
}
