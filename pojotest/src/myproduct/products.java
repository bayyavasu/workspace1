package myproduct;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class products {
private ArrayList<product>  products;
@XmlElement(name="product")
public ArrayList<product> getProducts() {
	return products;
}

public void setProducts(ArrayList<product> products) {
	this.products = products;
}
}
