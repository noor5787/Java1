package in.ineuron.in;

public class StarPattern {
	

	    public static void main(String[] args) {
	        int rows = 7; // Number of rows in the pattern

	        // Print the upper half of the pattern
	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Print the lower half of the pattern
	        for (int i = 2; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
