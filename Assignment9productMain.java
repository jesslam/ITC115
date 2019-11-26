//*******************************************************************

//  The class or method name: Product
//
// Description of the class or method purpose:
// This method will define a product state with specific characteristics
// and via getters and setters, product information is called in the main.
//By: Jessica Lam 
//Date: 11/25/19
//*******************************************************************
//package Product;
import java.util.Arrays;
import java.util.ArrayList;
public class Assignment9productMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Products = p1.getPriceFormatted();
		Product p1 = new Product("48945", "Plaid", 49.67);
		Product p2 = new Product("85H485", "Striped", 953.56);
		Product p3 = new Product("G8R937", "Solid", 73.97);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		int count = Product.count;
		System.out.print(count);
		//create product instances
		
	}


			

}


	

