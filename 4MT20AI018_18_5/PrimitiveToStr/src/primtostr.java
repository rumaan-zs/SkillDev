import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
public class primtostr 
{
	public static void main(String[] args) 
	{
		String fileName;
		FileOutputStream fout = null;
		DataOutputStream dos = null;
		Scanner in = new Scanner(System.in);
		try 
		{
			String name;
			int id;
			double cgpa;
			System.out.println("Enter the filename : ");
			fileName=in.next();
			fout=new FileOutputStream(fileName,true);
			dos = new DataOutputStream(fout);
			System.out.println("Student ID : ");
			id = in.nextInt();
			System.out.println("Student Name : ");
			name=in.nextLine();
			name=in.nextLine();
			System.out.println("CGPA");
			cgpa = in.nextDouble();
			dos.writeUTF(name);
			dos.writeInt(id);
			dos.writeDouble(cgpa);
			dos.close();
			fout.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error:"+ ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("Error:"+ ex.getMessage());
		}

	}

}
