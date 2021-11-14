package student12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileDao {
	public static ArrayList<student> getpassedstudents(int mark) {
		student std = null;
		ArrayList<student> stdlist = new ArrayList<>();
		try {
			FileReader fr = new FileReader("D:\\students12.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
		
					String aa[] = line.split(",");
					if (Integer.parseInt(aa[3]) > mark) {
						std = new student();
						std.setId(Integer.parseInt(aa[0]));
						std.setName(aa[1]);
						std.setCourse(aa[2]);
						std.setMarks(Integer.parseInt(aa[3]));

						stdlist.add(std);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return stdlist;
	}
}
