package march8;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class personmain {
	public static void main(String[] args) {
		ArrayList<person> per=new ArrayList<>();
	
address add1=new address();
add1.setDoorNo("66-484");
add1.setStreet("street1");
add1.setPincode(438765436);
add1.setDist("dist1");
add1.setState("state1");
person p1=new person();
p1.setInitial('A');
p1.setName("name1");
p1.setId(33);
p1.setAdd(add1);
                         per.add(p1);
address add2=new address();
add2.setDoorNo("22-484");
add2.setStreet("street2");
add2.setPincode(98845);
add2.setDist("dist2");
add2.setState("state2");
person p2=new person();
p2.setInitial('B');
p2.setName("name2");
p2.setId(77);
p2.setAdd(add2);
per.add(p2);
Persons persons=new Persons();
persons.setPersons(per);
try
{
	JAXBContext context = JAXBContext.newInstance(Persons.class); 
	Marshaller marshaller = context.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	marshaller.marshal(persons, new File("D:\\persons.xml"));
	

}catch(Exception e)
{
	
}



}
}
