import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class files 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String oldFile, newFile;
		oldFile="baker.txt"; // oldfile=in.next(); to write your own content
		FileInputStream fin=null;
		try 
		{
			fin= new FileInputStream(oldFile);
			while(true)
			{
				int ch=fin.read();
				if(ch==-1)break;
				System.out.print((char)ch);
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(oldFile +"  does not exist.");
		}
		catch (IOException ex) {}
	}

}
