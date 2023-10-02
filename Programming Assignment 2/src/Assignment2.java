//This program calculates if two lines are perpendicular
import java.util.Scanner;
public class Assignment2 {
	
	//create method
	public static void main(String[] args) {
		
		//create a scanner object and get input for line coordinates
		Scanner input = new Scanner(System.in);
		System.out.print("Enter line1 coordinates (x1, y1, x2, y2): ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		System.out.print("Enter line2 coordinates (x3, y3, x4, y4): ");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = input.nextInt();
		int y4 = input.nextInt();
		
		//Determine if the lines are perpendicular using a loop
		if ((x1 == x2 && y3 == y4) || (x3 == x4 && y1 == y2))
			System.out.println("Lines are perpendicular");
		else {
		double m1 = (y2 - y1) / (double) (x2 - x1);
		double m2 = (y4 - y3) / (double) (x4 - x3);
		if (m1 * m2 == -1)
			System.out.println("Lines are perpendicular");
		else
			System.out.println("Lines are not perpendicular");
		}
	}

}
