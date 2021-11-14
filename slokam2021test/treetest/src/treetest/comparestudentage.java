package treetest;

import java.util.Comparator;

public class comparestudentage implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.getAge().compareTo(o2.getAge());
	}

}
