package programs;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madama";
		String s1 = "";
		for(int j=s.length()-1;j>=0;j--) {
s1=s1+s.charAt(j);
	}
if(s.equals(s1)) 
	System.out.println("its palindrome");
else
	System.out.println("not palindrome");
}
}
