import java.util.HashMap;

/*
The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.

You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
 */
public class CheckIfWordEqualsSummationOfTwoWords {
	public static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		map.put('a', Integer.valueOf(0));
		map.put('b', Integer.valueOf(1));
		map.put('c', Integer.valueOf(2));
		map.put('d', Integer.valueOf(3));
		map.put('e', Integer.valueOf(4));
		map.put('f', Integer.valueOf(5));
		map.put('g', Integer.valueOf(6));
		map.put('h', Integer.valueOf(7));
		map.put('i', Integer.valueOf(8));
		map.put('j', Integer.valueOf(9));
		return ((getValue(firstWord) + getValue(secondWord)) == getValue(targetWord));
	}

	private int getValue(String str) {
		String currString = str;
		int value = 0;
		int M = 1;
		for (int i = currString.length() - 1; i >= 0; i--) {
			value += map.get(currString.charAt(i)) * M;
			M *= 10;
		}
		return value;
	}
}
