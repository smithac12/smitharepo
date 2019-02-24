package ClassExample;

public class AccountClass {
 String id;
 String name;
 int balance = 0;
 

AccountClass(String id,String name)
{
	this.id=id;
	System.out.println(id);
	this.name=name;
	
}


AccountClass(String id,String name, int balance)
{
	this.id=id;
	this.name=name;
	this.balance=balance;
	
}

	String getId()
{
	return id;
}

    String getName()
{
	return name;
}

 int getBalance()
{
	return balance;
}

int Credit(int amount)
{
//	System.out.println(balance);
//	System.out.println(amount);
	balance = balance + amount;
//	System.out.println(balance);
	return balance;
}

int Debit(int amount)
{
	if (amount <= balance)
	{			
		balance = balance - amount;
//		System.out.println(balance);
	}
	else
	{
		System.out.println("Amount exceeded balance");
	}
	return balance;
}	

int TransferTo(AccountClass dest, int amount)
{
	if (amount <= balance)
	{	

		dest.Credit(amount);
		System.out.println(balance);
		System.out.println(id);
		System.out.println(amount);
		this.Debit(amount);
		System.out.println("Amount transferred to: "+id);
		
	}
	else
	{
		System.out.println("Amount exceeded balance");
	}
	
	
	return balance;	

}


void display()
{
System.out.println("Account Id: "+id+", Account Name: "+name+  ", Balance: "+balance);	
}
	
	public static void main(String[] args) {
		
		AccountClass Besant = new AccountClass("Besant","Besant001");
		AccountClass ABC = new AccountClass("ABC","ABC002",10000);
	//	AccountClass XYZ = new AccountClass("XYZ","XYZ003",3000);
		Besant.display();
		Besant.Debit(110);
		Besant.display();
		System.out.println();
		
		
		
		ABC.display(); 
		ABC.TransferTo(Besant,100);
		ABC.display();
		System.out.println("Balance of "+Besant.getId() +": "+Besant.getBalance());
	}

}
