package myproduct;

import javax.xml.bind.annotation.XmlElement;

public class product {
private int id;
private String name;
private colorr color;//xmlwrapperelement can write instead of creating new class here
private category cat;
@XmlElement(name="id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@XmlElement(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement(name="colors")
public colorr getColor() {
	return color;
}
public void setColor(colorr color) {
	this.color = color;
}
@XmlElement(name="cat")
public category getCat() {
	return cat;
}
public void setCat(category cat) {
	this.cat = cat;
}

}
