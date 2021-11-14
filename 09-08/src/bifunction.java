import java.util.function.BiFunction;

public class bifunction {
public static void main(String[] args) {
BiFunction<String,String,Integer> bi=(s1,s2)->{
	return Integer.parseInt(s2)+Integer.parseInt(s1);
};
BiFunction<String,String,Integer> bi1=(s1,s2)->Integer.parseInt(s2)+Integer.parseInt(s1);//single line lambbda expression

System.out.println(bi.apply("564", "65465"));
System.out.println(bi1.apply("564", "65465"));
BiFunction<String,String,Integer> bi2=new bifunction()::gg;
System.out.println(bi2.apply("564", "65465"));

}
public int gg(String s1,String s2)
{
	return Integer.parseInt(s2)+Integer.parseInt(s1);	
}
}
