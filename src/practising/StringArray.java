package practising;

public class StringArray {

	public static void main(String[] args) {
		String s="I vl become auto eng";
		String s2 = s.toLowerCase();
		String[] s1 = s2.split(" ");
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
	
			if(word.charAt(0)=='a')
			System.out.print(s1[i]+" ");
			else if(word.charAt(0)=='e')
			System.out.print(word+" ");
			else if(word.charAt(0)=='i')
			System.out.print(s1[i]+" ");
			else if(word.charAt(0)=='o')
			System.out.print(s1[i]+" ");
			else if(word.charAt(0)=='u')
			System.out.print(s1[i]+" ");
			
			
			
		}

	}

}
