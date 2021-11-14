package feb10;

public class howmanya {
public static void main(String[] args) {
int count=0;
	String str=new String("slokam tech");
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)=='a')
	{
		count++;
	}
	}
	System.out.println(count);
}
}
