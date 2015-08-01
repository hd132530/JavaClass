/**
 * 
 */
package org.dimigo.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre>
 * org.dimigo.oop
 *        |_StaticBlockTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class StaticBlockTest {
	private static String date = "";
	
	static{
//		System.out.println("static block start");
//		Calendar c = Calendar.getInstance();
//		date += c.get(Calendar.YEAR);
//		date += (c.get(Calendar.MONTH)+1);
//		date += c.get(Calendar.DATE);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss:SSS");
		date = sdf.format(new Date());
	}
	public StaticBlockTest(){
		System.out.println("constructor start");
		
	}
	public static void main(String[] args){
		System.out.println(date);
		
		StaticBlockTest t1 = new StaticBlockTest();
		StaticBlockTest t2 = new StaticBlockTest();
	}
	
}
