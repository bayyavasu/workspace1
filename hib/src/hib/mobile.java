package hib;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class mobile {
private int mid;
private String msim;
private int mnumber;
private person per;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="fkpid")
public person getPer() {
	return per;
}
public void setPer(person per) {
	this.per = per;
}
@Id
@GeneratedValue
@Column(name="mid")
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}@Column(name="msim")
public String getMsim() {
	return msim;
}
public void setMsim(String msim) {
	this.msim = msim;
}@Column(name="mnumber")
public int getMnumber() {
	return mnumber;
}
public void setMnumber(int mnumber) {
	this.mnumber = mnumber;
}
}
