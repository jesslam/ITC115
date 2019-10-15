
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPowersOfN(7,3); 
		System.out.println(); 
		printPowersOfN(5,5);
		System.out.println();
		 
		}
	
	  public static void printPowersOfN(double baseNum, double expNum) { 
		  // TODO Auto-generated method stub
	  
		  for (int i = 0; expNum >= i; i++) { 
			  //System.out.println()
			  System.out.print((int) Math.pow(baseNum, i)  + " "); 
		  } 
	  }
}
	

