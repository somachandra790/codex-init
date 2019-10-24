package project_euler;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		long num=0;
		for(long i=1;;i++)
	   {
			c=0;
		   for(long j=1;j<=19;j++)
		   {
			   if(i%j==0)
			   {
				   c++;
			   }
			   
		   }
		   if(c==19)
		   {
			   num=i;
			   System.out.println("Smallest number divisible by 1 to 10 is "+num);
			   break;
		   }
	   }
	
	}
}