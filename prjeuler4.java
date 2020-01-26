package project_euler;

public class q4 
{

	public static void main(String[] args) 
	{
		int prod,mprod=0,rev=0,rem,p;
		for(int i=1;i<1000;i++)
		{
			for(int j=999;j>=1;j--)
			{
				prod=i*j;
				p=prod;
				while(prod!=0)
				{
					rem=prod%10;
					rev=rev*10+rem;
					prod=prod/10;
				}
				if(rev==p)
				{
					if(mprod<rev)
					{
						mprod=rev;
					}
				}
				
				rev=0;
			}
		}
		System.out.println("Largest pallindrome product: "+mprod);
	}

}
