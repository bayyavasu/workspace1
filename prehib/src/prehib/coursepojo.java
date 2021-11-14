package prehib;

import java.util.ArrayList;

public class coursepojo {
private int cid;
private String name;
private int duration;
private ArrayList<personpojo> pcpojo;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public ArrayList<personpojo> getPcpojo() {
	return pcpojo;
}
public void setPcpojo(ArrayList<personpojo> pcpojo) {
	this.pcpojo = pcpojo;
}


}
