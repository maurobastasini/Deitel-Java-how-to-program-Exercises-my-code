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

public class SetOfIntegers {
	private boolean[] integers;
	private static final int SET_QUANTITY = 101;
	
	public SetOfIntegers(){
		integers = new boolean[SET_QUANTITY];
	}
	
	public boolean[] getIntegers(){
		return integers;
	}

	public static SetOfIntegers union(SetOfIntegers set1, SetOfIntegers set2){
		SetOfIntegers result = new SetOfIntegers();		
		for(int i = 0; i < SET_QUANTITY; i++){
			if(set1.integers[i] || set2.integers[i]){
				result.integers[i] = true;
			}
		}
		
		return result;
		
	}
	
	public static SetOfIntegers intersection(SetOfIntegers set1, SetOfIntegers set2){
		SetOfIntegers result = new SetOfIntegers();		
		for(int i = 0; i < SET_QUANTITY; i++){
			if(set1.integers[i] && set2.integers[i]){
				result.integers[i] = true;
			}
		}
		
		return result;
		
	}


	public static void insertElement(SetOfIntegers set, int element){
		set.integers[element] = true;
	}
	
	public static void deleteElement(SetOfIntegers set, int element){
		set.integers[element] = false;
	}
	/*
	@Override
	public String toString(){
		String result = "[ ";
		boolean empty = true;
		for(int i = 0; i < SET_QUANTITY; i++){
			if(integers[i]){
				result += i + " ";
				empty = false;
			}
			
		}
		result += "]";
		if(empty){
			result = "[ --- ]";
		}
		return result;
	}
	
	*/
	@Override
	public String toString(){
		String result = "[ --- ]";
		boolean empty = true;
		int counter = 0;
		while(empty && counter < SET_QUANTITY){
			if(integers[counter]){
				empty = false;
				result = "[ " + counter++ + " ";
				for(; counter < SET_QUANTITY; counter++){
					if(integers[counter]){
						result += counter + " ";
					}
				}
				result += "]";
			}
			else{
				counter++;
			}
		}
		return result;
	}
	
	public static boolean isEqualTo(SetOfIntegers set1, SetOfIntegers set2){
		for(int i = 0; i < SET_QUANTITY; i++){
			if(set1.getIntegers()[i] != set2.getIntegers()[i]){
				return false;
			}
		}
		return true;
	}
}
