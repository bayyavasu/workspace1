package sortings;

public class selection {
public static void main(String[] args) {
	int a[]= {50,20,5,3,4,9};
	int least=a[0],temp;
	
	int k=0,l;
	for( int j=0;j<5;j++)
	{
	 
	 int s=a[j];
	for(int i=j+1;i<6;i++) {
		if(s>a[i])
		{
			s=a[i];
			k=i;
		}	
	}
	System.out.println(a[k]);
	if(a[j]>a[k])
	{
	temp=a[k];
	a[k]=a[j];
	a[j]=temp;
	}	
}
	for(int j=0;j<6;j++) 
	{
		System.out.print(a[j]+" ");
	}
	}
}

