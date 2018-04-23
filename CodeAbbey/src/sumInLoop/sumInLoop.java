package sumInLoop;

import java.util.Scanner;

public class sumInLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anz, sum;
		
		System.out.println("input data: ");
		
		sum = 0;
		anz = scan.nextInt();
		
		int[] arr = new int[anz];
		
		
		
		for (int i = 0; i < anz; i++)  {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		scan.close();
		System.out.println("answer: " + sum);
	}

}
