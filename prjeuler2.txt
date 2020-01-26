package project_euler;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long i,n,a=1,b=2,sum=0,sum1=0,tot;
		n=sc.nextLong();
				while(a<4000000)
				{
				if(a%2==0)
				{
					sum=sum+a;
				}
				else if(b%2==0)
					{
					sum1=sum1+b;
					}
				System.out.print(a+" "+b+" ");
				a=a+b;
				b=a+b;
				
			}
			tot=sum+sum1;
			System.out.println("");
			System.out.println("Sum of even fibonacci series is"+sum+"+"+sum1+"="+tot);

	}

}
