import java.math.*;

/**
 * Demonstrate large numbers.
 * @author Ian F. Darwin, ian@darwinsys.com
 * @version $Id$
 */
public class BigNums {
	public static void main(String argv[]) {
		//+
		System.out.println("Here's Long.MAX_VALUE: " + Long.MAX_VALUE);
		BigInteger bInt = new BigInteger("3419229223372036854775807");
		System.out.println("Here's a bigger number: " + bInt);
		System.out.println("Here it is as a double: " + bInt.doubleValue());
		//-
	}
}
