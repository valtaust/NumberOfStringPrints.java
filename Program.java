package ie.gmit.dip;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	static int num = Integer.valueOf(sc.nextInt());

	public static void greet(int num) {
		int i = 0;
		while (i < num) {
			System.out.println("Greetings!");
			i++;
			break;
		}
	}

	public static void main(String[] args) {
		greet(num);
		System.out.println("");
	}
}

