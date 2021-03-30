package ty.training.programs;

public class RemoveDuplicateCharactersInGivenString {

	public static void main(String[] args) {
		String s="india";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=0) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
				}	
			}
		}
			for (int j = 0; j < a.length; j++) {
				if(a[j]!=0) {
					System.out.print(a[j]);
				}
				
			}
		}

	}


