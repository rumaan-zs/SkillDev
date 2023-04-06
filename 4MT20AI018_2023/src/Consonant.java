
public class Consonant 
{

	public static void main(String[] args) throws java.io.IOException
	{
		char ch;
		ch=(char)System.in.read();
//		System.out.println("aeiouAEIOU".contains(""+ch)?"VOWEL":"NOT Vowel");
//		System.out.println("QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm".contains(""+ch)?"CONSONANT":"NOT Consonant");
		System.out.println(Character.isLetter(ch) && !"aeiouAEIOU".contains(""+ch)?"Consonant":"NOT Consonant");
	}

}