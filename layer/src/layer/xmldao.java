package layer;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class xmldao {
	public static ArrayList<student> getStudent(int startMarks, int endMarks, String qual) throws ApplicationException {
		System.out.println("xml dao started");
		ArrayList<student> xmlstd = new ArrayList<>();
		try
		{
			
		
		JAXBContext context = JAXBContext.newInstance(students.class);
		Unmarshaller um = context.createUnmarshaller();
		students s = (students) um.unmarshal(new File("D:\\slokam\\layer\\Testxml.xml"));
		
		ArrayList<student> ss = s.getList();
		for (int i = 0; i < ss.size(); i++) {
			student std = ss.get(i);
			// int m = std.getMarks();
			if (std.getMarks() > startMarks && std.getMarks() < endMarks && std.getQual().equals(qual)) {
				xmlstd.add(std);
			}
		}
		}catch(Exception e)
		{
			//e.printStackTrace();
			throw new ApplicationException("exception in xml dao",e);
			
		}
		System.out.println("xml dao ended");
		return xmlstd;
	}
}
