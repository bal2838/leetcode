/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */
public class DefangingIPAddress {
	public static String defangIPaddr(String address) {
		String answer = "";
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') answer += "[.]";
			else answer += address.charAt(i);
		}
		return answer;
    }
}
