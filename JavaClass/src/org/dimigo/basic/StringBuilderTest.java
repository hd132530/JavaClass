/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *        |_StringBuilderTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class StringBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1. String으로 문자열 추가하기
		String str = "디미고";
		str += "2학년";
		str += "5반";
		str += "30번";
		str += "정승진";
		System.out.println(str);
		
		//2. StringBuilder로 문자열 추가하기
		StringBuilder sb = new StringBuilder();
		sb.append("디미고");
		sb.append("2학년");
		sb.append("5반");
		sb.append("30번");
		sb.append("정승진");
		System.out.println(sb.toString());
		System.out.println(sb);
		
		long start = System.currentTimeMillis();
		
		//String test = "abc";
		StringBuilder test1 = new StringBuilder("abc");
		
		for (int i =0; i<100000; i++ )
		{
			//test += "def";
			test1.append("def");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}
