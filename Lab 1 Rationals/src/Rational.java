import java.util.Scanner;
/**
 * The Rational program implements an application that can perform 
 * arithmetic operations with rational numbers. The program is 
 * implemented through a class named Rational and the main class where 
 * the objects are created and called.  
 * @author Osman 
 */
public class Rational {
	private int num;
	private int den;
	/**
	 * Default constructor that sets the private data members to their
	 * initial values of 0 and 1. Denominator cannot be 0 as it would 
	 * be undefined.
	 */
	Rational() {
		num = 0;
		den = 1;
	}
	/**
	 * Two argument constructor that initializes the numerator and
	 * denominator through the two public methods called setNumerator 
	 * and setDenominator.
	 * @param n the value of the numerator is assigned to n
	 * @param d the value of the denominator is assigned to d
	 */
	Rational(int n, int d) {
		this.setNumerator(n);
		this.setDenominator(d);
	}
	/**
	 * Public method that accesses the numerator.
	 * @return returns the value of the numerator
	 */
	public int getNumerator() {
		return num;
	}
	/**
	 * Public method that accesses the denominator.
	 * @return returns the value of the denominator
	 */
	public int getDenominator() {
		return den;
	}
	/**
	 * Public method that modifies the numerator, and this refers
	 * to the current object calling it.
	 * @param n is assigned to the numerator of the calling object
	 */
	public void setNumerator(int n) {
		this.num = n;
	}
	/**
	 * Public method that modifies the denominator
	 * @param d is assigned to the denominator of the calling object
	 */
	public void setDenominator(int d) {
		this.den = d;
	}
	/**
	 * Public method that takes the input from the user
	 * to set the values of the numerator and denominator.
	 * Uses Scanner class to take user input. myVal is a
	 * Scanner object.
	 * @return This method requires a Rational value to be returned so I called
	 * the two argument Constructor after setting the new values
	 */
	public Rational inputRational() {
		Scanner myVal = new Scanner(System.in); 
		System.out.println("Enter a numerator:");
		num = myVal.nextInt();
		System.out.println("Enter a denominator");
		den = myVal.nextInt(); 
		return new Rational (num, den); 
	
	}
	/**
	 * Public method that takes the numerator and denominator 
	 * values and puts it into the correct format.
	 * @return The num/den format as a String.
	 */ 
	public String toString() {
		String rational;
		rational = num + "/" + den;
		return rational;
	}
	/**
	 * Private method given to us to find the greatest common divisor
	 * @param m passes the numerator value
	 * @param n passes the denominator value 
	 * @return After the while loop finishes gcd is returned
	 */
	private int gcd(int  m, int n) {
			int r;
			while(n != 0)
			{ 
				r = m % n;
				m = n;
				n = r;
			}
			return m; 
	}
	/**
	 * This public method adds two rational objects through the calling 
	 * object. The keyword this represents the current object; in this
	 * case r3 is calling the add method with r1 and r2 as it's 
	 * parameters. The rational fractions need the same denominators to
	 * add so they are multiplied by each other's denominators. The 
	 * method gcd is also called in order to find the greatest common 
	 * divisor of the final added value to reduce the fraction.
	 * @param r1 Represents the rational object r1 created in main
	 * @param r2 Represents the rational object r2 created in main
	 */
	public void add(Rational r1, Rational r2) {
		this.num = (r1.num*r2.den) + (r2.num*r1.den); 
		this.den = (r1.den*r2.den);
		
		int value = gcd(num, den);
	    num = num/value;
	    den = den/value;
	    if (den < 0)
	      {
	         num = num * -1;
	         den = den * -1;
	      }
	}
	/**
	 * This public method subtracts two rational objects through the 
	 * calling object. In this case I created two values representing 
	 * the new numerator and denominator. As with addition the 
	 * denominators must be the same for subtraction. The calling object is
	 * r1 in this case and is multiplied by r2's denominator and the same is
	 * done for r2's numerator by r1's denominator. 
	 * @param r The parameter represents the rational object r2 being called by r1
	 * @return  This method requires a Rational value to be returned so I called
	 * the two argument Constructor to set the new values and returned it in the
	 * variable sub
	 */
	public Rational sub(Rational r) {
		int numer;
		int denom;
		
		numer = (num*r.den) - (r.num*den);
		denom = (den) * (r.den);
		
		int value = gcd(numer, denom);
		numer = numer/value;
		denom = denom/value;
		
		Rational sub;
		
		if (denom < 0)
	      {
	         numer = numer * -1;
	         denom = denom * -1;
	      }
		sub = new Rational(numer, denom);
		return sub;
	}
	/**
	 * This public method multiplies two rational objects through the calling object.
	 * The keyword this represents the current object; in this case r3 is calling the
	 * mul method with r1 and r2 as it's parameters. This one also calls gcd in order 
	 * to reduce the final result.
	 * @param r1  r1 Represents the rational object r1 created in main
	 * @param r2  r2 Represents the rational object r2 created in main
	 */
	public void mul(Rational r1, Rational r2) {
		this.num = (r1.num*r2.num);
		this.den = (r1.den*r2.den); 
		
		int value = gcd(num, den);
		num = num/value;
	    den = den/value;
	    
	    if (den < 0)
	      {
	         num = num * -1;
	         den = den * -1;
	      }
	}
	/**
	 * This public method divides two rational objects through the calling object.
	 * As with the subtract method I created two new variables which will store the
	 * divided values of the final result. The calling object is r1 and multiples with 
	 * denominator of r2 because division is the same as multiplication of the 
	 * reciprocal. The method gcd is called in order to reduce the result. 
	 * @param R The parameter represents the rational object r2 being called by r1
	 * @return This method requires a Rational value to be returned so I called
	 * the two argument Constructor to set the new values and returned it in
	 * variable div
	 */
	public Rational div(Rational R) {
		int numer;
		int denom;
		
		numer = (num*R.den);
		denom = (R.num*den);
		
		int value = gcd(numer, denom);
		numer = numer/value;
		denom = denom/value; 
		
		Rational div; 
		
		if (denom < 0)
	      {
	         numer = numer * -1;
	         denom = denom * -1;
	      }
		
		div = new Rational(numer, denom);
		return div;
	}
	/**
	 * This public static method can be accessed by calling the Rational class
	 * and using the dot operator with the two objects r1, and r2 as the parameters.
	 * The method displays the real value of rational r1 divided by rational r2.
	 * @param r1 r1 Represents the rational object r1 created in main
	 * @param r2 r2 Represents the rational object r2 created in main
	 * @return  Returns the result of the division as a real number in the variable result
	 */
	public static double divToDouble(Rational r1, Rational r2) {
		double result;
		double numer;
		double denom;
		numer = (r1.num*r2.den);
		denom = (r2.num*r1.den);
		result = numer/denom;
		return result; 
	}
}
