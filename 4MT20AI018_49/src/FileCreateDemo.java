import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileCreateDemo 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		FileOutputStream fout = null;
		String fileName;
		fileName=in.next();
		try
		{
			fout=new FileOutputStream(fileName);
			fout.write('A');
			String str = "you are software Engineers";
			fout.write(str.getBytes());
			fout.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("FIle Creation Error!");
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
