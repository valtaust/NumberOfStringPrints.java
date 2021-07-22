package ie.gmit.dip;

//Program here decrements as expected
//could also change i to ++ and sysout i instead to increment i++ inside line 20.

import java.util.Scanner;

public class DecrementProgram {

	static Scanner sc = new Scanner(System.in);
	static int input = Integer.valueOf(sc.nextInt());

	public static void main(String[] args) {
		System.out.print("hello is this part working. ");
		System.out.println("If so print yes");

		int i = 0;
		while (i < input) {
			input--;
			System.out.println(input);
		}
	}
}
