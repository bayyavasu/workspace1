import java.util.HashSet;

public class hashsettest {
public static void main(String[] args) {
	

	hashtestwithstudent std=new hashtestwithstudent();
	std.setId(505);
    std.setName("vasu");
    std.setQual("btech");
    hashtestwithstudent s1=new hashtestwithstudent();
	s1.setId(505);
    s1.setName("tommmy");
    s1.setQual("btech");
    hashtestwithstudent s2=new hashtestwithstudent();
	s2.setId(505);
    s2.setName("vas");
    s2.setQual("btech");
    HashSet<hashtestwithstudent> hs=new HashSet<>();
   hs.add(std);
   hs.add(s1);

   hs.add(s2);
   for(hashtestwithstudent ss : hs  )
   {
	   System.out.println(ss.getId()+"::"+ss.getName());
   }

   
}

}