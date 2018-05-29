package digitCount;

import java.util.Scanner;


class prime  {
	private int zahl;
	
	public int querSumme ()  {
		int  rest, vorne;
				
		rest = 0;
		vorne = zahl;
		
		if (vorne >= 0)  {
			while (vorne > 0)  {
				rest += (vorne % 10);
				vorne /= 10;
			}
			return rest;	
		} else {
			System.out.println("FEHLER: Parameter kleiner als 0.");
			return 404;
			}
	}
	
	
	public void setValue (int ziffern)  {
		zahl = ziffern;
		}

	public int getValue ()  {
		return zahl;
		}
    }



public class digitCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		prime quer = new prime();
				
		System.out.println("Zahl: ");
		quer.setValue(scan.nextInt());
		System.out.println("Quersumme: " + quer.querSumme());
		scan.close();
		

	}

}
