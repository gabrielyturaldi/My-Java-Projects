//This program calculates the area and perimeter of a triangle
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		
		//create scanner object and int variables
		Scanner input = new Scanner(System.in);
		int side1 = 1, side2 = 1, side3 = 1;
		
		//get user input and validate it using a loop
		while((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1) && side1 != 0 || side2 != 0 || side3 != 0 ) {
			System.out.print("Enter 3 line lengths: ");
			side1 = input.nextInt();
			side2 = input.nextInt();
			side3 = input.nextInt();
		
			if (side1 == 0 || side2 == 0 || side3 == 0)
				break;
			
			//invoke Triangle class methods and display output
			else if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
				Triangle sides = new Triangle(side1, side2, side3);
				System.out.print("Triangle perimeter is " + Triangle.getPerimeter() + ", area is ");
				System.out.printf("%.3f", Triangle.getArea());
				System.out.println("\n");
			}
			else
				System.out.println("Lines cannot form a triangle\n");
		}
		System.out.println("\nHastla vista!");

	}

}
//create Triangle class with 3 private fields, a constructor, and two methods
class Triangle {
	private static int a, b, c;
	
	//constructor stores triangle side lengths in the private fields
	public Triangle(int s1, int s2, int s3) {
		a = s1;
		b = s2;
		c = s3;
	}
	//getPermimeter obtains the perimeter of the triangle
	public static int getPerimeter() {
		return a + b + c;
	}
	//getArea method obtains the area of the triangle
	public static double getArea() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
}
