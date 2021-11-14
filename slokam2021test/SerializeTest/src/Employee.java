import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

private Integer id;
private String name;
private String qual;
transient private Address address;
transient private FileInputStream fis ;
{
		try {
			fis = new FileInputStream("D:\\txts\\emp.ser");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", qual=" + qual + "]";
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(Integer id, String name, String qual) {
	super();
	this.id = id;
	this.name = name;
	this.qual = qual;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}
public void readObject(ObjectInputStream ois)
{
	try {
		ois.defaultReadObject();
		Integer id=(Integer)ois.readObject();
		String city=(String)ois.readObject();
		Long pin=(Long)ois.readObject();
		Address add=new Address(id, city, pin);
				
			this.address=add;
				
	} catch (ClassNotFoundException e) {
				e.printStackTrace();
	} catch (IOException e) {
				e.printStackTrace();
	}
	
}
public void writeObject(ObjectOutputStream oos)
{
	System.out.println("before wo");
	try {
		oos.defaultWriteObject();
		oos.writeObject(this.address.getId());
		oos.writeObject(this.address.getCity());
		oos.writeObject(this.address.getPin());
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

}
