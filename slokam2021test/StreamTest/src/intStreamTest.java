import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class intStreamTest {
public  void intstream()
{
	List<Integer> list=new ArrayList<>();
	IntStream is=IntStream.range(1, 21);
	is.forEach(p->list.add(p));
	list.forEach(p->System.out.print(p));
}
}
