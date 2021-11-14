import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest  {
public static void main(String[] args) {
	Employee e=new Employee(1,"name1","qual1");
	Address add=new Address(1,"hyd", 5104l);
	e.setAddress(add);
	try
	{
		FileOutputStream fos=new FileOutputStream("D:\\txts\\emp.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
	
		oos.close();fos.close();
		System.out.println("done");
	}catch(Exception e1)
	{
		e1.printStackTrace();
	}
}
}
