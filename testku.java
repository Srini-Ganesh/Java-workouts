import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class testku
{
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=read.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the "+size+" elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=read.nextInt();
		}
		int temp=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>arr[0])
			{
				temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=1;i<size;i++)
		{
			if(arr[i]>arr[1])
			{
				temp=arr[1];
				arr[1]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("First big: "+arr[0]+"\nSecond big:"+arr[1]);
		for(int n:arr){System.out.println(n);}
	}
}