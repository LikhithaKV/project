package ty.training.programs;

import java.util.LinkedHashSet;

public class ToPrintNoOfOccuranceOfEachWordInAString {

		public static void main(String [] args) {
			String s="welcome to india mandya to mandya";
			int count1=0;
			String[] ch = s.split(" ");
			LinkedHashSet<String> set=new LinkedHashSet<String>();
			for (int i = 0; i < ch.length; i++) {
				set.add(ch[i]);
			}
			for (  String s1: set) {
				int count=0;
				for (int i = 0; i < ch.length; i++) {
					if(s1.equals(ch[i])) {
						count++;
			}
				}
				System.out.println(count+" "+s1);
				
				}
			}
	
	}


