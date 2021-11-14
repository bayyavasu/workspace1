package layer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class filedao {

	public static ArrayList<student> getStudent(int startMarks, int endMarks, String qual) throws ApplicationException {
		System.out.println("filedao start");
		BufferedReader br = null;
		ArrayList<student> filestd = new ArrayList<>();

		try
		{
				FileReader fr = new FileReader("D:\\slokam\\laye\\Student.txt");
		br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			line = line.trim();
			if (line.length() > 0) {
				student std = new student();
				String aa[] = line.split(",");
				int m = Integer.parseInt(aa[4]);
				if (m > startMarks && m < endMarks && aa[3].equals(qual)) {
					std.setId(Integer.parseInt(aa[0]));
					std.setName(aa[1]);
					std.setAge(Integer.parseInt(aa[2]));
					std.setQual(aa[3]);
					std.setMarks(Integer.parseInt(aa[4]));

					filestd.add(std);
				}
			}
		}
		}catch(FileNotFoundException e)
		{
			//e.printStackTrace();
			throw new ApplicationException("check the file",e);
			
		}catch(IOException e)
		{
		//	e.printStackTrace();
			throw new ApplicationException("check the file securities",e);
			
	
		}
		System.out.println("filedao ended");
		return filestd;

	}
}
