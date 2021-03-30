package ty.training.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SumOfNumbersShouldEqualTo7 {

	public static void main(String [] args) {
		int ch[]= {2,3,5,6,1,4,1,9,6,8,7,0,10,-3,-1};
		LinkedHashSet <Integer>set=new LinkedHashSet<Integer>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		 
		 /*int count=0;
		 int a[]=new int[set.size()]
		 for (int val : a) {
			a[count]=val;
			count++;*/
		
		  
		 
		ArrayList<Integer> l=new ArrayList<Integer>(set);
		/*for (Integer in : set) {
			l.add(in);
		}*/
      System.out.println(l);
		for (int i = 0; i < l.size()-1; i++) {
			for (int j = i+1; j < set.size(); j++) {
			//if(l.get(i)<=7) {
			 if(l.get(i)+l.get(j)==7) {
				 System.out.println(l.get(i)+" "+l.get(j));
					
				}
			}
		}
	}
	}

