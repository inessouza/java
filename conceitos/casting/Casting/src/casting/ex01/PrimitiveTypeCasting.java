package casting.ex01;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		int x = 10; int y = 6; int z = 3;
		
		double a = 3; double b = 1.0; double c = x / y;
		
		System.out.println("\t\t\n------Without Casting------");
		
		System.out.println("\tInt Type: \n");
		
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);
		 System.out.println("z = " + z);
		 
		 System.out.println("\tDouble Type: \n");
		 
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 System.out.println("c = " + c);
		 
		System.out.println("\t\t\n------With Casting------");
		
		System.out.println("Invalid Casting: ");
		
		/*
		 *  First the operation is calculated and before return a type int, 
		 *  then the casting try convert and "succeed", but the 1 int to double is 1.0
		 *  However we lost the float value
		 */
		
		c = (double) (x / y);
		System.out.println("c = " + c);		
		
		
		/*
		 *  First x is converted to double type and after return a type double divided by int type
		 *  then the casting operation occurs before of the result 
		 */
		
		System.out.println("Convert int to double: ");
		c = (double)x / y;
		System.out.println("c = " + c);
		
		// c = 1.6666666667
		// h = c = (cast int) 1
		
		System.out.println("Convert double to int: ");
		int h = (int) c; 
		System.out.println("h = " + h);
		
	}
}