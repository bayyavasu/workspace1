import java.util.stream.Stream;

public class streamm {
public static void main(String[] args) {
	Stream<Integer> s=Stream.of(1,5,8,8,7,4,4,2,1,63,2);
	//System.out.println(s.count());                       //count method
	//System.out.println(s.distinct().count());            //distinct method
	 s=s.filter((i)->{                                     //filter method returns boolean
		if(i%2 !=0)
			return true;
		else return false;
	});
	 s=s.map((i)->{                                          //map returns boolean
		return  i*i;
	 });
	 s.forEach((i)->{                                        //foreach
		System.out.println(i); 
	 });
}
}
