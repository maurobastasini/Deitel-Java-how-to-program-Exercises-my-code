package chapter7;

import java.util.Scanner;
//done done
public class DuplicateElimination{
    private static int[] arrValues = new int[5];

    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int number;
    	System.out.println("**** WELCOME ****");
    	
    	for(int i = 0; i < 5; i++){
    		do{
    			System.out.printf("Enter the %d number: ", i + 1);
        		number = input.nextInt();
    		}while(number < 10 || number > 100);
    		
    		if(isUnique(number))
    			arrValues[i] = number;   		
    	}
    	
    	System.out.print("The unique values entered are: ");
    	for(int i = 0; i < arrValues.length; i++){
    		if(arrValues[i] != 0)
    			System.out.printf("%d ", arrValues[i]);
   
    	}
    	
    	System.out.println("**** Thanks for use my app :) ****");
    	
    }
    
    public static boolean isUnique(int numberToVerify){
    	for(int i = 0; i < arrValues.length; i++){
    		if(numberToVerify == arrValues[i])
    			return false;
    	}
    	return true;   	
    	
    }
}