package hw_3to6;

public class HW_3_1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        int x = 5;
        int y = 5;

        if ((x + y) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        int z = 51;

        if (z > 10) {
            System.out.println(z + " больше 10");
        }
        if (z < 100) {
            System.out.println(z + " меньше 100");
        }
        if (z / 2 > 20.0) {
            System.out.println("результат деления " + z + " на 2 больше 20");
        }
        if (z <= 5 && z <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}