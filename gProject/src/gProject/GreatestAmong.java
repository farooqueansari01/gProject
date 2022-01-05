package gProject;

public class GreatestAmong {

	public static void main(String[] args) {
		//Variables
		int a = 5, b = 6, c = 7;
		
		if(a > b && a > c) {
			System.out.println("a is the gratest Number : "+a);
		}
		else if(b > a && b > c) {
			System.out.println("b is the gratest Number : "+b);
		}
		else {
			System.out.println("c is the gratest Number : "+c);
		}
	}
}
