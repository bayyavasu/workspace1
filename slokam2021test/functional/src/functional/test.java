package functional;

public class test implements Aone,Atwo {

	@Override
	public int abttwo() {
		
		return 0;
	}

	@Override
	public int abtone() {
		
		return 0;
	}public static void main(String[] args) {
	Atwo a =new test();
	a.deftwo();
	Atwo.statwo();
	Aone aone=()->{
		int a1=5;
		return a1;
	};
	System.out.println(aone.abtone());
	
	}

}
