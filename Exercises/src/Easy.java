
public class Easy {
	public String frontBack(String str) {
		int s = str.length();
		int a = s - 1;
		if (s <= 1) {
			return str;
		}
		String mid = str.substring(1, a);
		return "" + str.charAt(a) + mid + str.charAt(0);
	}

	public String front3(String str) {

		if (str.length() <= 3) {
			for (int num = 0; num < 3; num++) {

			}
			return str + str + str;
		}
		String three = str.substring(0, 3);
		return three + three + three;
	}

	public String missingChar(String str, int n) {
		String missing = str.substring(0, n) + str.substring(n + 1);
		return missing;

	}

	public String backAround(String str) {
		int size = str.length();
		int less = size - 1;

		return str.substring(less, size) + str + str.substring(less, size);
	}

}
