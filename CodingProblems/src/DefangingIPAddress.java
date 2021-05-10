
public class DefangingIPAddress {
	/*
	 * time: o(n)
	 * space: o(n)
	 */

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
	
	public static String defangIPaddr(String address) {
		String answer = "";
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') answer += "[.]";
			else answer += address.charAt(i);
		}
		return answer;
        
    }

}
