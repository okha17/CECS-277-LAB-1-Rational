/**
 * This is the main method which creates the 3 objects used in all the
 * arithmetic operations.  
 * @author Osman
 */
public class MainProgram {
	public static void main(String[] args) {
		// Create 3 objects with default Constructor 
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();
		
		// Call inputRational to set values for objects
		r1.inputRational();
		r2.inputRational();
		
		// Call add method and store it in r3
		r3.add(r1, r2);
		System.out.println(r1.toString() + " + " + r2.toString() + " = " + r3.toString());
		
		// Call sub method and store it in r3
		r3 = r1.sub(r2);
		System.out.println(r1.toString() + " - " + r2.toString() + " = " + r3.toString());
		
		// Call mul method and store it in r3
		r3.mul(r1, r2);
		System.out.println(r1.toString() + " * " + r2.toString() + " = " + r3.toString());
		
		// Call div method and store it in r3
		r3 = r1.div(r2);
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + r3.toString());
		
		// Call static method to divide r1 by r2 as a real value
		System.out.println(Rational.divToDouble(r1, r2));
		
		// Set numerator and denominator values as given values
		r1.setNumerator(2);
		r2.setDenominator(5);
		System.out.println("Numerator: " + r1.getNumerator());
		System.out.println("Denominator: " + r2.getDenominator());
	}

}
