package ty.training.programs;

public class SortArrayInDescendingOrder {

	public static void main(FingWordWhichIsHavingMinLength[] args) {
		int a[]= {1,2,3,4,5};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j< a.length; j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
		
			System.out.print(a[i]+" ");
		}
}
}
