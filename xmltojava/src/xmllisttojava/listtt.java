package xmllisttojava;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="products")
public class listtt {
	
private ArrayList<products> alp;
@XmlElement(name="product")
public ArrayList<products> getAlp() {
	return alp;
}

public void setAlp(ArrayList<products> alp) {
	this.alp = alp;
}
}
