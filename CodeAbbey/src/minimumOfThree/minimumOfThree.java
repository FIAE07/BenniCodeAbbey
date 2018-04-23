package minimumOfThree;

import java.util.Scanner;


/********************************************************************/

class tripleArray  {
	
	int [] values = new int[3];
	
	public int[] setValues()  {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++)  {
			System.out.println("Wert " + (i+1) + ": ");
			values[i] = scan.nextInt();
		}
		scan.close();
		return values;
	}
	
		
	public int getMin()  {
		int min = values[0];
		if (min > values[1])  {
			min = values[1];
		}
		if (min > values[2])  {
			min = values[2];
		}
		return min;
	}
	
}

/********************************************************************/

public class minimumOfThree {

	public static void main(String[] args) {
		int mini;
		
		tripleArray a = new tripleArray();
		a.setValues();
		a.values[0] = 1;
		mini = a.getMin();
		
		
		System.out.println("Minimum = " + mini);
		

	}

}
