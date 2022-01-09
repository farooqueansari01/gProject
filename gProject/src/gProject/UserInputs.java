package gProject;

import java.io.*;
import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) throws IOException {
		//Using Scanner Class object
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
        double d = scan.nextDouble();
		//Using Buffered Reader Class Object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
