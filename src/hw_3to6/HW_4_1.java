package hw_3to6;

public class HW_4_1 {

    public static void main(String[] args) {

        String line = "*****************************************\n\t\t\t\tTask #";

        HW_3_2.printLine(line, 1);

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum = " + sum);

        System.out.println(line + 2);

        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("maxValue = " + maxValue);

        System.out.println(line + 3);

        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("minValue = " + minValue);

        System.out.println(line + 4);

        int sumArray1 = 0;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array1.length; i++) {
            sumArray1 += array1[i];
        }
        System.out.println("averege = " + sumArray1 * 1.0 / array1.length);

        System.out.println(line + 5);

        int sum2 = 0;
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
            }
        }
        System.out.println("sum2 = " + sum2);

        System.out.println(line + 6);

        int maxValue2 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (maxValue2 < array2[i][j]) {
                    maxValue2 = array2[i][j];
                }
            }
        }
        System.out.println("maxValue2 = " + maxValue2);

        System.out.println(line + 7);

        int numbersOfElements = 0;
        for (int i = 0; i < array2.length; i++) {
            numbersOfElements += array2[i].length;
        }
        System.out.println(numbersOfElements);
    }
}
