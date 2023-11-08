import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class RemoveDuplicatesInArray
{
	public static int[] removeDuplicate(int[] arr)
	{
		LinkedHashSet<Integer> lset=new LinkedHashSet<>();
		for(int n:arr)
		{
			lset.add(n);
		}
		int[] ans=new int[lset.size()];
		int i=0;
		for(int n:lset)
		{
			ans[i]=n;
			i++;
		}
		return ans;
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
		System.out.print("\nOriginal array: ");for(int n:arr){System.out.print(n+" ,");}
		int[] duplicate_removed=removeDuplicate(arr);
		System.out.print("\n\nDuplicate removed array: ");for(int n:duplicate_removed){System.out.print(n+" ,");}
		if(arr.length==duplicate_removed.length)
		{
			System.out.println("\n\n\t...There is no duplicate...");
			
		}
	}
}