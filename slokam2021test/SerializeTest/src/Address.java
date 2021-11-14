
public class Address {
private Integer id;
private String city;
private Long pin;

@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", pin=" + pin + "]";
}
public Address(Integer id, String city, Long pin) {
	super();
	this.id = id;
	this.city = city;
	this.pin = pin;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Long getPin() {
	return pin;
}
public void setPin(Long pin) {
	this.pin = pin;
}
}
