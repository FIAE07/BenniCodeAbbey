package sumsInLoop;

import java.util.Scanner;

public class sumsInLoop {

	public static void main(String[] args) {
		
		int anz;
		int[] arr1, arr2, arrSum;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input data: ");
		anz = scan.nextInt();
		
		arr1 = new int[anz];
		arr2 = new int[anz];
		arrSum = new int[anz];
		
		//input
		for (int i = 0; i < anz; i++)  {
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}

		//Berechnung
		for (int i = 0; i < anz; i++)  {
			arrSum[i] = arr1[i] + arr2[i];
		}
		
		//Ausgabe
		System.out.println("answer: ");
		for (int i = 0; i < anz; i++)  {
			System.out.print(arrSum[i] + " ");
		}
		scan.close();
	}
	
}
