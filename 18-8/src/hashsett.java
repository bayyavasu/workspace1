import java.util.HashSet;

public class hashsett {
public static void main1(String[] args) {
	HashSet<String> set=new HashSet<>();
	set.add("vasu");
	set.add("vassu");
	set.add("vasu");
	set.add("vasu");
	for(String str:set)
	{
		System.out.println(str);
	}
}
	public static void main(String[] args) {
		
	
		HashSet<hashcode> set2=new HashSet<>();
		hashcode h=new hashcode();
		
		h.setId(1);
		h.setName("vasu");
		h.setQual("qual");
		hashcode h1=new hashcode();
		h1.setId(1144);
		h1.setName("vasu");
		h1.setQual("qual");
		set2.add(h);
		set2.add(h1);
for(hashcode s:set2) {
	System.out.println(s.getQual());
}

}
}

