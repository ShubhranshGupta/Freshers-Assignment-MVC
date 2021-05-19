package assignment1.models;

public class RawItems extends Item {
  private double tax;	
  public RawItems(double price) {
		super(price);
		// TODO Auto-generated constructor stub
		 tax = (12.5 / 100) * price;
	}
 

  public Double getterTax() {
      return tax;
  }
  
}
