
public class Account {
private long actNumber;
private String bankName;
private String branch;
private Mobile mobile;
public Mobile getMobile() {
	return mobile;
}
public void setMobile(Mobile mobile) {
	this.mobile = mobile;
}
Account(Integer actNumber,String bankName,String branch,Mobile mobile)
{
	super();
this.actNumber=	actNumber;
this.bankName=bankName;
this.branch=branch;
this.mobile=mobile;
}
public long getActNumber() {
	return actNumber;
}
public void setActNumber(long actNumber) {
	this.actNumber = actNumber;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Account [actNumber=" + actNumber + ", bankName=" + bankName + ", branch=" + branch + ", mobile=" + mobile
			+ "]";
}

}
