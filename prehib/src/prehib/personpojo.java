package prehib;

import java.util.ArrayList;

public class personpojo {
private int id;
private String name;
private int age;
private adharpojo adhar;
private ArrayList<mobilepojo> mob;
private ArrayList<coursepojo> cou;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public adharpojo getAdhar() {
	return adhar;
}
public void setAdhar(adharpojo adhar) {
	this.adhar = adhar;
}
public ArrayList<mobilepojo> getMob() {
	return mob;
}
public void setMob(ArrayList<mobilepojo> mob) {
	this.mob = mob;
}
public ArrayList<coursepojo> getCou() {
	return cou;
}
public void setCou(ArrayList<coursepojo> cou) {
	this.cou = cou;
}



}
