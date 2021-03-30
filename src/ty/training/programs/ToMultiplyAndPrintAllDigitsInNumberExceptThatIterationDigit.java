package ty.training.programs;

public class ToMultiplyAndPrintAllDigitsInNumberExceptThatIterationDigit {

	public static void main(String[] args) {
	int num=5436;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}

		for (int i = 1; i <= count; i++) {
			int fact=1;
			for (int j = 1; j <= count; j++) {
				if(i!=j) 
					fact=fact*j;
				}
			System.out.println(fact);
				}
		
			
		}

	}
