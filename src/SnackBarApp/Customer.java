package SnackBarApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	//mutators

	public double addCash(double cash)
	{
		return cashOnHand += cash;
	}


	public double buySnack(double cost)
	{
		 return cashOnHand -= cost;
	}
}











