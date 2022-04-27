package hw_3to6;

import java.util.Arrays;

public class HW_5 {
    public static void main(String[] args) {
        String taskNumber = "********************************\n\t\t\tTask # ";

        System.out.println(taskNumber + 1);
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

        System.out.println(taskNumber + 2);
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++){
            if(maxValue < array[i]){
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

        System.out.println(taskNumber + 3);
        int minValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(minValue > array[i]){
                minValue = array[i];
            }
        }
        System.out.println(minValue);

        System.out.println(taskNumber + 4);
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum2 = 0;
        int i = 0;
        for( ; i < array2.length; i++){
            sum2 += array2[i];
        }
        double mav = (double) sum2 / i;
        System.out.println(mav);

        System.out.println(taskNumber + 5);
        int sum3 = 0;
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int ii = 0; ii < array3.length; ii++){
            for (int j = 0; j < array3[ii].length; j++){
                sum3 = sum3 + array3[ii][j];
            }
        }
        System.out.println(sum3);

        System.out.println(taskNumber + 6);
        int maxValue2 = array3[0][0];
        for(int ii = 0; ii < array3.length; ii++){
            for (int j = 0; j < array3[ii].length; j++){
                if(maxValue2 < array3[ii][j]){
                    maxValue2 = array3[ii][j];
                }
            }
        }
        System.out.println(maxValue2);

        System.out.println(taskNumber + 7);
        int numbersOfValues = 0;
        for(int ii = 0; ii < array3.length; ii++ ){
            for(int j = 0; j < array3[ii].length; j++){
              if(Integer.MIN_VALUE <= array3[ii][j] && array3[ii][j] <= Integer.MAX_VALUE){
                    numbersOfValues++;
                }
            }
        }
        System.out.println("numbersOfIndex in array " + Arrays.deepToString(array3) + " is " + array3.length + " and numbersOfValues is " + numbersOfValues);
    }
}
