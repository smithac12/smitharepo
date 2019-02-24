package stringexample;

public class StringDemo {

	public static void main(String[] args) {
	String actual =("Welcome to Selenium Webdriver world");
	String expected=("Selenium");
	boolean status2 = actual.contains(expected);
	System.out.println("status is "+status2);
	}

}
