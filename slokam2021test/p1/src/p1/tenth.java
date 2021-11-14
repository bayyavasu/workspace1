package p1;

public class tenth {
public static void main(String[] args) {
	String str="hello i am from slokam tech hyderabad";
	int count=0,h;
            String s[]=str.split(" ");
            for(int i=0;i<s.length;i++)
            { 
            	count++;
            	if(count==2)
            	{
            		System.out.print(s[1]);
            	}
            	String a=s[i];
            	if(a.length()>1)
            	{
            	for(int j=0;j<a.length();j++)//9765
            	{
            		if(j==1)
            		{
            		int b=a.charAt(j);
            		
            			int c=b-32;
            			char ch=(char)c;
                		System.out.print(ch);
                		}
            		if(j!=1)
            		{
            		System.out.print(a.charAt(j));
            		}
            		
            	}
            	}
            	
       System.out.print(" ");
            }
}
}
