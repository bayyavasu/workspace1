
public class DirectAccessToInterface {
	void printgreet()
	{
		System.out.println("Directly Accessed");
	}
	void addition(String a,String b)
	{
		System.out.println(a);
	}
	static void addition1(String a,String b)
	{
		System.out.println(a);
	}
	DirectAccessToInterface()
	{
		System.out.println("contructor");
	}
public static void main(String[] args) {
	RefInterface ri=new RefImpl();
	//ri.print();        //===>old approach
	
	
	//DirectAccessToInterface  dao1=new DirectAccessToInterface();
	//RefInterface inter=dao::printgreet;
	//inter.print();
	
	
	DirectAccessToInterface  dao2=new DirectAccessToInterface();
   // RefInterface inter=dao2::addition;
	//inter.add("sccccc", "dcdsc");
	
	System.out.println("=========static test==============");
	//DirectAccessToInterface  dao3=new DirectAccessToInterface();
	 //RefInterface inter1=DirectAccessToInterface::addition1;
	 //inter1.three("vasu", "ae");
	 
	 System.out.println("======constructor=========");
	 RefInterface inter2=DirectAccessToInterface::new;
	 inter2.printmessage();

	 
}
}
