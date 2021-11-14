package march8;

import javax.xml.bind.annotation.XmlElement;

public class person {
private char initial;
private String name;
private int id;
private int age;
private address add;
@XmlElement(name="initial")
public char getInitial() {
	return initial;
}
public void setInitial(char initial) {
	this.initial = initial;
}@XmlElement(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}@XmlElement(name="id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}@XmlElement(name="age")
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}@XmlElement(name="add")
public address getAdd() {
	return add;
}
public void setAdd(address add) {
	this.add = add;
}
}
