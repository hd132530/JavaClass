package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// 자동 형변환 
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		
		System.out.println(b + " " + s + " " + i + " " + l);
		
		// 강제 형변환  
		long l1 = 100;
		int i1 =  (int) l1;
		short s1 = (short) i1;
		byte b1 = (byte) s1;
		
		System.out.println(b1 + " " + s1 + " " + i1 + " " + l1);
		
		System.out.println((int) 3.99);
		
		// 강제 형변환 시 주의
		int i2 = 128;
		byte b2 = (byte) i2;
		
		System.out.println(b2);
		
		long l2 = 10000000000l;
		int i3 = (int) l2;
		
		System.out.println(i3);
	}

}
