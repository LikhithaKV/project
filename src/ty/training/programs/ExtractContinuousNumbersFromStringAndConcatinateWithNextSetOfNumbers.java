package ty.training.programs;

public class ExtractContinuousNumbersFromStringAndConcatinateWithNextSetOfNumbers {

	public static void main(String[] args) {
		String s="123ab10@y20";
		int sum=0;
		int num=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				//System.out.println(n);
				num=num*10+n;
			}
			else {
			sum=sum+num;
			 num=0;
		}
		}
		sum=sum+num;
System.out.println(num);
	}
	}

