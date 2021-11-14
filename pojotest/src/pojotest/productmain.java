package pojotest;

import java.util.ArrayList;

public class productmain {
public static void main(String[] args) {
	logic2 l2=new logic2();
	ArrayList<product> aa=l2.getAllProductsBynamestartswith("v");
	if(aa!=null)
	{
		for(int i=0;i<aa.size();i++)
		{
			product p=aa.get(i);
			System.out.print(p.id+" ");
			System.out.print(p.name+ " ");
			System.out.print(p.color+ " ");
			System.out.print(p.price+ " ");
			System.out.println();
		}
		
		
	}else {
		System.out.println("no match found");
	}
}
}
