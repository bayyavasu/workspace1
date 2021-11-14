
public class Main {
public static void main(String[] args) {
	Bucket b=new Bucket();
	Producertest p=new Producertest(b);
	Consumertest c=new Consumertest(b);
	p.start();c.start();
}
}
