package two;

public class Stringstest {
public static void main(String[] args) {
	char c=65;
	//System.out.println(c);
	String str="va;su;i;sa;go;od,bo;y";//0->length()-1
	//System.out.println(str.length());
	//System.out.println(str.charAt(18));
	//System.out.println(str.indexOf('a'));
	//System.out.println(str.lastIndexOf('a'));
	//System.out.println(str.substring(5, 15));
	//System.out.println(str.indexOf('g', 1));
	//System.out.println(str.lastIndexOf("good"));
	//System.out.println(str.substring(3));
	System.out.println(str.toUpperCase());
	String[] aa=str.split(";");
	for (String string : aa) {
		System.out.println(string);
	}
	for(int i=0;i<aa.length;i++)
	{
//		System.out.println(aa[i]);
		
	}
	
}
}
