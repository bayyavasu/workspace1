                                                                                                                                                                                                                                                                                                    
public class countspecialcharacters {
public static void main(String[] args) {
	String str="hello i am from slokam hyd ?? ";
	
	int count =0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch= str.charAt(i);
		
		if(!(ch>='A' & ch<='Z'))
		{
			if(!(ch>='a' & ch<='z'))
			{
				if(!(ch>='0' & ch<='9'))
				{
					count++;
					
				}	
			}
		}
		
	}
	System.out.println(count);
			
}
}
