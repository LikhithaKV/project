package ty.training.programs;

public class AddingAllTheNumbersExceptTheIterationNumber {

	public static void main(String[] args) {
		int n=12345;
		int n1=n;
		int copy=n;
		int count=0;
		int sum=0;
		while(n!=0) {
			n=n/10;
			count++;
			}
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		for (int j = 0; j < count; j++) {
			int rem=n1%10;
			if(i!=j) {
			sum=sum+rem;
			}
			n1=n1/10;
			}
		System.out.println(sum);
		sum=0;
		n1=copy;
	}
	}
	}