
public class a1 {
public static void main(String[] args) {
	int a[]=new int[10];
	a[0]=1;  a[1]=1;    a[2]=1;   	a[3]=1;    a[4]=1;
	a[5]=1;  a[6]=1;    a[7]=1;     a[8]=1;    a[9]=1;
	 
	int i,temp=a[0];
	for(i=0;i<10;i++)
{
     if(i%2==0)
                  a[i]=a[i]*2;
     else
                  a[i]=a[i]*3;
}     
	for(i=0;i<10;i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}

