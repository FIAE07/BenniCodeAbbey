package maximumOfArray;

import java.util.Scanner;

public class maximumOfArray {

		
	public static void main(String[] args) {
		 
		int anzahl, min, max;
		Scanner scan = new Scanner(System.in);
		
		// Eingabe
		 
		 System.out.println("Wie viele Zahlen?");
		 anzahl = scan.nextInt();
		 int[] feld = new int[anzahl];
		 
		 		 
		 for (int i = 0; i < anzahl; i++)  {
			 System.out.println("Wert " + (i + 1) + ":");
			 feld[i] = scan.nextInt();
		 }
		 
		 scan.close();
		 
		 // find min + max
		 
		 min = feld[0];
		 max = feld[0];
		 
		 for (int i = 0; i < anzahl; i++)  {
			 if (min > feld[i])  {
				 min = feld[i];
			 }
			 if (max < feld[i])  {
				 max = feld[i];
			 }
		 }
		 
		 // Ausgabe
		 System.out.println("Min: " + min);
		 System.out.println("Max: " + max);
	}

}
