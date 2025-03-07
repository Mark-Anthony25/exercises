
public class Solution {

	public static void main(String[] args) {
		int y = diff21(22);
		System.out.println(y);
		String greet = "Hello, World";
		if (greet.contains("World")) {
			System.out.println("Hello, World");
		} else {
			System.out.println("hindi nagana");
		}
		// System.out.println("Hello, World!");
		// TODO Auto-generated method stub

	}

	public static int diff21(int n) {
		int dif = Math.abs(n - 21);

		if (dif <= 21) {
			return dif;
		} else if (n > 21) {
			return dif * 2;
		}
		return dif;
	}
}
