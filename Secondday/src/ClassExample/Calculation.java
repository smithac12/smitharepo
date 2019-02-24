package ClassExample;
public class Calculation 
{
int a;
int b;
int res;

public void sum(int a, int b)
{
	int c = a+b;
	System.out.println("Result is "+c);
}

public int add(int a, int b)
{
	int res= a+b;
	return res;
	
}

	public static void main(String[] args)
	{
      Calculation cal = new Calculation();	
      cal.sum(10,20);
      cal.res= cal.add(330, 450);
      System.out.println("Result is "+cal.res);
	}

}
