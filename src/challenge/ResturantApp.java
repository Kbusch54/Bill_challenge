package challenge;

//Create another class RestaurantApp that has a main method.

//Add a static method named pay that takes a Bill as a parameter and returns nothing. 
//In this method, call the calcTotal method of the bill and print out the result (preceded by a $).
//In the main, write a code snippet to create a Bill that has a subtotal of 15.80 
//and a tax rate of 0.06 then pass it to the pay method. (will print: $16.748)
//Write a code snippet to create a TippableBill that has a subtotal of 8.50, 
//a tax rate of 0.06, and a tip of 2.00 then pass it to the pay method. (will print: $11.01)

public class ResturantApp {

	public static void main(String[] args) {

		Bill a = new Bill(15.8, .06);
		pay(a);
		TippableBill t = new TippableBill(8.50, 0.06, 2.00);
		pay(t);
	}

	public static void pay(Bill b) {
		System.out.println("$" + b.calcTotal());
	}

}
