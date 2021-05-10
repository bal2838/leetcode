
public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(ArrangingCoinsSoln(2));
		
	}
	
	public static int ArrangingCoinsSoln(int n) {
		if (n == 1) return 1;
		int numCoins = 1;
		int completeRows = 1;
		for (int i = 2; i <= n; i++) {
			numCoins += i;
			completeRows++;
			if (numCoins > n) return completeRows;
		}
		return completeRows;
	}

}
