package techproed;

import java.util.Scanner;

public class NameOfWeekDays {

	public static void main(String[] args) {
       Scanner num=new Scanner(System.in);
     do {
		
       System.out.println("Enter one number");
       int dayNum=num.nextInt();
       switch (dayNum) {
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
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Invalid input");
		break;
	}
     } while (true);
	}

}
