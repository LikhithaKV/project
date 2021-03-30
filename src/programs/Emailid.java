package programs;

public class Emailid {

	public static void main(String[] args) {
		String s = "reachlikhitha@gmail.com123";
		int alpha=0,num=0,sp=0;
		for(int j=0;j<s.length();j++) {
			if(Character.isAlphabetic(s.charAt(j))) 
				alpha++;
			else if(Character.isDigit(s.charAt(j))) 
				num++;
			else
				sp++;
		
	}
System.out.println(alpha+" "+num+" "+sp);
}}
