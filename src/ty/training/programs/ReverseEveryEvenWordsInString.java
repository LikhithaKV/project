package ty.training.programs;

public class ReverseEveryEvenWordsInString {

	public static void main(java.lang.String[] args) {
      String s = "my name is raj mohan ram";
     
     
     String[] a = s.split(" ");
     for (int i = 0; i < a.length; i++) {
    	  String q = "";
    	 String word = a[i];
    	 if(i%2==0) {
    	 for (int j = word.length()-1; j>=0; j--) { 
    		 
    		 q=q+word.charAt(j);
    	 }
		a[i]=q;
    	 }
    		 else {
    		 a[i]=word;
    		 }
    		 }
     for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+" ");	
		}
	}

}
