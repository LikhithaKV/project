package ty.training.programs;


public class ConvertEveryFirstLetterOfTheWordToUpperCase {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String d = a[i].substring(0, 1).toUpperCase()+a[i].substring(1);	
		    System.out.print(d+" ");	
	}}
}

