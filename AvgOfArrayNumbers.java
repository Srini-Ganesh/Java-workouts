import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class AvgOfArrayNumbers
{
	public static float Avg(int[] arr)
	{
		float total=0;
		for(int n:arr)
		{
			total+=n;
		}
		return total/arr.length;
	}
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=read.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter "+(i+1)+"th number: ");
			arr[i]=read.nextInt();
		}
		System.out.println("The average of given numbers is "+Avg(arr));
	}
}