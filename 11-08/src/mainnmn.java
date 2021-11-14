import java.util.stream.Stream;

public class mainnmn {
public static void main(String[] args) {
	ss1  a=new ss1(1,"aaaaa",19);
	ss1  b=new ss1(2,"bbbbb",26);
	ss1  c=new ss1(3,"ccccc",27);
	ss1  d=new ss1(4,"ddddd",28);
	ss1  e=new ss1(5,"eeeee",29);
	ss1  f=new ss1(6,"fffff",30);
	ss1  g=new ss1(7,"ggggg",31);
	Stream<ss1> st=Stream.of(a,b,c,d,e,f,g);
	st.map((i)->{
		if(i.getAge()>10 && i.getAge()<31) {
		i.setEli(true);
	}
		return i;}).forEach((i)->{
		System.out.println(i.getAge()+"::"+i.getId()+"::"+i.getName()+"::"+i.isEli());
	});
	
	
}
}
