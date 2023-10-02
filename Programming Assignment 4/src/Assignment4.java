//This program creates an array of 50 characters and invokes a search method to find a certain character in the array
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		
		//declare and initialize array of 50 characters
		char[] charArray = new char[50];
		
		//generate and display random lower case alphabetic characters for the array using a loop
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
			if ( (i + 1) % 10 == 0)
			System.out.println(charArray[i]);
			else
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a lowercase letter to lookup: ");
		char c = input.next().charAt(0);
		while (c > 'z' || c < 'a') {
			System.out.println("Invalid input: '" + c + "' is not a lower case letter\n\n" );
			System.out.print("Enter a lowercase letter to lookup: ");
			c = input.next().charAt(0);
		}
		
		//invoke search method to determine if the character is in the array
		int arrayPosition = search(c, charArray);
		if (arrayPosition == -1)
		System.out.println("Character '" + c + "' is not in the array");
		else
		System.out.println("Character '" + c + "' is in the array at position " + arrayPosition);
	}
	
	//search method determines if character is in the array by using a loop
	public static int search(char c, char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c)
			return i;
		}
		return -1;
	}

}
