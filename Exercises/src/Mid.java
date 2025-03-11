
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
}
