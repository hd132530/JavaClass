/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * org.dimigo.oop
 *        |_ArraysTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 29.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class ArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[]  src = {"헐크", "아이언맨", "자비스", "토르", "캡틴아메리카"};
		//배열 복사
		String[] copy = Arrays.copyOf(src, src.length);
		
		//배열 출력
		System.out.println(Arrays.toString(copy));
		
		//배열 비교
		System.out.println(Arrays.toString(copy));
		
		//배열 출력
		System.out.println(Arrays.equals(src, copy));
		
		//오름차순 정렬
		Arrays.sort(copy);
		System.out.println(Arrays.toString(copy));
		
		// 배열 요소 검색
		System.out.println(Arrays.binarySearch(copy, "토르"));
		
		//내림차순 정렬
		List<String> list = Arrays.asList(copy);
		Collections.reverse(list);
		System.out.println(Arrays.toString(copy));
		
	}

}
