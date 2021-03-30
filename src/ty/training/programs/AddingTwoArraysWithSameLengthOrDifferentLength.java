package ty.training.programs;

public class AddingTwoArraysWithSameLengthOrDifferentLength {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,2,8};
		int b[]= {3,2,8};
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}
		int sum[]=new int[count];
		
		if(a.length==b.length) {
		
		for (int i = 0; i < a.length; i++) {
           sum[i]=a[i]+b[i];
           System.out.print(sum[i]+" ");
	}
		}
		
		else if(a.length > b.length) {
		for (int i = 0; i < b.length; i++) {
			sum[i]=a[i]+b[i];
	           System.out.print(sum[i]+" ");
		}
         for (int i = b.length; i < a.length; i++) {
			sum[i]=a[i];
			System.out.print(sum[i]+" ");
		}
	}

		else
			for (int i = 0; i < a.length; i++) {
				sum[i]=a[i]+b[i];
		           System.out.print(sum[i]+" ");
			}
	         for (int i = a.length; i < b.length; i++) {
				sum[i]=b[i];
				System.out.print(sum[i]+" ");
			}
		}
	
}
