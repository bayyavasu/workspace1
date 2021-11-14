package feb10;

public class stringtest {
public static void main(String[] args) {
	String ss=new String("   welcome to slokam   ");
	char c=ss.charAt(1);
	System.out.println(c);
	System.out.println(ss.length());
	System.out.println(ss.substring(4));
	System.out.println(ss.substring(5, 10));
	System.out.println(ss.indexOf('c'));
	System.out.println(ss.indexOf("come to"));
	System.out.println(ss.indexOf('s', 0));
	System.out.println(ss.indexOf("come",0));
	System.out.println(ss.trim());

}
}
