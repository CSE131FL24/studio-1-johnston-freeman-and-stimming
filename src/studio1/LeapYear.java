package studio1;
import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What year would you like to see if it is a leap year or not?  ");
		int year = in.nextInt();
		double four = (year%4);
		boolean divFour = (four == 0);
		//System.out.println(divFour);
		double hundo = (year%100);
		boolean divHundred = (hundo != 0);
		//System.out.println(divHundred);
		double fourHundo = (year%400);
		boolean divFH = (fourHundo == 0);
		
		boolean leapYear = (divFour && (divHundred || divFH));
		System.out.print(year + " is a leap year: " + leapYear);


	/*    It is evenly divisible by four

    It is not evenly divisible by 100

    An exception to this rule is if the year is evenly divisble by 400. These years are leap years. */

	
	
	
	}

}
