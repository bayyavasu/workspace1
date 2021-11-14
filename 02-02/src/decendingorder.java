
public class decendingorder {
		public static void main(String[] args) {
			int a[]= {89,67,48,36,12,6};//ascending order
			
			 
			int i,j,temp;
			for(i=0;i<5;i++)
			{
				for(j=i+1;j<6;j++)///a[i]>a[i+1] one iteration
				{
					if(a[i]<a[j])
					{
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
					
			}
			for(i=0;i<6;i++)
			{
		System.out.println(a[i]);	
			}
		}
		}


