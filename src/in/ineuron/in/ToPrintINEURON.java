package in.ineuron.in;

public class ToPrintINEURON {

	    public static void main(String[] args) {
	        printI();
	        System.out.println();
	        printN();
	        System.out.println();
	        printE();
	        System.out.println();
	        printU();
	        System.out.println();
	        printR();
	        System.out.println();
	        printO();
	        System.out.println();
	        printN();
	    }

	    private static void printI() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 3; j++) {
	                if (i == 1 || i == 5 || j == 2)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	    private static void printN() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5; j++) {
	                if (j == 1 || j == 5 || i == j)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	    private static void printE() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 4; j++) {
	                if (i == 1 || i == 3 || i == 5 || j == 1)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	    private static void printU() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 4; j++) {
	                if (j == 1 || j == 4 || i == 5)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	    private static void printR() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 4; j++) {
	                if (i == 1 || i == 3 || j == 1 || (i == 2 && j == 3) || (i == 4 && j == 4))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	    private static void printO() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 4; j++) {
	                if ((j == 1 || j == 4) && (i != 1 && i != 5) || (i == 1 || i == 5) && (j != 1 && j != 4))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	}
