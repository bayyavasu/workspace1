package virtusa;

public class highestinarray {
public static void main(String[] args) {
	int a[]= {1,9,7,3,4,55,74,2};
	int b=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>b)
		{
			b=a[i];
		}
	}
	System.out.println(b);
	
	
}
}
