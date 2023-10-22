import java.io.File;
import java.io.IOException;
class createfile
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("newfile.txt");
			if(f.createNewFile())
			{
				System.out.println("file created :"+f.getName());
			}
			else
			{
				System.out.println("file already exist..");
			}
		}
		catch(IOException e)
		{
			System.out.println("error occured..");
			e.printStackTrace();
		}
	}
}