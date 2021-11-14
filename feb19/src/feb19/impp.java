package feb19;

import java.util.ArrayList;

public class impp {
public static void main(String[] args) {
//	studentnamebasedonId o=new studentnamebasedonId();
//	String name1=o.getNameById(5);
//	System.out.println(name1);
	namesofsamemarks o1=new namesofsamemarks();
	ArrayList<String> name=o1.getNamesBymarks(49);
		
		 for(int i=0;i<name.size();i++)
		 {
			 System.out.print(name.get(i)); 
			 }
		 
	
}
}
