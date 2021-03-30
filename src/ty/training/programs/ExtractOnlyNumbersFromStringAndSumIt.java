package ty.training.programs;

public class ExtractOnlyNumbersFromStringAndSumIt {

	public static void main(String[] args) {
		String s="abc!@1234main";
		int sum=0;
		char[] ch = s.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			
			 if(ch[j]>='0' && ch[j]<='9') {
				System.out.println(ch[j]);
				int n = ch[j]-48;//ascii value of 0 starts form 48 to 57
				sum=sum+n;
	}
		}
		System.out.println(sum);
	}
}

