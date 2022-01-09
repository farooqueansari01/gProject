package gProject;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double d = Math.sqrt(n);
		
		System.out.println(((Math.ceil(d)) == Math.floor(d))? "Perfect square Number" : " Not a perfect square Number");

	}
}
