package p1;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,5,7,1,3,9};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
