//*******************************************************************

//  The class or method name: Product
//
// Description of the class or method purpose:
// This method will define a product state with specific characteristics
// and via getters and setters, product information is called in the main.
//By: Jessica Lam 
//Date: 11/25/19
//*******************************************************************
import java.text.NumberFormat;

public class Product {
	String productCode;
	String description;
	double price;
	public static int count;
	
	//constructs a product with a given state
	public Product(String productCode, String description, double price) {
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		
		count++;
	}
	
	@Override
	public String toString() {
		return ("Product Code: " + productCode) +
		("\nDescription: " + description) +
		("\nPrice: " + getPriceFormatted(price));
	}
	
	public String getPriceFormatted(double price) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
}
