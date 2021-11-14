package finalobjecttest;

public class Product {
private Integer id;
private String name;
private Integer price;
public Product(Integer id, String name, Integer price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public Integer getId() {
	return id;
}
public Product setId(Integer id) {
	return new Product(id,this.name,this.price);
}
public String getName() {
	return name;
}
public Product setName(String name) {
	return new Product(this.id,name,this.price);
}
public Integer getPrice() {
	return price;
}
public Product setPrice(Integer price) {
	return new Product(this.id,this.name,price);
}

}
