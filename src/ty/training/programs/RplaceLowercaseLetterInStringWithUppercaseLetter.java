package ty.training.programs;

public class RplaceLowercaseLetterInStringWithUppercaseLetter {

	public static void main(String[] args) {
		String s="Indiindindia";
		String n="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'i') {
			//char d=	(char)(s.charAt(i)-32);
			
			//n=n+d;
			
			String s1 = (c+"").toUpperCase();
			char c1=(char) s1;
			s.replace(c, );
			}
			/*else
				n=n+s.charAt(i);
		  
		}*/
			//for (int i = 0; i < s.length(); i++) {
		System.out.println(s);	
		}
	}
	}


