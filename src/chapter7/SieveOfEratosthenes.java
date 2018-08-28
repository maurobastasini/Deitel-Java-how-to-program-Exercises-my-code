package chapter7;
//done done
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		boolean[] primes = new boolean[1000];
		
		for(int i = 0; i < primes.length; i++){
			primes[i] = true;
		}
		
		
		for(int i = 2; i < primes.length; i++){
			for(int j = 2; j < i; j++){
				if ((j != i) && (i % j == 0)){
					primes[i] = false;
				}
			}
		}
		
		for(int i = 2; i < primes.length; i++){
			if(primes[i])
				System.out.print(i + " ");
		}
	}

}
