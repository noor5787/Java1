package in.ineuron.in;

public class StarPattern4 {

	    public static void main(String[] args) {
	    	
	        int rows = 8;
	        
	        for (int i = 1; i <= rows; i++) {
	            // Print left asterisks
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            
	            // Print spaces
	            for (int k = 1; k <= 2 * (rows - i); k++) {
	                System.out.print(" ");
	            }
	            
	            // Print right asterisks
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
	}

