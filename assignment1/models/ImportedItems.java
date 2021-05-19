package assignment1.models;

public class ImportedItems extends Item {
	private double tax;
	public ImportedItems(double price) {
		super(price);
		// TODO Auto-generated constructor stub
		  tax = 10.0 / 100 * price;
	        if (tax <= 100) {
	        	tax += 5;
	        }
	        else if (tax >= 100 && tax <= 200) {
	        	tax += 10;
	        }
	        else {
	        	tax += 5.0 / 100 * (tax + price); // 5 % of final cost which means original price + tax
	        }
	}
   
   
    public Double getterTax() {
        return tax;
    }
}
