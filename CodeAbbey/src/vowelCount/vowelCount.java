package vowelCount;

import java.util.Scanner;

/********************************************************************************/

class stringGeraet  {
	String value;
	
	public void setValue ()  {
		System.out.println("Bitte String eingeben: ");
		Scanner scan = new Scanner(System.in);
		value = scan.next();
		scan.close();
	}
	
	public String getValue()  {
		return value;
	}
	
	public int vowelCount()  {
		
		int cnt = 0;
		for (int i = 0; i < value.length(); i++)  {
			
			switch (value.charAt(i))  {
			case 'a':
				cnt += 1;
				break;
			case 'e':
				cnt += 1;
				break;
			case 'i':
				cnt += 1;
				break;
			case 'o':
				cnt += 1;
				break;
			case 'u':
				cnt += 1;
				break;
			case 'y':
			    cnt += 1;
			    break;
			}
		}
		
		
		return cnt;
	}
}


/********************************************************************************/


public class vowelCount {

	public static void main(String[] args) {
				
		stringGeraet a = new stringGeraet();
		a.setValue();
		System.out.println("Anzahl der Vokale: " + a.vowelCount());
		
		
		}
		
		
	}


