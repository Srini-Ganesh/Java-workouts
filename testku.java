import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class testku
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
	public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans=new ArrayList<>();
        for(String word:words)
        {
            String[] arr=word.split(String.valueOf(separator),1);
			System.out.println(arr.length);
            for(String w:arr)
            {
                ans.add(w);
            }
        }
        return ans;
    }
}