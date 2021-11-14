package practiceeeeeeeeee;

public class one {
	public static void main(String[] args) {
		int a[]= {8,9,2,4,5,6,7};
		int count=0,k=10;
		for(int i=0;i>=0;i=i+k)
		{
			if(i<a.length)
			{
			System.out.println(a[i]);
			count++;
			}
			if(i>a.length)
			{
			
				int d=a.length;
				int e=i-d;
				i=e;
				System.out.println(a[e]);
				count++;
				
			}
			if(count==a.length)
			{
				break;
			}
		}
	}

}
