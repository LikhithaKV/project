package ty.training.programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInGivenString {

	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] a = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (String string : set) {
			System.out.print(string+" ");
			
		}

	}

}
