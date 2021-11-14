package functional;

public class callspecificmethod implements Aone,Atwo{

	
	@Override
	public void defone() {
		
		Atwo.super.defone();
	}

	public static void main(String[] args) {
		Aone a=new callspecificmethod();
		a.defone();
	}

	@Override
	public int abttwo() {
				return 0;
	}

	@Override
	public int abtone() {
				return 0;
	}

}
