
public class Mobile {
private long mobileNumber;
private String simName;
public Mobile(long mobileNumber,String simName) {
	super();
	this.mobileNumber=mobileNumber;
	this.simName=simName;
	
}
@Override
public String toString() {
	return "Mobile [mobileNumber=" + mobileNumber + ", simName=" + simName + "]";
}



}
