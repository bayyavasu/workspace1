package treetest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class student implements Comparable<student> {

	private Integer id;
	private String name;
	private Integer age;
	private String Qual;

	student(int id, String name, int age, String qual) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.Qual = qual;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name=" + name + ",id=" + id + ",age=" + age + ",qual="+Qual+"]\n";
	}

	public int compareTo(student o1, student o2) {
//	return this.age.compareTo(o.getAge()); // to work change the datatyepe to Integer
		// return this.age-o.getAge();

		Map<String, Integer> hm = new HashMap<>();
hm.put("10th", 10);
hm.put("12th", 12);
hm.put("Degree", 15);
hm.put("Btech", 16);
hm.put("PG", 18);

String o1qual=o1.getQual();
String o2qual=o2.getQual();
Integer o1value=hm.get(o1qual);//Integer o1value=hm.get(o1.getqual());
if(o1value==null) o1value=0;
Integer o2value=hm.get(o2.getQual());
if(o2value==null) o2value=0;
int c=o1value.compareTo(o2value);
if(c==0)
{
c=o1.getName().compareTo(o2.getName());
if(c==0)
	c=o1.getAge().compareTo(o2.getAge());
if(c==0)
	c=o1.getId().compareTo(o2.getId());

}
		return c;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQual() {
		return Qual;
	}

	public void setQual(String qual) {
		Qual = qual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
