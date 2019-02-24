package ClassExample;

public class Vehicle {
	String color;
	String name;
	int Speed;
	Vehicle(String color, String name, int Speed)
	{
		this.color=color; 
		this.name=name;
		this.Speed=Speed;
	}
	void run()
	{
		System.out.println(color+" "+name+" "+Speed ); 
	}
	public static void main(String[] args) {
		
		Vehicle bike = new Vehicle("Black","Honda", 220);
		Vehicle car = new Vehicle("Red","Maruti", 20);
		bike.run();
		car.run();
	}

}
