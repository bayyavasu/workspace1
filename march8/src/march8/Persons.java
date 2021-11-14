package march8;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Persons {
private ArrayList<person> persons=new ArrayList<>();
@XmlElement(name="person")
public ArrayList<person> getPersons() {
	return persons;
}

public void setPersons(ArrayList<person> persons) {
	this.persons = persons;
}

}
