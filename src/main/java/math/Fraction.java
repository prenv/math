package math;

/**
 * Class for representing fractions that are not reduced automatically.
 */
public class Fraction extends Number implements Cloneable {

	/**
	 * The numerator of this fraction.
	 */
	protected int numerator;

	/**
	 * The denominator of this fraction that is always positive.
	 */
	protected int denominator;

	/**
	 * The {@code Fraction} object that represents the number zero.
	 */
	public static final Fraction ZERO = new Fraction(0);

	/**
	 * Constructor for creating a {@code Fraction} object.
	 *
	 * @param numerator the numerator of the fraction
	 * @param denominator the denominator of the fraction
	 * @throws ArithmeticException if the denominator is zero
	 */
	public Fraction(int numerator, int denominator) throws ArithmeticException {
		if (denominator == 0)
                    throw new ArithmeticException();
                if (denominator > 0) {
                    this.numerator = numerator;
                    this.denominator = denominator;
                } else {
                    this.numerator = -numerator;
                    this.denominator = -denominator;
                }
	}

	/**
	 * Constructor for creating a {@code Fraction} object that represents the {@code int} specified.
	 *
	 * @param n
	 */
	public Fraction(int n) {
		this(n, 1);
	}

	/**
	 * Returns the numerator of this fraction.
	 *
	 * @return the numerator of this fraction
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the denominator of this fraction.
	 *
	 * @return the denominator of this fraction
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Adds an {@code int} to this fraction.
	 *
	 * @param n the {@code int} to add
	 * @return a fraction that represents the result
	 */
	public Fraction add(int n) {
		// TODO (Adeel Dansih)
		return null;
	}

	/**
	 * Substracts an {@code int} from this fraction.
	 *
	 * @param n the {@code int} to substract
	 * @return a fraction that represents the result
	 */
	public Fraction substract(int n) {
		// TODO (Adeel Dansih)
		return null;
	}

	/**
	 * Multiplies this fraction by an {@code int}.
	 *
	 * @param n the {@code int} to multiply by
	 * @return a fraction that represents the result
	 */
	public Fraction multiply(int n) {
		// TODO (Ben Lakhdar Yassine)
		return null;
	}

	/**
	 * Divides this fraction by an {@code int}.
	 *
	 * @param n the {@code int} to divide by
	 * @return a fraction that represents the result
	 * @throws ArithmeticException if the parameter {@code n} is zero
	 */
	public Fraction divide(int n) throws ArithmeticException {
		// TODO (Ben Lakhdar Yassine)
		return null;
	}

	/**
	 * Raises this fraction to the power specified.
	 *
	 * @param n the exponent
	 * @return a fraction that represents the result
	 */
	public Fraction pow(int n) {
		// TODO (Chiroma Joshua Ishaku)
		if(n > 0) {
			return new Fraction((int)(Math.pow(numerator, n)),(int)(Math.pow(denominator, n)));
		}else
		{
			return new Fraction((int)(Math.pow(denominator, -n)),(int)(Math.pow(numerator, -n)));
		}
	}

	/**
	 * Adds a fraction to this fraction.
	 *
	 * @param fraction the fraction to add
	 * @return a fraction that represents the result
	 */
	public Fraction add(Fraction fraction) {
		// TODO (Eltahir Mohamed Abuelela Ibrahim)
		return null;
	}

	/**
	 * Substracts a fraction from this fraction.
	 *
	 * @param fraction the fraction to subtract
	 * @return a fraction that represents the result
	 */
	public Fraction substract(Fraction fraction) {
		// TODO (Eltahir Mohamed Abuelela Ibrahim)
		return null;
	}

	/**
	 * Divides this fraction by another.
	 *
	 * @param fraction the fraction to divide by
	 * @return a fraction that represents the result
	 * @throws ArithmeticException if the parameter {@code fraction} is zero
	 */
	public Fraction divide(Fraction fraction) throws ArithmeticException {
		// TODO (Farouk Umar Abubakar)
		return null;
	}

	/**
	 * Multiplies this fraction by another.
	 *
	 * @param fraction the fraction to multiply by
	 * @return a fraction that represents the result
	 */
	public Fraction multiply(Fraction fraction) {
		// TODO (Farouk Umar Abubakar)
		return null;
	}

	/**
	 * Returns the reciprocal of this fraction.
	 *
	 * @return a fraction that represents the reciprocal of this fraction
	 */
	public Fraction reciprocal() {
		// TODO (Chiroma Joshua Ishaku)
		
		return new Fraction(denominator, numerator);
	}

	/**
	 * Returns the absolute value of this fraction.
	 *
	 * @return the absolute value of this fraction
	 */
	public Fraction abs() {
		// TODO (Kalbiyev Ali)
                
                if ( this.numerator < 0 ) {
                    return new Fraction(-this.numerator, this.denominator);
                }
		return new Fraction(this.numerator,this.denominator);
	}

	/**
	 * Returns the value of this fraction as an {@code int}.
	 *
	 * @return the value of this fraction as an {@code int}
	 */
	public int intValue() {
		// TODO (Kalbiyev Ali)
                
		return this.numerator/this.denominator;
	}

	/**
	 * Returns the value of this fraction as a {@code double}.
	 *
	 * @return the value of this fraction as a {@code double}
	 */
	public double doubleValue() {
		// TODO (Kalbiyev Ali)
                
		return ( (double)this.numerator / (double)this.denominator );
	}

	/**
	 * Returns the value of this fraction as a {@code float}.
	 *
	 * @return the value of this fraction as a {@code float}
	 */
	public float floatValue() {
		// TODO (Kalbiyev Ali)
                
		return ( (float)this.numerator / (float)this.denominator );
	}

	/**
	 * Returns the value of this fraction as a {@code long}.
	 *
	 * @return the value of this fraction as a {@code long}
	 */
	public long longValue() {
		// TODO (Kalbiyev Ali)
                
		return this.numerator/this.denominator;
	}

	/**
	 * Returns whether this fraction is equal to zero.
	 *
	 * @return {@code true} if this fraction is equal to zero, {@code false} otherwise
	 */
	public boolean isZero() {
		// TODO
		return false;
	}

	/**
	 * Reduces this fraction.
	 *
	 * @return the result of the reduction of this fraction
	 */
	public Fraction reduce() {
		// TODO (Srdanovic Rade)
                
                int gcd = GCD.gcd(numerator,denominator);
                return new Fraction(this.numerator/gcd,this.denominator/gcd);
                
	}

	/**
	 * Creates and returns a copy of this object.
	 *
	 * @return a clone of this object
	 */
	public Object clone() {
		// TODO
		return null;
	}

	/**
	 * Compares this fraction with the specified object for equality. Two {@code Fraction} objects
	 * are considered equal if and only if their numerators and denominators are equal.
	 *
	 * @param o the object to compare to
	 * @return <code>true</code> if the objects are equal, <code>false</code> otherwise
	 */
	public boolean equals(Object o) {
		// TODO
		return false;
	}

	/**
	 * Returns a hash code value for this object.
	 *
	 * @return a hash code value for this object
	 */
	public int hashCode() {
		// TODO
		return 0;
	}

	/**
	 * Returns the string representation of this object. The result is
	 * <ul>
	 *     <li>{@code "0"} if the numerator is 0;</li>
	 *     <li>{@code "}<em>numerator</em>{@code "} if the denominator is 1;</li>
	 *     <li>{@code "}<em>numerator</em>{@code /}<em>denominator</em>{@code "} otherwise.</li>
	 * </ul>
	 *
	 * @return the string representation of this fraction
	 */
	public String toString() {
		// TODO (Srdanovic Rade)
		//return "Number: " + numerator/denominator;
                
                if(numerator == 0){
                    return "0";
                }if(denominator == 1){
                    return "numerator";
                }else{
                    return "Number: "+ numerator/denominator;
                }
        }
}
