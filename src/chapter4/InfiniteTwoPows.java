package chapter4;
//complete and functional
//it depends on the condition... sometimes nothing happens... otherwise it start but not finish
public class InfiniteTwoPows {

	public static void main(String[] args) {
		int start = 1;
		int end = 2;
		while (start <= end){
			System.out.printf("%d ", start);
			start *= 2;
			end *= 2;
		}

	}

}
