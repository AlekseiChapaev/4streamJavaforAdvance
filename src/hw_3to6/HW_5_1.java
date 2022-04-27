package hw_3to6;

public class HW_5_1 {

     public static double sumNumbers(double num1, double num2){

        return num1 + num2;
    }

    public static double minNumber(double num1, double num2){

        return num1 - num2;
    }

    public static double multNumbers(double num1, double num2){

        return num1 * num2;
    }

    public static double shareNumbers(double num1, double num2){

        return num1 / num2;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println(sumNumbers(a, b));
        System.out.println(minNumber(a, b));
        System.out.println(multNumbers(a, b));
        System.out.println(shareNumbers(a, b));



    }
}
