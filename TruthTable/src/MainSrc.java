/**
 * A simple program that demonstrates how Truth Table works. What is a Truth
 * Table?: http://kias.dyndns.org/comath/21.html OR https://medium.com/i-math/intro-to-truth-tables-boolean-algebra-73b331dd9b94
 *  
 */


public class MainSrc {

	public static void main(String[] args) {

		int n = 1; // n is for how many variables
		int x, count =0; 
		boolean p = true, T, q = true; // T is result of p and q
		int row = (int) Math.pow(2,n); // how many rows in the table?
		System.out.println("The Truth Table by iasjem\n(NOT, AND, NAND, OR, NOR, XOR, XNOR)");
		System.out.println(); System.out.println();
		// THE NOT OPERATOR
		System.out.println("NOT operator");
		
		for (x=0; x<row; x++) {
			T =p;
			System.out.println(showValue(p) + "\t" + showValue(!T));
			p=!p; // negate P
		}

		System.out.println();
		// THE AND OPERATOR
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("AND operator");		
		
		for (x=0; x<row; x++) {
			T =p && q; // p or q
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}	

		System.out.println();
		// THE NAND OPERATOR
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("NAND operator");		
		
		for (x=0; x<row; x++) {
			T =p && q; // p or q
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(!T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}	
		
		System.out.println();
		// THE OR OPERATOR
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("OR operator");		
		
		for (x=0; x<row; x++) {
			T =p || q; // p or q
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}		
		
		System.out.println();
		// THE NOR OPERATOR
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("NOR operator");		
		
		for (x=0; x<row; x++) {
			T =p || q; // p or q
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(!T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}	
				
		System.out.println();
		// THE XOR OPERATOR
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("XOR operator");		
		
		for (x=0; x<row; x++) {
			if ((p==true && q==false) || (p==false && q==true)) {
				T =true; } else {T=false;}
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}	
		
		System.out.println();
		// THE XNOR OPERATOR 
		n = 2; p = true; q = true; // initialize values again
		row = (int) Math.pow(2,n);
		count=0;
		System.out.println();
		System.out.println("XNOR operator");		
		
		for (x=0; x<row; x++) {
			if ((p==true && q==false) || (p==false && q==true)) {
				T =false; } else {T=true;}
			System.out.println(showValue(p) + "\t" + showValue(q) + "\t" + showValue(T));
			q=!q; 
			count++; // count number of rows
			if (count >=row/2) {p=false;} 
		}	
		
	}

	private static char showValue(boolean v) {
		// Indicates if the variables are T or F
		if (v == false) {
			return 'F';
		} else {
			return 'T';
		}
	}

	

	// Hope you like it! :)
}
