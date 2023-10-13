import java.util.*;
class PowerOfTwo
{
	public static void main(String args[])
	{
		Scanner read =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =read.nextInt();
		int n=num;
		//divided the num untill no longer divided by two
		while(num%2==0)
		{
			num/=2;
		}
		// 1 means it completly divided by two
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
