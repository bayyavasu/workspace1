import java.io.Serializable;
public class serializablestude implements Serializable{
private int id;
private String name;
private String qual;
private int marks;
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
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}
