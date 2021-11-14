
public class Consumertest extends Thread {
	private Bucket bucket;
	Consumertest(Bucket bucket)
	{
		this.bucket=bucket;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			bucket.consumerwork();
		}
	}
}
