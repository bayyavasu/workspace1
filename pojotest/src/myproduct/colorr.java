package myproduct;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class colorr {     //xmlwrapperelement can write instead of creating new class here
	private ArrayList<String>  col;
@XmlElement(name="color")
	public ArrayList<String> getCol() {
		return col;
	}

	public void setCol(ArrayList<String> col) {
		this.col = col;
	}
}
