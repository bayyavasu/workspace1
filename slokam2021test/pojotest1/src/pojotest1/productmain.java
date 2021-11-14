package pojotest1;

import java.util.ArrayList;

public class productmain {
public static void main(String[] args) {
	logic l1=new logic();
	ArrayList<product> alp=l1.productByCategory("EL");
	for(int i=0;i<alp.size();i++)
	{
		product p=alp.get(i);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getColor());
		System.out.println(p.getPrice());
		System.out.println(p.getCategory());
		System.out.println();
	}
	
}
}
