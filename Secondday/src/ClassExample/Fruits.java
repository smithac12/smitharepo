package ClassExample;

public class Fruits 
{
String color;
String name;
String taste;

void insertvalue(String color, String name, String taste)
{
this.color=color;
this.name=name;
this.taste=taste;
}

void show()
{
	System.out.println(color+" "+name+" "+taste);
}
	public static void main(String[] args) {
		Fruits f1 = new Fruits();
		Fruits f2 = new Fruits();
		f1.insertvalue("Red", "Apple", "sweet");
		f1.show();
		f2.insertvalue("Yellow", "Orange", "tangy");
		f2.show();
}

}
