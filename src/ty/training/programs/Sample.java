package ty.training.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sample {

	public static void main(String[] args) {
		String s1="Likhitha is a good girl is a good";
		String s2="";
		String[] s = s1.split(" ");
	 LinkedHashSet<String> l=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) 
			l.add(s[i]);
		for (String ch : l) {
			/*int count=0;
			for (int j = 0; j < s.length; j++) {
				if(ch==s[j]) {
					count++;
				}
			}
			if(count==1)
				System.out.println(ch+" "+count);
		}*/
		System.out.print(ch+" ");
		}
	}	
	}


