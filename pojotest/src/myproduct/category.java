package myproduct;

import javax.xml.bind.annotation.XmlElement;

public class category {
private String catname;
private int catcode;
@XmlElement(name="categoryname")
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}@XmlElement(name="categorycode")
public int getCatcode() {
	return catcode;
}
public void setCatcode(int catcode) {
	this.catcode = catcode;
}

}
