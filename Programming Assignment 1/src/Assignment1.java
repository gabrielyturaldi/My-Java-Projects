// This program computes the cost to paint a room
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the room in feet: ");
		int length = input.nextInt();
		System.out.print("Enter width of the room in feet: ");
		int width = input.nextInt();
		int totalCost = ((width * 2) + (length * 2)) * 6 * 9;
		System.out.print("Cost of job for " + length + " by " + width + " room is $" + totalCost);
	}

}
