package chapter6;
//done done
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 2; i < 10000000; i++){
			if(isPrime(i)){
				System.out.println(i);
				count += 1;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPrime(int number){
		
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
		
	}
}
