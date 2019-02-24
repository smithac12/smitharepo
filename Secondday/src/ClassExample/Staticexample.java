package ClassExample;

public class Staticexample {
int a;
static int b;

 static void run()
{
	int c;
	int d;
//	System.out.println(a);
	System.out.println(b);
}
	public static void main(String[] args) {
		
Staticexample.run();
Staticexample st = new Staticexample();
st.run();
System.out.println(st);
	}

}
