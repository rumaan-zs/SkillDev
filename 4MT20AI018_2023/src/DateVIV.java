import java.util.StringTokenizer;
import java.util.Scanner;

public class DateVIV {

	public static void main(String[] args) 
	{
		String sdate = new java.util.Scanner(System.in).nextLine();
		StringTokenizer st = new StringTokenizer(sdate,"-/,");
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int yy = Integer.parseInt(st.nextToken());
		boolean valid=true;
		if(dd>31 || dd<1 ||mm>12 || mm<1)
			valid=false;
		else
		{
			switch(mm)
			{
			case 4: case 6: case 9: case 11:
				if(dd>30)
					valid=false;
					break;
			case 2:
				if((yy%4==0 && yy%100!=0)|| (yy%400==0))
				{
					if(dd>29)
						valid=false;
				}
				else if(dd>28) valid=false;
			}
		}
		System.out.println(valid?"Valid":"Invalid");
		int m,D,C,f,wkd;
		C=yy/100;
		if(mm>2)
		{
			m=mm-2;
			D=yy%100;
		}
		else
		{
			m=mm+10;
			D=yy%100 -1;
		}
		D=yy%100;
		f =(int)( dd+Math.floor((13*m-1)/5)+D+Math.floor(D/4)+Math.floor(C/4)-2*C);
		wkd=f%7;
		switch(wkd) 
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
//		if((yy%4==0 && yy%100!=0)|| (yy%400==0)) 
//			System.out.println("leap year");
//		else
//			System.out.println("Not leap year");
	}
	

}
