package ty.training.programs;

public class AddingTwoArraysWithSameLengthOrDifferentLengthUsingTryCatch {

	public static void main(String [] args) {
		int a[]= {1,2,3};
		int b[]= {3,2,8,6,7,8};
		int count=a.length;
		if(b.length>count) {
			count=b.length;
		}
		int sum[]=new int[count];
		for (int i = 0; i < count; i++) {
           try {
        	   sum[i]=a[i]+b[i];
		} catch (Exception e) {
			try {
				sum[i]=a[i];
			} catch (Exception e2) {
				sum[i]=b[i];
			}
		}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(sum[i]+" ");
		}
	}
}
