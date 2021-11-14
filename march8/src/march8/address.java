package march8;

import javax.xml.bind.annotation.XmlElement;

public class address {
private String doorNo;
private String street;
private long pincode;
private String dist;
private String state;
@XmlElement(name="doorNo")
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}@XmlElement(name="doorNo")
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}@XmlElement(name="pincode")
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}@XmlElement(name="dist")
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}@XmlElement(name="state")
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
