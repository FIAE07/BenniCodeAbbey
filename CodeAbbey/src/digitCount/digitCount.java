package digitCount;

import java.util.Scanner;


class prime  {
	private int zahl;
	
	public int querSumme ()  {
		int  rest, vorne;
				
		rest = 0;
		vorne = zahl;
		
		while (vorne != 0)  {
			rest += (vorne % 10);
			vorne /= 10;
			}
		
		return rest;
	}
	
	
	public void setValue (int ziffern)  {
		if (ziffern >= 0)  {
			zahl = ziffern;
		} else {
			System.out.println("Zahl kleiner Null");	
		}
}

}



public class digitCount {

	public static void main(String[] args) {
		// int anz;
		
		Scanner scan = new Scanner(System.in);
		
		prime quer = new prime();
		
		// System.out.println("Wie oft?");
		// anz = scan.nextInt();
		
		System.out.println("Zahl: ");
		quer.setValue(scan.nextInt());
		System.out.println("Quersumme: " + quer.querSumme());
		scan.close();
		

	}

}
