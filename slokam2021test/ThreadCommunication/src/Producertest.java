
public class Producertest  extends Thread{
private Bucket bucket;
Producertest(Bucket bucket)
{
	this.bucket=bucket;
}
@Override
public void run() {
	for(int i=1;i<=100;i++) {
		bucket.producerwork(i);
	}
}

}
