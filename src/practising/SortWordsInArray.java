package practising;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWordsInArray {

	//public static void main(String[] args) {
		public static void main(String[] args) {
			
			//String [] a = new String [7];
			//List<String> l =new ArrayList<String>();
			String s="I m longing to  become an auto eng";
			String[] s1 = s.split(" ");
			for(int i=0;i<s1.length;i++) {
				
				for(int j=i+1;j<s1.length;j++) {										
				if((s1[i].length())>(s1[j].length())) {
					String temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
					
				}
				}
				}
			for(int j=0;j<=s1.length;j++) {
				System.out.println(s1[j]);
			}
		}

	}


