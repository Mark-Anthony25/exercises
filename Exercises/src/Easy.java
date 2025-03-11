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

	public static boolean isLeapYear (int year) {

		if(year>=1 && year <=9999){
			if((year % 4==0 && year % 100 !=0)|| (year % 400 == 0) ){
				return true;
			}
			else{
				return false;
			}
		}return false;

	}

	public static boolean areEqualByThreeDecimalPlaces(double one, double two){
		double result1 = (int) (one*1000);
		double result2 = (int) (two*1000);
		return result1 == result2;
	}
	public static boolean hasEqualSum(int num1, int num2, int num3){
		int result = num1 +num2;
		return result == num3;
	}
	public static void printYearsAndDays(long minutes){
		long year;
		long day;
		long hour;

		hour = minutes/60;
		day = hour/24;
		year = day/365;
		long days = day % 365;
		if (minutes<0){
			String str = "Invalid Value";
			System.out.println(str);
		}else{
			System.out.println(minutes+" min = "+year + " y and " +days + " d");
		}
	}

}
