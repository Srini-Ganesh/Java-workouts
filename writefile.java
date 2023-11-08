import java.io.*;

class writefile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw=new FileWriter("newfile.txt");
			fw.write("hello ganesh");
			fw.close();
			System.out.println("written successfully..");
		}
		catch(IOException e)
		{
			System.out.print("error occured: ");
			e.printStackTrace();
		}
	}
}
