package ty.training.programs;

public class FingWordWhichIsHavingMinLength {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] a = s.split(" ");
		int min = a[0].length();
		
		for (int i = 1; i < a.length; i++) {
			int len=a[i].length();
			if(min>len) {
				min=len;
			}
		}
		System.out.println(min);
			
			
			
			
	}

}
