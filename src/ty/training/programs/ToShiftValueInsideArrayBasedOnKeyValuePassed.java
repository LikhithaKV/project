package ty.training.programs;

public class ToShiftValueInsideArrayBasedOnKeyValuePassed {

	public static void main(String [] args) {
		int a[]= {10,20,30,40,50};
		int key=2;
		for (int i = 0; i<key ; i++) { //outer for loop for key value,if key=1, iterate once, if key=2, iterate twice
			for (int j = 0; j < a.length-1; j++) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
		}
		}
	
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
	}
}


