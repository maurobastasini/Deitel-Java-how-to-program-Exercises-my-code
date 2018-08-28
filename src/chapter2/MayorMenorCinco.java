package chapter2;

import java.util.Scanner;

//This Class Prueba performs a multiplication between two integers entered by user
public class MayorMenorCinco {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //variable input is initialized
		int a,  
			b,
			c,
			d,
			e,
			smaller,
			larger;
		


		
		System.out.print("Enter an integer: "); //prompt
		a = input.nextInt(); //read first number from user
		
		System.out.print("Enter an integer: "); //prompt
		b = input.nextInt(); //read second number from user
		
		System.out.print("Enter an integer: "); //prompt
		c = input.nextInt(); //read third number from user
		
		System.out.print("Enter an integer: "); //prompt
		d = input.nextInt(); //read first number from user
		
		System.out.print("Enter an integer: "); //prompt
		e = input.nextInt(); //read second number from user
				
		smaller = a;
		larger = a;
		
		//Determinate which number is the smaller
		if (b <= a && b <= c && b <= d && b <= e){
			smaller = b;
		}
		
		if (c <= a && c <= b && c <= d && b <= e){
			smaller = c;
		}
		
		if (d <= a && d <= b && d <= c && d <= e){
			smaller = d;
		}
		
		if (e <= a && e <= b && e <= c && e <= d){
			smaller = e;
		}
		
		//Determinate which number is the larger
		if (b >= a && b >= c && b >= d && b >= e){
			larger = b;
		}
		
		if (c >= a && c >= b && c >= d && b >= e){
			larger = c;
		}
		
		if (d >= a && d >= b && d >= c && d >= e){
			larger = d;
		}
		
		if (e >= a && e >= b && e >= c && e >= d){
			larger = e;
		}
		
		
		System.out.printf("The smaller is %d%n", smaller);
		
		System.out.printf("The larger is %d%n", larger);

		
	}

}


