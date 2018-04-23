package minimumOfThree;

import java.util.Scanner;


/********************************************************************/

class tripleArray  {
	
	private int [] values = new int[3];
	
	// setter
	
	public void setValues(int[] a)  {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++)  {
			values[i] = a[i];
		}
		scan.close();
	}
	
	//liefere Minimum
		
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
		int[] werte = {7, 2, 3};
		
		tripleArray a = new tripleArray();
		a.setValues(werte);
		mini = a.getMin();
		
		
		System.out.println("Minimum = " + mini);
		

	}

}
