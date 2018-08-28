package chapter7;

public class UsingEnhancedForStatement {
//done done
	public static void main(String[] args) {
		
		double total = 0;
		for(String arg : args){
			total += Double.parseDouble(arg);
		}
		System.out.println("Total: " + total);

	}
	
}
