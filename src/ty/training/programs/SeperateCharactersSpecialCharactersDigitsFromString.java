package ty.training.programs;

public class SeperateCharactersSpecialCharactersDigitsFromString {

	public static void main(String[] args) {
		String s="reachlik1hith3a@gmai4l.com5";
		String alpha="";
		String num="";
		String spe="";
		char[] ch = s.toCharArray();
		for (int j = 0; j < ch.length; j++) {
		
		if(ch[j]>='A' && ch[j]<='z') {
			alpha=alpha+ch[j];
		}
		else if(ch[j]>='0' && ch[j]<='9') {
			
			System.out.println(ch[j]);
			num=num+ch[j];
		}
		else
			spe=spe+ch[j];
		}
		
		System.out.println("alphabets are ------"+alpha);
		System.out.println("numbers are ------"+num);
		System.out.println("special characters are ------"+spe);
			
		}

	}


