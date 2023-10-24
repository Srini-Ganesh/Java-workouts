import java.util.*;
class check
{
	public static int numberOfCharacter(String s,char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c || s.charAt(i)==Character.toUpperCase(c))
				count++;
		}
		return count;
	}
}
class NumOfGivenCharInGivenString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine();
		System.out.print("Enter a character to check:");
		String strch = sc.nextLine();
		char ch = strch.charAt(0);
		int count = check.numberOfCharacter(str,ch);
		System.out.println("There are "+count+" \'"+ch+"\' in "+str);
	}
}
		
		
