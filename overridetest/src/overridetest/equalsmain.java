package overridetest;

public class equalsmain {
public static void main(String[] args) {
	student std1=new student();
	std1.setId(1);
	std1.setName("vsu");
	std1.setNumber(9989);
	student std2=new student();
	std2.setId(1);
	std2.setName("vasu");
	std2.setNumber(9989);
	System.out.println(std1.equals(std2));
}
}
