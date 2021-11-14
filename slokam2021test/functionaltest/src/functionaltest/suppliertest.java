package functionaltest;

import java.util.function.Supplier;

public class suppliertest implements Supplier<Integer>{

	@Override
	public Integer get() {
		int a=5;
		return a;
	}
	public static void main(String[] args) {
		
	
	Supplier<Integer> c=new suppliertest();
	System.out.println(c.get());
	Supplier<Integer>  s=()->
	{
		int a=55; 
	return a;
	};
	System.out.println(s.get());
	}
	
	}

