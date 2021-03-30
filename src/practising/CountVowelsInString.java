package practising;

public class CountVowelsInString {

	public static void main(String[] args) {
		String s="likhithaeououi";
		int a=0,e=0,i=0,o=0,u=0;
		char[] n = s.toCharArray();
		for(int j=0;j<n.length;j++) {
			if(n[j]=='a')
				a++;
			else if(n[j]=='e')
				e++;
			else if(n[j]=='i')
				i++;
			else if(n[j]=='o')
				o++;
			else if(n[j]=='u')
				u++;
			
		}
		System.out.println("a count is "+a);
		System.out.println("e count is "+e);
		System.out.println("i count is "+i);
		System.out.println("o count is "+o);
		System.out.println("u count is "+u);

	}

}
