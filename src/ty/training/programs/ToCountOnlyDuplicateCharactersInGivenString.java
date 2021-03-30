package ty.training.programs;

import java.util.LinkedHashSet;

public class ToCountOnlyDuplicateCharactersInGivenString {

	public static void main(String [] args) {
		String s="likhithtaa";
		int count1=0;
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for ( Character character: set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(character==ch[i]) {
					count++;
		}
			}
			//System.out.println(count+" "+character);
			if(count>1) {
				count1++;
			}
		}
		System.out.println(count1);
}
}
