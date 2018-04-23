package vowelCount;

/********************************************************************************/

class stringGeraet  {
	private String value;
	
	//setter
	
	public void setValue (String str)  {
		value = str;
	}
	
	//getter
	
	public String getValue()  {
		return value;
	}
	
	//Zählmethode
	
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
		String b = "hfaiuwehiu";
		
		stringGeraet a = new stringGeraet();
		a.setValue(b);
		System.out.println("Anzahl der Vokale: " + a.vowelCount());
		
		
		}
		
		
	}


