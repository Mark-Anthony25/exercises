
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


    
}
