//Program to demonstrate DataInputStream
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
public class demodataipstream {

	public static void main(String[] args) {
		FileInputStream file = null;
		DataInputStream dis = null;
		String fileName = new java.util.Scanner(System.in).nextLine();
		try 
		{
			file = new FileInputStream(fileName);
			dis=new DataInputStream(file);
			while(true) 
			{
				try 
				{
					System.out.println("Student Name :"+dis.readUTF());
					System.out.println("Student ID   :"+dis.readInt());
					System.out.println("CGPA         :"+dis.readDouble());
				}
				catch(EOFException ex)
				{
					break;
				}
				catch(IOException ex)
				{
					System.out.println("Error:"+ex.getMessage());
				}
			}
			dis.close();
			file.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(fileName+" does not exist !");
		}
		catch(IOException ex)
		{
			System.out.println("Error:" +ex.getMessage());
		}

	}

}
