package project_euler;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,sum1=0,prod,diff=0,sums;
		for(int i=1;i<=100;i++)
		{
			prod=i*i;
			sum=sum+prod;
		}
		for(int i=1;i<=100;i++)
		{
			sum1=sum1+i;
		}
		sums=sum1*sum1;
		diff=sums-sum;
		System.out.println("Difference is "+diff);
	}
}
					
					
					