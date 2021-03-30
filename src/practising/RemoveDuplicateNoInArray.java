package practising;

public class RemoveDuplicateNoInArray {

	public static void main(String[] args) {
		int [] a= {1,3,5,2,4,6,5,7,2};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=0;
					}
				}
			}
		}
		for(int q=0;q<a.length;q++) {
			if(a[q]!=0) 
				System.out.println(a[q]);
	}
	}
}
