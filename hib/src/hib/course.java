package hib;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class course {
private int cid;
private String cname;
private int duration;
private person perc;


@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="percourse")
@JoinColumn(name="fkcid")
public person getPerc() {
	return perc;
}
public void setPerc(person perc) {
	this.perc = perc;
}@Id
@GeneratedValue
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
}
