package overridetest;

public class student {
	private int id;
	private int number;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj==null)
	{
		return false;
	}
	if(!(obj instanceof student))
			{
		return false;
			}
	student std2=(student)obj;
	if(!(this.getId() == std2.getId())) {
		return false;
	}
	if(!(this.getName().equals(std2.getName()))) {
		return false;
	}
if(!(this.getNumber() == std2.getNumber())) {
	return false;
}
	return true;
}
}