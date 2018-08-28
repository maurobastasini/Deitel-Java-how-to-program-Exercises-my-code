package chapter8;

public class HugeInteger {
	private char[] integer = new char[40];
	
	public HugeInteger(String num){
		parse(num);		
	}
	
	public HugeInteger() {
		
	}
	
	public void parse(String num){
		int stringIndex = num.length() -1;
		for(int i = 0; i < num.length(); i++){
			char character = num.charAt(stringIndex);
			if(character < '0' || character > '9'){
				throw new IllegalArgumentException("Must be a number");
			}
			integer[i] = character;
			stringIndex--;
		}
	}
	
	public HugeInteger add(HugeInteger num){
		HugeInteger result = new HugeInteger();
		boolean carry =false;
		int sum;
		int maxLength = Math.max(this.integer.length, num.integer.length);
		for(int i = 0; i < maxLength; i++){
			sum = this.integer[i] + num.integer[i];
			if(carry){
				sum++;
				carry = false;
			}			
			if(sum > '9'){
				carry = true;
				sum -= '9';
			}
			result.integer[i] = (char) sum;
		}
		if(carry){
			System.out.println("Sum was finished but the result overload HugeInteger capacity");
		}
		return result;
		
	}
	
	
	
	
	public String toString(){
		String number = "";
		for(char i: integer){
			number = i + number;			
		}
		return number;
	}
	
}
