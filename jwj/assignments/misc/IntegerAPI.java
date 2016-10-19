package misc;



public class IntegerAPI {
	
	public static void main(String[] args) {
		
		Integer myNum = new Integer(10);
		//1. Use the compareTo(Integer) method twice, getting different results.
		System.out.println(myNum.compareTo(10));
		System.out.println(myNum.compareTo(22));
		System.out.println(myNum.compareTo(-3));
		System.out.println();
		
		//2. Use the compare(int, int) method twice, getting different results.
		System.out.println(Integer.compare(10,10));
		System.out.println(Integer.compare(10,22));
		System.out.println(Integer.compare(10,-3));
		System.out.println();
		
		//3. Use the decode(String) method to get and print the integer values of the following strings:
		//a. "-10"
		System.out.println(Integer.decode("-10"));
		//b. "0xFF"
		System.out.println(Integer.decode("0xFF"));
		//c. "-0xAB"
		System.out.println(Integer.decode("-0xAB"));
		//d. "010"
		System.out.println(Integer.decode("010"));
		//e. "011"
		System.out.println(Integer.decode("011"));
		//f. "012"
		System.out.println(Integer.decode("012"));
		System.out.println();
		
		//4. Use the floatValue() method twice on different integers.
		System.out.println(myNum.floatValue());
		myNum = -5;
		System.out.println(myNum.floatValue());
		myNum = 0;
		System.out.println(myNum.floatValue());
		myNum = 999;
		System.out.println(myNum.floatValue());
		System.out.println();
		
		//5. Call hashCode() on an integer instance. Call Integer.hashCode(int) on a couple values.
		myNum = 999;
		System.out.println(myNum.hashCode());
		myNum = -5;
		System.out.println(myNum.hashCode());
		myNum = 0;
		System.out.println(myNum.hashCode());
		myNum = 10002203;
		System.out.println(myNum.hashCode());
		System.out.println();
		System.out.println(Integer.hashCode(999));
		System.out.println(Integer.hashCode(-5));
		System.out.println(Integer.hashCode(0));
		System.out.println(Integer.hashCode(10002203));
		System.out.println();
		
		//6. Use a method call to determine the greater of (0xFA, 0xFB).
		myNum = Integer.decode("0xFA");
		System.out.println(myNum.compareTo(Integer.decode("0xFB")));
		System.out.println();

		//7. Use toBinaryString(int) to print the binary value for 256.
		String myString = Integer.toBinaryString(256);
		System.out.println(myString);
		System.out.println();
		
		//8. Use toHextString(int) to print the hex value for 256 and for 1024.
		myString = Integer.toBinaryString(256);
		System.out.println(myString);
		myString = Integer.toBinaryString(1024);
		System.out.println(myString);
		System.out.println();
		
		//9. Use valueOf(String) to convert "555" into an Integer.
		myNum = Integer.valueOf("555");
		System.out.println(myNum);
		
	}
	
}
