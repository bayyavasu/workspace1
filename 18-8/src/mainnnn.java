import java.time.LocalDate;

public class mainnnn {
public static void main(String[] args) {
	hashcode h=new hashcode();
	
	h.setId(1);
	h.setName("vasu");
	h.setQual("qual");
	hashcode h1=new hashcode();
	h1.setId(1144);
	h1.setName("vasu");
	h1.setQual("qual");
	System.out.println(h.hashCode() );
	System.out.println(h1.hashCode() );
	String s1=new String("vasu");
	String s2=new String("mani");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	LocalDate l1=LocalDate.of(2020, 11, 12);
	LocalDate l2=LocalDate.of(2020, 11, 12);
	System.out.println(l1.hashCode() );
	System.out.println(l2.hashCode() );

}

}
