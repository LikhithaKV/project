package practising;

public class removeDuplicateCharInString {
	public static void main(String[] args) {
		String s="likhitha";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=0;
					}
				}
			}
		}
		for(int q=0;q<a.length;q++) {
			if(a[q]!=0) 
				System.out.print(a[q]);
	}
	}
}


