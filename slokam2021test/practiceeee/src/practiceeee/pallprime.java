package practiceeee;
import java.util.Scanner;
public class pallprime {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	for(int i=n+1;i>0;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			int a,pall=0;
			int temp=i;
			System.out.println(temp);
			while(i>0)
			{
				a=i%10;
				pall=(pall*10)+a;
				i=i/10;
				}
			int c=pall;
			System.out.println(pall);
			if(temp==c)
			{System.out.println(temp);
				System.out.println(pall);
				break;
			}
		}
	}
	
}
}
