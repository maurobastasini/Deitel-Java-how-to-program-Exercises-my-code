package chapter8;
//done done
public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex(double realPart, double imaginaryPart){
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex(){
		this(0, 0);
	}
	
	public double getRealPart(){
		return realPart;
	}
	public void setRealPart(double realPart){
		this.realPart = realPart;
	}
	public double getImaginaryPart(){
		return imaginaryPart;
	}
	public void setImaginaryPart(double imaginaryPart){
		this.imaginaryPart = imaginaryPart;
	}
	
	public String toString(){
		String imaginaryPart;
		if(getImaginaryPart() > 0){
			imaginaryPart = String.format("+ %.0fi", getImaginaryPart());
		}else if(getImaginaryPart() == 0){
			imaginaryPart = "";
		}else{
			imaginaryPart = String.format("%.0fi", getImaginaryPart());
		}
		return String.format("%.0f%s", getRealPart(), imaginaryPart);
	}
	
	public static Complex add(Complex firstNumber, Complex secondNumber){
		Complex result = new Complex(firstNumber.getRealPart() + secondNumber.getRealPart(),
				firstNumber.getImaginaryPart() + secondNumber.getImaginaryPart());
		return result;
	}
	
	public static Complex substract(Complex firstNumber, Complex secondNumber){
		Complex result = new Complex(firstNumber.getRealPart() - secondNumber.getRealPart(),
				firstNumber.getImaginaryPart() - secondNumber.getImaginaryPart());
		return result;
	}
	
}
