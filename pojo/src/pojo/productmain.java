package pojo;

public class productmain {
public static void main(String[] args) {
	//logiccc l=new logiccc();
	//product pp=l.getProductByid(8);
	logic2 l=new logic2();
	product pp=l.getProductsByName("product3");
	if(pp!=null)
	{
		System.out.println(pp.id);
		System.out.println(pp.name);
		System.out.println(pp.color);
		System.out.println(pp.price);
		
	}else {
		System.out.println("no match found");
	}
}
}
