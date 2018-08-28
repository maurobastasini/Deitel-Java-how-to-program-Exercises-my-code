/*
 *       Filename:  SetOfIntegers.java
 *
 *    Description:  Exercise 8.14 - Date Class
 *
 *        @Author:  Mauro Bastasini - maurobastasiniprof@gmail.com
 *       @Version:  1.0
 *       
 */

package chapter8;

public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date(1, 3, 1992);
		Date date2 = new Date(12, 31, 1823);
		System.out.println(date1.toFormat1());
		System.out.println(date2.toFormat1());
		System.out.println(date2.toFormat2());
		System.out.println(date2.toFormat3());
	}

}
