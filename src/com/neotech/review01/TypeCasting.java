package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {

		// byte < short < int < long < float < double
		
		int intNumber = 39;
		
		// widening / implicit casting / automatically
		//double doubleNumber = (double) intNumber; // casting / converting ---> you dont need to cast becayse double is bigger comtainer. smaller to bigger container we dont need to specify
		double doubleNumber = intNumber;
		
		System.out.println("intNumber ---> " + intNumber);
		System.out.println("doubleNumber " + doubleNumber);
		
		
		
		// narrowing /explicit casting / manually (forcing)
		byte byteNumber = (byte) intNumber; // it is risky. We may loose data. Converting Bigger to smaller container.
		
		System.out.println("byteNumber --> " +byteNumber);

		//example		
		// reassigning
		intNumber = 300;
		// in this case we WILL lose data.  because int number is big. byte range has to be -128 to 127. 
		byte b2 = (byte) intNumber;
		System.out.println("b2 --> " + b2);
		
		// widening / implicit casting / automatically
		byte b3 = 80;
		int i3 = b3; 
		System.out.println("i3 --> " + i3);
		
		
		// narrowing /explicit casting / manually (forcing)
		double d1 = 7.99;
		int i4 = (int) d1; 
		System.out.println("i4 --> " + i4);

		
		
	}

}
