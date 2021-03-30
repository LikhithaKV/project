package programs;

public class RecRevString {
	
	static void rev(String s) {
		if(s.length()<=1)
		
			System.out.println(s);
		else {
			System.out.print(s.substring(s.length()-1));
			rev(s.substring(0, s.length()-1));
		}
	}

	public static void main(String[] args) {
		String s="likhitha";
		rev(s);

	}

}
