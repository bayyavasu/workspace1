package xmllisttojava;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


public class pmain {
	public static void main(String[] args) {
	
		try
		{
			JAXBContext context=JAXBContext.newInstance(listtt.class);
			Unmarshaller um=context.createUnmarshaller();
		listtt p= (listtt) um.unmarshal(new File("D:\\pplist.xml"));
		ArrayList<products> al=p.getAlp();
			
				for(int i=0;i<al.size();i++)
				{
									products p1=al.get(i);
				
									System.out.println(p1.getId());
					
				}
			
			/*
			 * System.out.println(p.getCategory()); System.out.println(p.getColor());
			 * System.out.println(p.getId()); System.out.println(p.getName());
			 * System.out.println(p.getPrice());
			 */}catch(Exception e)
		{
			
		}
	}
}