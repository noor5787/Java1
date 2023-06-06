package in.ineuron.in;

public class PrintPattern {


	    public static void main(String[] args) {
	        int rows = 13;
	        int cols = 14;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= cols; j++) {
	                if (i <= rows / 2) {
	                    if (j <= i || j > cols - i + 1) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                } else {
	                    if (j <= cols - i + 1 || j > i) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println();
	        }
	    }
	}
