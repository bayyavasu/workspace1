package filetoxml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class product {
	private int id;
	private String name;
	private String color;
	private int price;
	private String category; 

	@XmlElement(name="id")
	public int getId() {
		return id;
	}

	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}

	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="color")
	public String getColor() {
		return color;
	}
    @XmlElement
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@XmlElement(name="price")
	public int getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = Integer.parseInt(price);
	}

}
