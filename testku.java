import java.util.*;
class powerOfTwo
{
	public static void main(String args[])
	{
		Scanner read =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =read.nextInt();
		int n=num;
		while(num%2==0)
		{
			num/=2;
		}
		if(num==1)
		{
			System.out.println(n+" is a power of 2.");
		}
		else
		{
			System.out.println(n+" is not power of 2.");
		}
	}
}
