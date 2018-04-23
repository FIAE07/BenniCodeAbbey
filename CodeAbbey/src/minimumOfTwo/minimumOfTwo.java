package minimumOfTwo;

import java.util.Scanner;

public class minimumOfTwo {

	public static void main(String[] args) {
		
		int anz;
		int[] arr1, arr2, arrMin;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("input data: ");
		anz = scan.nextInt();
		
		//Init
		arr1 = new int[anz];
		arr2 = new int[anz];
		arrMin = new int[anz];
		
		//Eingabe
		
		for (int i = 0; i < anz; i++)  {
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}
		
		for (int i = 0; i < anz; i++)  {
			if (arr1[i] < arr2[i])  {
				arrMin[i] = arr1[i];
			} else {
				arrMin[i] = arr2[i];
			}
			
		}
		scan.close();
		
		//Ausgabe
		System.out.println("answer:");
		
		for (int i = 0; i < anz; i++)  {
			System.out.print(arrMin[i] + " ");
		}
		
	}

}
