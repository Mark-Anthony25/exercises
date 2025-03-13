import java.util.Random;

public class Mid {
    public static double area(double radius){
        double res = Math.PI * Math.pow(radius, 2);
        if (radius<0){
            return -1.0;
        }
        return res;


    }
    public static double area(double x, double y){

        double result = x * y;

        if (x<0 || y<0){
            return -1.0;
        }
        return result;
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            case 10 -> System.out.println("TEN");
            default -> System.out.println("OTHERS");
        }
    }


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                result += i;
            }

        }
        return result;
    }

    public static boolean isPalindrome (int number){
        int result = Math.abs(number);
        int temp = Math.abs(number);
        String reversedString = new StringBuilder(String.valueOf(result)).reverse().toString();
        result = Integer.parseInt(reversedString);
        return result == temp;
    }

    public static void printFactors(int number){
        if (number <1){
            System.out.println("Invalid Value");
        }

        for (int i = 1;i<= number ;i++ ){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }


    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverseNumber(number);
        int originalDigitCount = getDigitCount(number);

        while (reversedNumber != 0) {
            int digit = reversedNumber % 10;
            printNumberInWord(digit);
            reversedNumber /= 10;
        }

        int reversedDigitCount = getDigitCount(reverseNumber(number));
        for (int i = 0; i < (originalDigitCount - reversedDigitCount); i++) {
            printNumberInWord(0);
        }
    }
    public static int printSquareStar(int number){
        if (number<0){
            return -1;
        }
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            System.out.print("*");
        }
        return result;
    }


    public static String Lotto(int num1, int num2) {
        if (num1 < 1 || num1 > 60 || num2 < 1 || num2 > 60) {
            return "Invalid Value";
        }
        Random random = new Random();
        int result1 = random.nextInt(10) + 1;
        int result2 = random.nextInt(10) + 1;
        do {
            while (result1 == num1 && result2 == num2) {
                result1 = random.nextInt(10) + 1;
                result2 = random.nextInt(10) + 1;

            }

        } while (result1 == num1 && result2 == num2);
        return "The numbers are " + result1 + " and " + result2;



//        if (result1 == num1 && result2 == num2) {
//            return "You Win!!! The numbers are " + result1 + " and " + result2;
//        }
//        return "You Lose!!! The numbers are " + result1 + " and " + result2;
    }


    
}
