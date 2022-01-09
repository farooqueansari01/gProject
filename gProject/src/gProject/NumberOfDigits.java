package gProject;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digits = 0, r;
		while(n > 0) {
			r = n % 10;
			digits += 1;
			n = n / 10;
		}
		System.out.println("Number of digits are: "+digits);
	}
}
