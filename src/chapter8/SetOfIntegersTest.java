/*
 *       Filename:  SetOfIntegers.java
 *
 *    Description:  Exercise 8.13 - Set of Integers
 *
 *        @Author:  Mauro Bastasini - maurobastasiniprof@gmail.com
 *       @Version:  1.0
 *       
 */

package chapter8;

public class SetOfIntegersTest {

	public static void main(String[] args) {
		SetOfIntegers set1 = new SetOfIntegers();
		SetOfIntegers set2 = new SetOfIntegers();
		SetOfIntegers set3 = new SetOfIntegers();
		SetOfIntegers set4 = new SetOfIntegers();
		
		for(int i = 0; i < 10; i++){
			SetOfIntegers.insertElement(set1, i);
		}
		
		for(int i = 5; i < 40; i++){
			SetOfIntegers.insertElement(set2, i);
		}
		
		SetOfIntegers.deleteElement(set2, 7);
		
		System.out.println("Set1: " + set1);		
		System.out.println("Set2: " + set2);
		System.out.println("Set3: " + set3);
		System.out.println("Set4: " + set4);
		System.out.println("Interserction (Set1 . Set2): " + SetOfIntegers.intersection(set1, set2));
		System.out.println("Union (Set1 + Set2): " + SetOfIntegers.union(set1, set2));
		System.out.printf("Set3 and set4 are%s equals.",
				(SetOfIntegers.isEqualTo(set3, set4))? "" : " not");
	}

}
