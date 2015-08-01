package org.dimigo.basic;

public class IntExample {

	public static void main(String[] args) {
		int i1 = 10; //10진수
		int i2 = 0b1010; // 2진수
		int i3 = 012; //8진수
		int i4 = 0x0A; //16진수
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);		
		
		
		// byte type {-128~127}
		
		byte b1 = -128;
		byte b2 = 127;
		
		
		b2++;
		
		System.out.println(b1);
		System.out.println(b2);
		
		//byte -> Byte -> Integer, short -> Short, long -> Long
		
		System.out.println("byte 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		long l1 = 1000000000L;
		System.out.println(l1);
	}

}
