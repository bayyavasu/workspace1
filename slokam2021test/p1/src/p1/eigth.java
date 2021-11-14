
package p1;

public class eigth {
public static void main(String[] args) {
	int a[]= {4,5,1,9,2};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
		if(a[i]>a[j])
	{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
	}
	}
}
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	
	}
}
}
