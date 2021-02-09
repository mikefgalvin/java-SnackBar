package SnackBarApp;

public class Main
{
	private static void workWithData()
	{
		System.out.println("Step 1 is setup correctly");

		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");
		VendingMachine vm3 = new VendingMachine("Office");
// 			(String name, int quantity, double cost, int machineId)
		Snack s1 = new Snack("Chips", 36, 1.75, 1); // check this 
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1); 
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1); 
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2); 

		//MVP
		System.out.println();

		double jane1 = c1.getCashOnHand() - s4.buySnack(3);
		System.out.println(c1.getName() + " " + "cash on hand: $" + jane1);
		System.out.println("Quantity of soda: " + s4.getQuantity());

		 // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
 		// 	Print Customer 1 (Jane) Cash on hand.
 		// 	Print quantity of snack 3 (Pretzel).
 		System.out.println();

		double jane2 = jane1 - s3.buySnack(1);
		System.out.println(c1.getName() + " " + "cash on hand: $" + jane2);
		System.out.println("Quantity of pretzels: " + s3.getQuantity());

		 // Customer 2 (Bob) buys 2 of snack 4 (Soda).
 		// 	Print Customer 2 (Bob) Cash on Hand.
 		// 	Print quantity of snack 4 (Soda).
 		System.out.println();

 		double bob1 = c2.getCashOnHand() - s4.buySnack(2);
 		System.out.println(c2.getName() + " " + "cash on hand: $" + bob1);
		System.out.println("Quantity of soda: " + s4.getQuantity());

		// Customer 1 (Jane) finds $10.
 	// 		Print Customer 1 (Jane) Cash on Hand.
		System.out.println();

		double jane3 = jane2 + 10;
		System.out.println(c1.getName() + " " + "cash on hand: $" + jane3); //91 - x

	// 	 Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
 // 		Print Customer 1 (Jane) Cash on Hand.
 // 		Print quantity of snack 2 (Chocolate Bar).
		System.out.println();

		double jane4 = jane3 - s2.buySnack(1);
		System.out.println(c1.getName() + " " + "cash on hand: $" + jane4);
		System.out.println("Quantity of chocolate: " + s2.getQuantity());

 // 	Add 12 more items to snack 3 (Pretzel).
 // 		Print quantity of snack 3 (Pretzel).
		System.out.println();

		double snackAdd1 = s3.getQuantity() + 12;
		System.out.println("Quantity of pretzels: " + snackAdd1); //70 - x 53 - x

 // 	Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
 // 		Print Customer 2 (Bob) Cash on hand.
 // 		Print quantity of snack 3 (Pretzel).
		System.out.println();

		double bob2 = bob1 - s3.buySnack(3);
		double snackAdd2 = snackAdd1 - 3;
		System.out.println(c2.getName() + " " + "cash on hand: $" + bob2);
		System.out.println("Quantity of pretzel: " + snackAdd2);

	}

	public static void main (String[] args)
	{
		workWithData();
	}
}