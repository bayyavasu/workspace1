
public class hashcode {
	private Integer id;
	private String name;
	private String qual;
	public int hashCode()// generates same hashcode when we override hashcode method
	{
		return id+name.hashCode()+qual.hashCode();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	
}
