//This program calculates the annual raise for the next 4 years
import java.util.Scanner;
public class Assignment3 {

	//create main method
	public static void main(String[] args) {
		
		//create scanner object and declare a variable to hold the salary
		Scanner input = new Scanner(System.in);
		double salary;
		
		//use nested loops to calculate annual raise for the next 4 years
		do {
		System.out.print("Enter a salary: ");
		salary = input.nextLong();
		if (salary != 0) {
		for (int rate = 3; rate < 6; rate++) {
			System.out.println("Raise rate: " + rate + "%");
			double raise = salary * ((0.01 * rate) + 1) - salary;
			double salary1 = salary;
			for (int year = 1; year <= 4; year++) {
				salary1 += salary1 * (0.01 * rate);
				System.out.print("\tYear: " + year + ", Raise: $");
				System.out.printf("%5.2f", raise);
				System.out.print(", Salary: $");
				System.out.printf("%5.2f", salary1);
				System.out.println("");
				if (rate == 5 && year == 4)
					System.out.print("\n");
				raise += raise * ((0.01 * rate) + 1) - raise;
		}
		}
		}
	}
	while (salary != 0);
	System.out.println("\nGood bye!");
	}
}