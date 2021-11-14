import java.util.function.BiConsumer;
public class biconsumertest {
public static void main(String[] args) {
	BiConsumer<String,String> bc=(s1,s2)->{
		System.out.println(s1+s2);
	};
	bc.accept("vasu","vasu ");
	BiConsumer<String,String> bc2= biconsumertest ::om;
bc2.accept("vasu","vasu");

}
public static void om(String s1,String s2)
{
	System.out.println(s1+s2);
}
}
