package immutablestring;

public class Stringbuffereg {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello ");
		StringBuilder sb1=new StringBuilder("Welcome ");
		sb.append("Java");
		sb1.append("World");
		System.out.println(sb);
		System.out.println(sb1);
	}

}
