import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

	@XmlRootElement
class student
{
	private int id;
	private String name;
	private int age;
	private int marks;
	@XmlElement(name="sid")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}@XmlElement(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}@XmlElement(name="age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}@XmlElement(name="marks")
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
