import java.util.function.Function;

public class function {
public static void main(String[] args) {
	Function<String,Integer>  f=function :: f1;
	System.out.println(f.apply("324151"));
}

public static int  f1(String s)
{
	Integer a=Integer.parseInt(s); return a;
}
public static void main1(String[] args) {
	
	Function<String,Integer>  f=(s)->{
		return Integer.parseInt(s);
	};
	
	
	int a=f.apply("6541");
System.out.println(a);
}














}
