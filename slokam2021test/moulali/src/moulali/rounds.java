package moulali;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class rounds {
	public static void main(String[] args) {
		
	method();
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	List<Integer> collect = list.stream().filter(a->a%2==0).collect(Collectors.toList());

}
	public static void method()
	{
		int[] a= {1,2,3,4,5,6};
	   for (int i : a) {
		   System.out.println(i);
		
	} 
	}
}

