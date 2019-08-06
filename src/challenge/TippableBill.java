package challenge;

//It inherits from Bill.
//It has an additional double field: tip
//Add a no-args constructor and another constructor with three parameters to set the fields.
//It overrides the calcTotal method to add the tip ( bill calculation total, then + tip ).
public class TippableBill extends Bill {

	public double tip;

	

	public TippableBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcTotal() {
		// TODO Auto-generated method stub
		return super.calcTotal()+( tip);
	}
	
	
	
	
}
