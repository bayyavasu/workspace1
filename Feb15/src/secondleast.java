
public class secondleast {

	int a[]= {5,8,2,4,6,1};
	int l=0,k;
	
     void aa()
	{
    	  int count=0;
		for(int i=0;i<	a.length;i++)
		{
			if(count==1)
			{
				for(int b=0;b<a.length;b++)
				{
					if(a[b]!=l && a[i]!=l)
					{
				if(a[i]>a[b])
				{
					a[i]=a[b];
					 k=a[b];
				}
				}
				}
					System.out.println("Second least is  =  "+k);
			break;	
			}	
			
			
			for(int j=0;j<a.length;j++)
			{
			if(a[i]>a[j]) {
				a[i]=a[j];
			  l=a[j];
			  
		       }
		
			}  
			count++;

		}			
	}
	}

