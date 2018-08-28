package chapter8;
//done done


public class RationalNumbers {
	private int numerator;
	private int denominator;
	
	public RationalNumbers(){
		this(0, 1);
	}
	
	public RationalNumbers(int numerator){
		this(numerator, 1);
	}	
	
	public RationalNumbers(int numerator, int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator must be different from 0");
		}
		
		int gcd = gcd(numerator, denominator);
		this.numerator = applySignToNumerator(numerator, denominator) / gcd;
		this.denominator = Math.abs(denominator) / gcd;
		
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	public void setNumerator(int numerator){
		this.numerator = numerator;
	}
	
	public int getDenominator(){
		return denominator;
	}
	
	public void setDenominator(int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator must be different from 0");
		}
		this.denominator = denominator;
	}
	
	private int applySignToNumerator(int numerator, int denominator){
		if((numerator >= 0 && denominator >= 0) || (numerator < 0 && denominator < 0)){
			return numerator;
		}else{
			return -Math.abs(numerator);
		}
	}
	
	public static RationalNumbers add(RationalNumbers num1, RationalNumbers num2){
		int resultDenominator = lcf(num1.getDenominator(), num2.getDenominator());
		int resultNumerator = resultDenominator / num1.getDenominator() * num1.getNumerator() +
				resultDenominator / num2.getDenominator() * num2.getNumerator();
		RationalNumbers result = new RationalNumbers(resultNumerator, resultDenominator);
		return result;
	}
	
	public static RationalNumbers substract(RationalNumbers num1, RationalNumbers num2){
		int resultDenominator = lcf(num1.getDenominator(), num2.getDenominator());
		int resultNumerator = resultDenominator / num1.getDenominator() * num1.getNumerator() -
				resultDenominator / num2.getDenominator() * num2.getNumerator();
		RationalNumbers result = new RationalNumbers(resultNumerator, resultDenominator);
		return result;
	}
	
	public static RationalNumbers multiply(RationalNumbers num1, RationalNumbers num2){
		int resultNumerator = num1.getNumerator() * num2.getNumerator();
		int resultDenominator = num1.getDenominator() * num2.getDenominator();
		RationalNumbers result = new RationalNumbers(resultNumerator, resultDenominator);
		return result;
	}
	
	public static RationalNumbers divide(RationalNumbers num1, RationalNumbers num2){
		int resultNumerator = num1.getNumerator() * num2.getDenominator();
		int resultDenominator = num1.getDenominator() * num2.getNumerator();
		RationalNumbers result = new RationalNumbers(resultNumerator, resultDenominator);
		return result;
	}	
	
	private static int gcd(int x, int y){
		if(y == 0){
			return Math.abs(x);
		}
		else{
			return Math.abs(gcd(y, x % y));
		}
	}
	
	private static int lcf(int x, int y){
		return x * (y / gcd(x, y));
	}
	
	@Override
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public String toFloatingPointFormat(int digitsOfPresition){
		String format = "" + (double)numerator / denominator;
		int indexOfDot = format.indexOf('.');
		int max = indexOfDot + digitsOfPresition + 1;
		if(max < format.length()){
			return format.substring(0, max);
		}else{
			return format;
		}

	}
		
}
