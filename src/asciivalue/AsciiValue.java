package asciivalue;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a character: ");
		try (Scanner sc = new Scanner(System.in)) {
			char chr = sc.next().charAt(0);

			int asciivalue = chr;

			System.out.println("ASCII value of" + chr + "is:" + asciivalue);

		}
	}

}
