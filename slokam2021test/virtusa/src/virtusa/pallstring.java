package virtusa;

public class pallstring {
public static void main(String[] args) {
	String str="madam";
	String pall="";
	char c;
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.println(i);
		c=str.charAt(i);
		pall=pall+c;
	}
	System.out.println(pall);
	if(str.equals(pall))
	{
		System.out.println("it is pallindrome");
	}
}
}