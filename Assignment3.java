
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPowersOfN(7,3); 
		System.out.println(); 
		printPowersOfN(5,5);
		System.out.println();
		 
		}
	
	  public static void printPowersOfN(int a, int b) { 
		  // TODO Auto-generated method stub
	  
		  for (int i = 1; i >= 0; i = i * a) { 
		  System.out.print(i + " "); 
		  } 
	  }
}
	

