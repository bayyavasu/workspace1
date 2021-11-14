package finalobjecttest;

public class Main {
public static void main(String[] args) {
	final Product p=new Product(1, "vasu", 54);
	 Product pp=p.setId(2);//5.
	 Product p1=new Product(3, "mani", 36);
	 
	 //1.String is aa immutable(cannot be changed) object
	 //we can modify the String using '+'
	 //2.whenever we modify the String the modified string will store in new object
	 //3.this new object should be taken in another reference.
	 //4.here the product also acts same as String
	 //when we want to update the properties in product then it has to store in new reference
	
	//String s=new String("nn");//
	String s="vasu";                            //1.
	s=s+"dev";
	 System.out.println(s);                                            //String s=s.concat("vv"); ==>it gives error because String cannot be modified 
	                                             //we have to store the String in another variable
	String str=s.concat("dev");       //2==>s.concat("vv")    
	                             //3===>String str=s.concat("vv"); 
	System.out.println(s);
	System.out.println(str);
}
}
