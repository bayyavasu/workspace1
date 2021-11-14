package xmltest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class xmltestt {
	 public static void main(String[] args) {
			
		  Student student = new Student();
		  student.setId(1);
		  student.setName("Hello");
		  student.setAge(22);
		  student.setMarks(4343);
		  FileWriter fw=null;
		  BufferedWriter bw=null;
		  try {
			  File f=new File("d:\\student.txt");
			  f.createNewFile();
	StringWriter sw=new StringWriter();		  
			  JAXBContext context = JAXBContext.newInstance(Student.class);
			  Marshaller marshaller = context.createMarshaller();
				 marshaller.marshal(student,f);
			// marshaller.marshal(student,fw);
				 System.out.println(sw.toString());
				 
	
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	

}
