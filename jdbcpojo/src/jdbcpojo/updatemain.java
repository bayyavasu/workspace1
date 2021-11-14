package jdbcpojo;

public class updatemain {
public static void main(String[] args) {
	person p =new person();
	p.setCourse("jdbc");
	p.setId(1);
	dao d=new dao();
	d.update(p);
}
}
