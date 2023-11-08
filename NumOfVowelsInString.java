import java.util.*;
import java.io.*;
import java.time.*;
import java.sql.*;
class NumOfVowelsInString
{
	static public int countVowels(String s)
	{
		int count=0;
		for(char ch:s.toCharArray())
		{
			ch=Character.toLowerCase(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=read.nextLine();
		System.out.println("There are "+countVowels(str)+" vowels in the string "+str);
	}
}