package layer;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="students")
public class students {
private ArrayList<student> list;
@XmlElement(name="student")
public ArrayList<student> getList() {
	return list;
}

public void setList(ArrayList<student> list) {
	this.list = list;
}
}
