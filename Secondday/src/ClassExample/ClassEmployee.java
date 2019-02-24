package ClassExample;

public class ClassEmployee {
int id;
String name;
void eat()
{
	System.out.println("I am eating");
}

ClassEmployee(){
	System.out.println("I am in a method");
}

public static void main (String[] args)
{
	System.out.println("I am studying");
	ClassEmployee e= new ClassEmployee();
	e.id = 100;
	e.name = "Besant";
	System.out.println(e.id);
	System.out.println(e.name);
	e.eat();
	
}
}
