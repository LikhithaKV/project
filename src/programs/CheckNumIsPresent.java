package programs;

public class CheckNumIsPresent {

	public static void main(String[] args) {
		boolean flag=false;
		int n = 12345678;
		int no = 49;
		int copy =0;
		while(n!=0) {
			int rem = n%100 ;
			if(rem==no)
			flag = true;	
				
			n=n/10;
		}
		if(flag)
			System.out.println("no is present");
		else
			System.out.println("no is not present");
	}

}
