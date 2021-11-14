
public class Student {
	int id;
Student(int id,String name,int sub1,int sub2,int sub3,int sub4,int sub5)
	{
	this.id=id;
		System.out.println(id);
		int total=sub1+sub2+sub3+sub4+sub5;
		double avg=total/5;
		float  a=((float)total)/375;
		float percentage=a*100;
		System.out.println(percentage);
	}

	}
class another
{
public static void main(String[] args) {
	Student s1=new 	Student(505,"vasu",50,29,71,65,45);
	System.out.println(s1.id);
}
}
