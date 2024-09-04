package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		
		boolean xyup = x < y;
		boolean yzup = y < z;
		boolean ascending = (xyup && yzup);
		// System.out.println(ascending);
		
		boolean xydown = x > y;
		boolean yzdown = y > z;
		boolean descending = (xydown && yzdown);
		
		boolean isOrdered = (ascending || descending);
		
		System.out.println("Are the numbers in order? " + isOrdered);
		
		

	}

}
