package ClassExample;

public class Circle 

{
	static double radius=1.0;
	static String color = "red";
	double res;
	
	Circle (double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	double getRadius(double radius)
	{
//		this.radius = radius;
		return radius;
		
	}
	
	void SetRadius(double radius)
	{
		this.radius = radius;
	}
	
	String getColor(String color)
	{
//	this.color = color;
	return color;
	}
	
	void  SetColor(String color)
	{
		this.color = color;
	}
	
	void display()
	{
		System.out.println("Radius of the circle is "+radius);
		System.out.println("Color of the circle is "+color);
	}
	
	public double getArea(double radius)
	{
	
		double res = 3.14 * (radius * radius);
		return res;	
		
	}
	public static void main(String[] args) {
		
		Circle c1 = new Circle(radius,color);
		c1.SetRadius(radius);
		c1.getRadius(radius);
		c1.SetColor(color);
		c1.getColor(color);
		c1.display();
		c1.res = c1.getArea(radius);
	    System.out.println("Area of the circle is "+c1.res);
		System.out.println();
		
	    Circle c2 = new Circle(radius,color);
	    c2.SetRadius(4);
		c2.display();
		c2.res =c2.getArea(radius);
		System.out.println("Area of the circle is "+c2.res);
		System.out.println();
		
		Circle c3 = new Circle(radius,color);
		c3.SetRadius(5);
		System.out.println(radius);
		c3.SetColor("black");
		c3.display();
		c3.res =c3.getArea(radius);
		System.out.println("Area of the circle is "+c3.res);		

	}

}
