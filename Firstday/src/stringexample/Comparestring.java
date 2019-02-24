package stringexample;

public class Comparestring {

	public static void main(String[] args) {
		String S1="Besant";
		String S2="Besant";
		int l = S1.length();
		boolean status=S1.equals(S2);
		boolean status1=S1.equalsIgnoreCase(S2);
		boolean status3=S1==S2;
		String S3= new String("Besant");
		
		System.out.println(status);
		System.out.println(l);
		System.out.println(status1);
		System.out.println(status3);
		System.out.println(S3==S1);
		System.out.println(S1.equals(S3));
	}

}
