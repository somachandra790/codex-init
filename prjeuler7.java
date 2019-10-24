package project_euler;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0,p=0;
		for(long i=2;;i++)
		{
			c=0;
			for(long j=2;j<=i;j++)
			{
				
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==1)
			{
				p++;
			}
			if(p==10001)
			{
				System.out.println("Number is "+i);
				break;
			}
		}
		
		}
}
					
					
					