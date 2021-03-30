package practising;

public class ReverseAlternateWordInString {
	public static void main(String[] args) {
		String s="I vl become auto eng";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
			if(i%2==0) {
			for(int j=word.length()-1;j>=0;j--) {
			System.out.print(word.charAt(j));
			}
			}
			else
				System.out.print(" "+s1[i]+" ");
		
		
		}

	}

}

