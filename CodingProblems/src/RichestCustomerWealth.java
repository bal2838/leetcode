/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
    	int largest = 0;
    	int curr = 0;
    	for (int i = 0; i < accounts.length; i++) {
    		for (int j = 0; j < accounts[i].length; j++) {
    			curr += accounts[i][j];
    		}
    		if (curr > largest) largest = curr;
    		curr = 0;
    	}
    	return largest;
    }
}
