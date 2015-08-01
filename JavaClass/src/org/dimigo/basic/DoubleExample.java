package org.dimigo.basic;

public class DoubleExample {
	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 3.14d;
		
		float f1 = (float)3.14;
		float f2 = 3.14f;
		
		System.out.printf("%.2f %.2f %.2f %.2f \n", d1, d2, f1, f2);
		
		double d3 = 0.12345678765432345665432345676543;
		float f3 = 0.1234543234543454323454345f;
		
		System.out.println(d3);
		System.out.println(f3);
	}
}
