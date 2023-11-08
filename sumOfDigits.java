import java.util.*;
class test
{
	public static int sumOfDigits(int num)
	{
		int total=0;
		while(num>0)
		{
			total+=num%10;
			num=num/10;
		}
		return total;
	}
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=read.nextInt();
		System.out.print("\nSum of digits: "+sumOfDigits(num)+"\n");
	}
}
