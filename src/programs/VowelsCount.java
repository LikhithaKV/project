package programs;

public class VowelsCount {

	public static void main(String[] args) {
		int a=0,e=0,i=0,o=0,u=0;
		String s = "Manvit loves To Eat Fruits";
		 String h = s.toLowerCase();
		for(int j=0;j<h.length();j++) {
			if(h.charAt(j)=='a') {
			a++;	
		}
			else if(h.charAt(j)=='e') {
				e++;
		}
			else if(h.charAt(j)=='i') {
				i++;
			}
				else if(h.charAt(j)=='o') {
						o++;
				}
		}
		System.out.println("a="+a+" e="+e+" i is"+i+" o="+o);
		}
	}

