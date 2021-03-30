package programs;

public class RevSecondWord {

	public static void main(String[] args) {
		String s = "she is a beautiful lady i have ever met";
		String[] s1 = s.split(" ");
		int n = s1.length;
		for(int i=0;i<n;i++) {
			if(i%2==0)
			System.out.print(" "+s1[i]+" ");
			else {
			String s2 = s1[i];	
			int n1 = s2.length();
			for(int j=n1-1;j>=0;j--) {
				System.out.print(s2.charAt(j));
			}
			}
		}
	}

}
