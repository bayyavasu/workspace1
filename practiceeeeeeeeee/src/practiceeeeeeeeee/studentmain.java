package practiceeeeeeeeee;

public class studentmain {
	public static void main(String[] args) {
student std1 =new student();
std1.setId(1);
std1.setName("vasu");
std1.setNumber(11234);
student std=std1;
student std2=new student();
std2.setId(1);
std2.setName("vasu");
std2.setNumber(11234);
System.out.println(std1.equals(std2));
System.out.println(std1.equals(std));

}}
