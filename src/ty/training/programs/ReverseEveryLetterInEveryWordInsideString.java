package ty.training.programs;

public class ReverseEveryLetterInEveryWordInsideString {
	public static void main(java.lang.String[] args) {
	      String s = "my name is raj mohan ram";
	      String newString="";
	     
	     String[] a = s.split(" ");
	     for (int i = 0; i < a.length; i++) {
	    	  String q = "";
	    	 for (int j = a[i].length()-1; j>=0; j--) { 
	    		 
	    		 q=q+a[i].charAt(j);
	    	 }
	    	 //newString=newString+q+" ";
	    	 a[i]=q;
	     }
			//System.out.print(newString);
	     for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+" ");	
		}
}
}
