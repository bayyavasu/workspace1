
public class Employee {
private Integer id;
private String name;
private Integer age;
private Account account;
private double empSal;
private String gender; 
public Account getAccount() {
	return account;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setAccount(Account account) {
	this.account = account;
}
Employee(Integer id,String name,Integer age,Account account,double empsal,String gender)
{
	super();
	this.age=age;
	this.id=id;
	this.name=name;
	this.account=account;
	this.empSal=empsal;
	this.gender=gender;
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
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public double getEmpSal() {
	return empSal;
}

public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", account=" + account + ", empSal=" + empSal
			+ ", gender=" + gender + "]";
}


}
