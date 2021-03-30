package practising;

public class RemoveDuplicateStringInArray {
	public static void main(String[] args) {
		String [] a= {"hi","hello","hi","love","love","ur","life","ur"};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=null) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i].equals(a[j])) {
						a[j]=null;
					}
				}
			}
		}
		for(int q=0;q<a.length;q++) {
			if(a[q]!=null) 
				System.out.print(a[q]+" ");
	}
	}
}


