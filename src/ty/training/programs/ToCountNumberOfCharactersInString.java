package ty.training.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ToCountNumberOfCharactersInString {

	public static void main(FingWordWhichIsHavingMinLength[] args) {
		String s="likhitha";
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
			System.out.println(count+" "+character);
			
		}
			
		}
	}

