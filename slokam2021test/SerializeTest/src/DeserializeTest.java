import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTest {
public static void main(String[] args) {
	try
	{
	FileInputStream fis=new FileInputStream("D:\\txts\\emp.ser");
	ObjectInputStream oos=new ObjectInputStream(fis);
	Employee emp=(Employee)oos.readObject();
	System.out.println(emp);
	System.out.println(emp.getAddress());
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
