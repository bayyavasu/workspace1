import java.util.function.BiConsumer;

public class biconsumer {
public static void main(String[] args) {
	 BiConsumer<String,String> b=(s1,s2)->{
		System.out.println(s1+s2); 
	 };
	 b.accept("ghftfc","ytd");
	 BiConsumer<String,String> bb=biconsumer :: ourmethod;
	 bb.accept("sdi", "iskhd");
}
public static void ourmethod(String s,String s2)
{
	System.out.println(s+s2);
}
}
