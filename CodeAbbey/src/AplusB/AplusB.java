package AplusB;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
	System.out.println("input data: ");
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	int sum = a + b;
	System.out.println("answer: " + sum);
    scan.close();
	}

}
