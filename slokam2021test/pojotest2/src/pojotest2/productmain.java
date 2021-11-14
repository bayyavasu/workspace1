package pojotest2;

import java.util.ArrayList;


public class productmain {
	public static void main(String[] args) {
		logic l1=new logic();
		ArrayList<product> alp=l1.productByCategory(987,3232);
		for(int i=0;i<alp.size();i++)
		{
			product p=alp.get(i);
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.color);
			System.out.println(p.price);
			System.out.println(p.category);
			System.out.println();
		}
		
	}

}
