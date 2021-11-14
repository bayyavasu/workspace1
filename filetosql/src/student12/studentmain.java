package student12;

import java.util.ArrayList;


public class studentmain {
	public static void main(String[] args) {
		ArrayList<student> std=FileDao.getpassedstudents(35);
		DBDao.savestudents(std);
System.out.println("updated");
	}
}
