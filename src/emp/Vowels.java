package emp;

public class Vowels {
	
	private void vowelsCon() {
		String s="engine";
		int Vcount=0;
		int Ccount=0;
		for (int i = 0; i < s.length(); i++) {//0<5,1|1<5,2|2<5,3|3<5,4|4<5,5|5<5
			char c = s.charAt(i);
			if((c == 'a'|| c == 'e'|| c == 'i' ||c == 'o' ||c == 'u'))
		{
			Vcount++;
			
		}
			else if(c >= 'a' && c<='z')
			{
				Ccount++;
			}
			
		}
		System.out.println("Vowels count: " +Vcount);
		System.out.println("Consonant count: " +Ccount);
		

	}
	public static void main(String[] args) {
		Vowels v = new Vowels();
		v.vowelsCon();
	}

}
