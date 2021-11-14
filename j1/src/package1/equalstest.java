package package1;

public class equalstest {
	public static void main(String[] args)
	{
		A b=new B();
		
	
		C c=new C();
		
		student s=new student();
		s.setname("vasu");
		s.setId(1);
		s.setqual("yes");
		student s1=new student();
		s1.setname("vasu");
		s1.setId(1);
		s1.setqual("yes");
				
			System.out.println(s.equals(s1));	
	}

}
class A
{
	void mtd1()
	{
		System.out.println("yes");
	}
}
class B extends A
{

	void mtd1()
	{
		System.out.println("yes");
	}
}
class C
{
	private int idd;
	public void set()
	{
	this.idd=idd;
	
	System.out.println(idd);
	}
}
class student
{
	private int id;
	private String name;
	private String qual;
	public int getid()
	{
		return id;
	}
	
	public void setId(int id)
	{
		id=id;
		
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		
		name=name;
	}
	public String getqual()
	{
		return qual;
	}
	public void setqual(String qual)
	{
		this.id=id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		return true;
	}
	
}

